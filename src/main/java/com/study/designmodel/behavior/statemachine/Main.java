package com.study.designmodel.behavior.statemachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IPlayer player = new VedioPlayer();

        int i = -1;
        while ((i = sc.nextInt()) != -1){
            player.request(i);
        }
    }
}
