import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        int[] visited = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            graph.get(prerequisite[1]).add(prerequisite[0]);
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == 0) {
                if (!travel(i, visited, graph)) return false;
            }
        }
        return true;
    }

    private boolean travel(int course, int[] visited, List<ArrayList<Integer>> graph) {
        if (visited[course] == -1) return false;
        if (visited[course] == 1) return true;
        visited[course] = -1;
        for (int nextCourse : graph.get(course)) {
            if (!travel(nextCourse, visited, graph)) return false;
        }
        visited[course] = 1;
        return true;
    }
}
