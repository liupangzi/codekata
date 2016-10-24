/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* helper(struct ListNode* head, struct ListNode* newHead) {
    if (head == NULL)
        return newHead;
    struct ListNode* next = head->next;
    head->next = newHead;
    return helper(next, head);
}

struct ListNode* reverseList(struct ListNode* head) {
    return helper(head, NULL);
}
