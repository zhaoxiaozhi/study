package com.study.arethmetic.javaguide.stack;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class StackToQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    //当执行Push操作，将元素添加到stack1
    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        //如果两个队列都为空则抛出异常,说明用户没有push进任何元素
        if (stack1.empty() && stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        //如果stack2不为空直接对stack2执行pop操作
        //如果stack2不为空直接对stack2进行操作
        if (stack2.empty()){
            while (!stack1.empty()){
                //将stack1的元素按后进先出push到stack2里面
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


}
