package com.vinci.behavioral.state;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class StateMain {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handle();
    }
}
