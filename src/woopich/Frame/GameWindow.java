package woopich.Frame;

import javax.swing.JFrame;

public class GameWindow {

    public GameWindow(){
        JFrame frame = new JFrame("Game window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,740);
        frame.setResizable(false);
        frame.add(new GameScreen());
        frame.setVisible(true);

    }
}