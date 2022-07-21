package com.vinci.behavioral.state;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle();
}
