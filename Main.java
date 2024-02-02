import controller.GameController;
import view.GameFrame;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameFrame gameFrame = new GameFrame();
            GameController gameController = new GameController(gameFrame);
            gameController.startGame();
        });
    }
}
