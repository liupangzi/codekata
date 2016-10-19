/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

bool isMirror(struct TreeNode* left, struct TreeNode* right) {
    if (left == NULL || right == NULL) return left == right;
    return left->val == right->val && isMirror(left->left, right->right) && isMirror(right->left, left->right);
}

bool isSymmetric(struct TreeNode* root) {
    return root == NULL || isMirror(root->left, root->right);
}
