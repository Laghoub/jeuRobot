package controller;

import model.Robot;
import view.GameFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController {

    private GameFrame gameFrame;

    public GameController(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
        initController();
    }

    private void initController() {
        gameFrame.getExecuteButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = gameFrame.getCodeTextArea().getText();
                Robot robot = new Robot(code);
                robot.executeCode();

                gameFrame.getMessageLabel().setText(robot.executeCode());
            }
        });
    }

    public void startGame() {
        gameFrame.setVisible(true);
    }
}
