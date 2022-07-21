package com.vinci.behavioral.command.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class Controller {


    private List<IAction> actionList = new ArrayList<>();

    public Controller() {
    }

    public void addAction(IAction action) {
        this.actionList.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void executes() {
        for (IAction action : this.actionList) {
            action.execute();
        }
    }
}
