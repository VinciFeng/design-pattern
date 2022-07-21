package com.vinci.behavioral.observer;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class ObserverMain {
    public static void main(String[] args) {
        ConcreteSubject<String> subject = new ConcreteSubject<>();
        ConcreteObserver<String> observer = new ConcreteObserver<>();
        subject.attach(observer);
        subject.notify("hello");
    }
}
