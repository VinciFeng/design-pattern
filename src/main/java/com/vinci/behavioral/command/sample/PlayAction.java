package com.vinci.behavioral.command.sample;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class PlayAction implements IAction {

    private GPlayer gPlayer;

    public PlayAction(GPlayer gPlayer) {
        this.gPlayer = gPlayer;
    }

    @Override
    public void execute() {
        this.gPlayer.play();
    }
}
