import java.util.*;

class Solution {
    private HashMap<Integer, Employee> record = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) record.put(employee.id, employee);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(id);

        int result = 0;
        while (queue.size() > 0) {
            result += record.get(queue.peek()).importance;
            queue.addAll(record.get(queue.poll()).subordinates);
        }
        return result;
    }
}
