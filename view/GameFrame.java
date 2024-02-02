package view;

import javax.swing.*;

public class GameFrame extends JFrame {

    private JTextArea codeTextArea;
    private JButton executeButton;
    private JLabel messageLabel;

    public GameFrame() {
        initUI();
    }

    private void initUI() {
        setTitle("Mon Jeu de Programmation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        codeTextArea = new JTextArea();
        executeButton = new JButton("Exécuter");
        messageLabel = new JLabel("Entrez le code de votre robot");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(new JScrollPane(codeTextArea));
        mainPanel.add(executeButton);
        mainPanel.add(messageLabel);

        add(mainPanel);
    }

    public JButton getExecuteButton() {
        return executeButton;
    }

    public JTextArea getCodeTextArea() {
        return codeTextArea;
    }

    public JLabel getMessageLabel() {
        return messageLabel;
    }
}
