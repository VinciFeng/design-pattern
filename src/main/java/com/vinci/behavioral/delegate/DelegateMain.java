package com.vinci.behavioral.delegate;

/**
 * 委派模式
 * @author Vinci
 * @date 2022/07/19
 */
public class DelegateMain {

    public static void main(String[] args) {
        new Boss().command("编码", new Leader());
    }
}