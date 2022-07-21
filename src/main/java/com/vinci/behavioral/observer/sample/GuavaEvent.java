package com.vinci.behavioral.observer.sample;

import com.google.common.eventbus.Subscribe;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class GuavaEvent {
    @Subscribe
    public void subscribe(String message) {
        System.out.println("执行subscribe方法，传入消息为：" + message);
    }
}
