package com.vinci.behavioral.command;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class Receiver {

    public void action() {
        System.out.println(this.getClass().getSimpleName() + "执行具体操作");
    }
}
