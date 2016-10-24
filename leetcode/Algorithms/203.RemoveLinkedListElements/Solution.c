/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* removeElements(struct ListNode* head, int val) {
    if (head == NULL) return NULL;
    head->next = removeElements(head->next, val);
    return head->val == val ? head->next : head;
}
