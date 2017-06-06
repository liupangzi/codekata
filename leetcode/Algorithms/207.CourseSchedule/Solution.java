import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] visited = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            if (!map.containsKey(prerequisite[1])) map.put(prerequisite[1], new ArrayList<>());
            map.get(prerequisite[1]).add(prerequisite[0]);
        }

        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == 0) {
                if (!travel(i, visited, map)) return false;
            }
        }
        return true;
    }

    private boolean travel(int course, int[] visited, HashMap<Integer, ArrayList<Integer>> map) {
        if (visited[course] == -1) return false;
        if (visited[course] == 1) return true;
        visited[course] = -1;
        ArrayList<Integer> tmp = map.get(course);
        if (tmp != null) {
            for (int nextCourse : tmp) {
                if (!travel(nextCourse, visited, map)) return false;
            }
        }
        visited[course] = 1;
        return true;
    }
}
