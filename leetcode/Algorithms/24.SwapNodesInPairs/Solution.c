/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* swapPairs(struct ListNode* head) {
    if (head == NULL || head->next == NULL) return head;

    struct ListNode* listNode = head->next;
    head->next = swapPairs(listNode->next);
    listNode->next = head;

    return listNode;
}
