package woopich.Frame;

import woopich.Unit.Sprite;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.image.BufferedImage;


public class GameScreen extends JPanel implements ActionListener{

    public static Sprite sprite;
    public static Background background;

    //Буферное изображение
    public static BufferedImage image;
    private Graphics2D g;


    public GameScreen(){
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
        image = new BufferedImage(1280, 720, BufferedImage.TYPE_INT_RGB);
        sprite = new Sprite();
        background = new Background();
        g = (Graphics2D) image.getGraphics();
        Timer timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(background.getBack(), background.getX(), background.getY(), this);
        g2d.drawImage(sprite.getImage(), sprite.getX(), sprite.getY(), 207,227,this);
        sprite.update();
     //   background.update();
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        sprite.move();
        background.move();
        repaint();
    }

    private class TAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            sprite.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            sprite.keyPressed(e);
        }
    }

    private void gameDraw() {

        Graphics g2 = this.getGraphics();
        g2.drawImage(image,0,0,null);
        g2.dispose();
    }
}