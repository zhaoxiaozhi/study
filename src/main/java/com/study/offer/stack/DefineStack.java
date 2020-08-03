package com.study.offer.stack;

import java.util.Stack;

public class DefineStack {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack = new Stack<>(); //辅助栈

    public void push(int node){

        stack.push(node);
        if (minStack.empty()){
            minStack.push(node);
        }else {
            minStack.push(node > minStack.peek() ? minStack.peek() : node);
        }
    }

    public void pop(){
        if (!stack.empty()){
            stack.pop();
            minStack.pop();
        }
    }

    public int top(){
        return stack.peek();
    }

    public int min(){
        return minStack.peek();
    }

}
