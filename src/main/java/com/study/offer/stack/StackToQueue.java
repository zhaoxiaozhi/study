package com.study.offer.stack;

import java.util.Stack;

public class StackToQueue {


    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if (stack2.isEmpty()){ //为空时将栈1的元素“倒进去”
         while (!stack2.empty()){
             stack2.push(stack1.pop());
         }
        }
        return stack2.pop();

    }
}
