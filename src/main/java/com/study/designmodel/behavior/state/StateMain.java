package com.study.designmodel.behavior.state;


import java.util.Scanner;

/**
 * 允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
 * 状态模式的目的是为了把上述一大串if...else...的逻辑给分拆到不同的状态类中，使得将来增加状态比较容易。
 */
public class StateMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BotContext bot = new BotContext();
        for (;;) {
            System.out.print("> ");
            String input = scanner.nextLine();
            String output = bot.chat(input);
            System.out.println(output.isEmpty() ? "(no reply)" : "< " + output);
        }
    }
}
