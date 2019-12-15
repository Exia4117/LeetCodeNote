import java.util.HashMap;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 *
 * https://leetcode.com/problems/copy-list-with-random-pointer/description/
 *
 * algorithms
 * Medium (30.43%)
 * Likes:    2219
 * Dislikes: 542
 * Total Accepted:    318.6K
 * Total Submissions: 1M
 * Testcase Example:  '{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}'
 *
 * A linked list is given such that each node contains an additional random
 * pointer which could point to any node in the list or null.
 * 
 * Return a deep copy of the list.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * 
 * Input:
 * 
 * {"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
 * 
 * Explanation:
 * Node 1's value is 1, both of its next and random pointer points to Node 2.
 * Node 2's value is 2, its next pointer points to null and its random pointer
 * points to itself.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * You must return the copy of the given head as a reference to the cloned
 * list.
 * 
 * 
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        // HashMap<Node, Node> help = new HashMap<Node, Node>();
        // Node cur = head;
        // while (cur != null) {
        // help.put(cur, new Node());
        // cur = cur.next;
        // }
        // cur = head;
        // while (cur != null) {
        // help.get(cur).val = cur.val;
        // help.get(cur).next = help.get(cur.next);
        // help.get(cur).random = help.get(cur.random);
        // cur = cur.next;
        // }
        // return help.get(head);
        if (head == null) {
            return head;
        }
        Node cur = head;
        while (cur != null) {
            Node temp = new Node(cur.val, null, null);
            temp.next = cur.next;
            cur.next = temp;
            cur = cur.next.next;
        }

        cur = head;
        Node copy = null;
        while (cur != null) {
            copy = cur.next;
            copy.random = cur.random == null ? null : cur.random.next;
            cur = cur.next.next;
        }
        Node res = head.next;
        Node next = null;
        cur = head;
        while (cur != null) {
            next = cur.next.next;
            copy = cur.next;
            cur.next = next;
            copy.next = cur.next == null ? null : cur.next.next;
            cur = next;
        }

        return res;
    }
}
// @lc code=end
