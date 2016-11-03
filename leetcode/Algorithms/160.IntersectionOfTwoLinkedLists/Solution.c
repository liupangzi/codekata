/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    if (headA == NULL || headB == NULL) return NULL;

    struct ListNode *tmp_a = headA, *tmp_b = headB;
    while (tmp_a != tmp_b) {
        tmp_a = tmp_a == NULL ? headB : tmp_a->next;
        tmp_b = tmp_b == NULL ? headA : tmp_b->next;
    }

    return tmp_a;
}
