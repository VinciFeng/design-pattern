package com.vinci.behavioral.delegate;

/**
 * @author Vinci
 * @date 2022/07/19
 */
public class Boss {

    public void command(String task, Leader leader) {
        leader.doing(task);
    }
}
