import java.util.Stack;

/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 *
 * https://leetcode.com/problems/min-stack/description/
 *
 * algorithms
 * Easy (39.67%)
 * Likes:    2311
 * Dislikes: 248
 * Total Accepted:    375.7K
 * Total Submissions: 945K
 * Testcase Example:  '["MinStack","push","push","push","getMin","pop","top","getMin"]\n[[],[-2],[0],[-3],[],[],[],[]]'
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * 
 * 
 * 
 * Example:
 * 
 * 
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * 
 * 
 * 
 * 
 */

// @lc code=start
class MinStack {
    private Stack<Integer> StackData;
    private Stack<Integer> StackMin;

    /** initialize your data structure here. */
    public MinStack() {
        StackData = new Stack<>();
        StackMin = new Stack<>();
    }

    public void push(int x) {
        StackData.push(x);
        if (StackMin.empty()) {
            StackMin.push(x);
        } else if (x < getMin()) {
            StackMin.push(x);
        } else {
            StackMin.push(StackMin.peek());
        }
    }

    public void pop() {
        StackData.pop();
        StackMin.pop();
    }

    public int top() {
        return StackData.peek();
    }

    public int getMin() {
        return StackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */
// @lc code=end
