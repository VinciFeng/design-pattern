package com.vinci.behavioral.command.sample;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class PauseAction implements IAction {

    private GPlayer gPlayer;

    public PauseAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        this.gPlayer.pause();
    }
}
