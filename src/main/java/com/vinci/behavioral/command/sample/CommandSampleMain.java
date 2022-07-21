package com.vinci.behavioral.command.sample;

/**
 * @author Vinci
 * @date 2022/07/21
 */
public class CommandSampleMain {

    public static void main(String[] args) {
        GPlayer player = new GPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        controller.addAction(new PauseAction(player));
        controller.addAction(new PlayAction(player));
        controller.addAction(new SpeedAction(player));
        controller.addAction(new StopAction(player));
        controller.executes();
    }
}
