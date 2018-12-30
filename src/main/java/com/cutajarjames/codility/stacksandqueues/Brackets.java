package com.cutajarjames.codility.stacksandqueues;

import java.util.Stack;

/**
 * This is the solution for Stacks And Queues > Brackets
 * <p>
 * This is marked as PAINLESS difficulty
 */
public class Brackets {
    public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return 0;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return 0;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return 0;
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new Brackets().solution("()[]{}()[]{}"));
        System.out.println(new Brackets().solution("()]]"));
    }
}
