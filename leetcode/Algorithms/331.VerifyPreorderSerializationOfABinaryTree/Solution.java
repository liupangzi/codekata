public class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] tree = preorder.split(",");
        int result = tree[0].equals("#") ? 0 : 2;
        for (int i = 1; i < tree.length; i++) {
            if (result == 0) return false;
            result += tree[i].equals("#") ? -1 : 1;
        }
        return result == 0;
    }
}
