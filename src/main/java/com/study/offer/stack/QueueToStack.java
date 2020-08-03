package com.study.offer.stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueToStack {

    Queue<Integer> q1,q2;
    int topValue;

    public QueueToStack(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        topValue = 0;
    }

    public void push(int x){
        if (!q1.isEmpty()){
            q1.add(x);
        }else {
            q2.add(x);
        }
        topValue = x;
    }

    public int pop(){

        int temp=0;
        while(!q1.isEmpty()){  //q1不空
            temp=q1.poll();
            if(q1.isEmpty())
                return temp;
            q2.add(temp);
            topValue=temp;
        }
        while(!q2.isEmpty()){  //q1不空
            temp=q2.poll();
            if(!q2.isEmpty()){
                q1.add(temp);
                topValue=temp;
            }
        }
        return temp;
    }

    public int top() {
        return topValue;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
