package woopich.Unit;

import woopich.Frame.Background;
import woopich.Frame.GameScreen;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Sprite implements Runnable
{
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private int i = 0;
    private int j = 0;
    private int i1 = 0;
    private int j1 = 0;
    private int animR = 0;
    private int animL = 0;

    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;
    private boolean jump;
    private boolean shift;
    private boolean fall;
    private boolean nonLeft = false;
    private boolean nonRight = true;
    private boolean onceJ = true;
    private int oldY = -500;



    public Sprite()
    {
        ImageIcon imageIcon = new ImageIcon("res/Idle/Idle (1).png");
        image = imageIcon.getImage();
        x = 20;
        y = 473;
    }

    public void update()
    {
        if (right && !jump && !fall)  {
            nonRight = false;
            nonLeft = false;
            i++;
            switch (i)
            {
                case 5:  { image = new ImageIcon("res/Walk/Right/Walk (1).png").getImage(); break;}
                case 10: { image = new ImageIcon("res/Walk/Right/Walk (2).png").getImage(); break;}
                case 15: { image = new ImageIcon("res/Walk/Right/Walk (3).png").getImage(); break;}
                case 20: { image = new ImageIcon("res/Walk/Right/Walk (4).png").getImage(); break;}
                case 25: { image = new ImageIcon("res/Walk/Right/Walk (5).png").getImage(); break;}
                case 30: { image = new ImageIcon("res/Walk/Right/Walk (6).png").getImage(); break;}
                case 35: { image = new ImageIcon("res/Walk/Right/Walk (7).png").getImage(); break;}
                case 40: { image = new ImageIcon("res/Walk/Right/Walk (8).png").getImage(); break;}
                case 45: { image = new ImageIcon("res/Walk/Right/Walk (9).png").getImage(); break;}
                case 50: { image = new ImageIcon("res/Walk/Right/Walk (10).png").getImage(); break;}
                case 55: { image = new ImageIcon("res/Walk/Right/Walk (11).png").getImage(); break;}
                case 60: { image = new ImageIcon("res/Walk/Right/Walk (12).png").getImage(); break;}
                case 65: { image = new ImageIcon("res/Walk/Right/Walk (13).png").getImage(); break;}
                case 70: { image = new ImageIcon("res/Walk/Right/Walk (14).png").getImage(); break;}
                case 75: { image = new ImageIcon("res/Walk/Right/Walk (15).png").getImage(); break;}
                case 80: { image = new ImageIcon("res/Walk/Right/Walk (16).png").getImage(); break;}
                case 85: { image = new ImageIcon("res/Walk/Right/Walk (17).png").getImage(); break;}
                case 90: { image = new ImageIcon("res/Walk/Right/Walk (18).png").getImage(); break;}
                case 95: { image = new ImageIcon("res/Walk/Right/Walk (19).png").getImage(); break;}
                case 100: { image = new ImageIcon("res/Walk/Right/Walk (20).png").getImage();i = 0; break;}
            }
            dx = 1;
            if (shift){
                i = 0;
                i1++;
                switch (i1)
                {
                    case 5:  { image = new ImageIcon("res/Run/Right/Run (1).png").getImage(); break;}
                    case 10: { image = new ImageIcon("res/Run/Right/Run (2).png").getImage(); break;}
                    case 15: { image = new ImageIcon("res/Run/Right/Run (3).png").getImage(); break;}
                    case 20: { image = new ImageIcon("res/Run/Right/Run (4).png").getImage(); break;}
                    case 25: { image = new ImageIcon("res/Run/Right/Run (5).png").getImage(); break;}
                    case 30: { image = new ImageIcon("res/Run/Right/Run (6).png").getImage(); break;}
                    case 35: { image = new ImageIcon("res/Run/Right/Run (7).png").getImage(); break;}
                    case 40: { image = new ImageIcon("res/Run/Right/Run (8).png").getImage(); break;}
                    case 45: { image = new ImageIcon("res/Run/Right/Run (9).png").getImage(); break;}
                    case 50: { image = new ImageIcon("res/Run/Right/Run (10).png").getImage(); break;}
                    case 55: { image = new ImageIcon("res/Run/Right/Run (11).png").getImage(); break;}
                    case 60: { image = new ImageIcon("res/Run/Right/Run (12).png").getImage(); break;}
                    case 65: { image = new ImageIcon("res/Run/Right/Run (13).png").getImage(); break;}
                    case 70: { image = new ImageIcon("res/Run/Right/Run (14).png").getImage(); break;}
                    case 75: { image = new ImageIcon("res/Run/Right/Run (15).png").getImage(); break;}
                    case 80: { image = new ImageIcon("res/Run/Right/Run (16).png").getImage(); break;}
                    case 85: { image = new ImageIcon("res/Run/Right/Run (17).png").getImage(); break;}
                    case 90: { image = new ImageIcon("res/Run/Right/Run (18).png").getImage(); break;}
                    case 95: { image = new ImageIcon("res/Run/Right/Run (19).png").getImage(); break;}
                    case 100: { image = new ImageIcon("res/Run/Right/Run (20).png").getImage();i1 = 0; break;}
                }
                dx = 3;
            }
        } else if (nonRight && !jump && !fall){
            nonLeft = false;
            i = 0;
            j = 0;
            i1 = 0;
            j1 = 0;
            switch (animR)
            {
                case 0: { image = new ImageIcon("res/Idle/Idle (1).png").getImage(); break;}
                case 15: { image = new ImageIcon("res/Idle/Idle (2).png").getImage(); break;}
                case 30: { image = new ImageIcon("res/Idle/Idle (3).png").getImage(); break;}
                case 45: { image = new ImageIcon("res/Idle/Idle (4).png").getImage(); break;}
                case 60: { image = new ImageIcon("res/Idle/Idle (5).png").getImage(); break;}
                case 75: { image = new ImageIcon("res/Idle/Idle (6).png").getImage(); break;}
                case 90: { image = new ImageIcon("res/Idle/Idle (6).png").getImage(); break;}
                case 105: { image = new ImageIcon("res/Idle/Idle (5).png").getImage(); break; }
                case 120: { image = new ImageIcon("res/Idle/Idle (4).png").getImage(); break;}
                case 135: { image = new ImageIcon("res/Idle/Idle (3).png").getImage(); break;}
                case 150: { image = new ImageIcon("res/Idle/Idle (2).png").getImage(); break;}
                case 165: { image = new ImageIcon("res/Idle/Idle (1).png").getImage(); animR = 0; break;}
            /*    case 96: { image = new ImageIcon("res/Idle/Right/Idle (13).png").getImage(); break;}
                case 104: { image = new ImageIcon("res/Idle/Right/Idle (14).png").getImage(); break;}
                case 112: { image = new ImageIcon("res/Idle/Right/Idle (15).png").getImage(); break;}
                case 120: { image = new ImageIcon("res/Idle/Right/Idle (16).png").getImage(); animR = 0; break;}*/
            }
            animR++;
            dx = 0;
        }

        if (left && !jump && !fall) {
            nonRight = false;
            nonLeft = false;
            j++;
            switch (j)
            {
                case 5:  { image = new ImageIcon("res/Walk/Left/Walk (1).png").getImage(); break;}
                case 10: { image = new ImageIcon("res/Walk/Left/Walk (2).png").getImage(); break;}
                case 15: { image = new ImageIcon("res/Walk/Left/Walk (3).png").getImage(); break;}
                case 20: { image = new ImageIcon("res/Walk/Left/Walk (4).png").getImage(); break;}
                case 25: { image = new ImageIcon("res/Walk/Left/Walk (5).png").getImage(); break;}
                case 30: { image = new ImageIcon("res/Walk/Left/Walk (6).png").getImage(); break;}
                case 35: { image = new ImageIcon("res/Walk/Left/Walk (7).png").getImage(); break;}
                case 40: { image = new ImageIcon("res/Walk/Left/Walk (8).png").getImage(); break;}
                case 45: { image = new ImageIcon("res/Walk/Left/Walk (9).png").getImage(); break;}
                case 50: { image = new ImageIcon("res/Walk/Left/Walk (10).png").getImage(); break;}
                case 55: { image = new ImageIcon("res/Walk/Left/Walk (11).png").getImage(); break;}
                case 60: { image = new ImageIcon("res/Walk/Left/Walk (12).png").getImage(); break;}
                case 65: { image = new ImageIcon("res/Walk/Left/Walk (13).png").getImage(); break;}
                case 70: { image = new ImageIcon("res/Walk/Left/Walk (14).png").getImage(); break;}
                case 75: { image = new ImageIcon("res/Walk/Left/Walk (15).png").getImage(); break;}
                case 80: { image = new ImageIcon("res/Walk/Left/Walk (16).png").getImage(); break;}
                case 85: { image = new ImageIcon("res/Walk/Left/Walk (17).png").getImage(); break;}
                case 90: { image = new ImageIcon("res/Walk/Left/Walk (18).png").getImage(); break;}
                case 95: { image = new ImageIcon("res/Walk/Left/Walk (19).png").getImage(); break;}
                case 100: { image = new ImageIcon("res/Walk/Left/Walk (20).png").getImage(); j = 0; break;}
            }
            dx = -1;
            if (shift){
                j = 0;
                j1++;
                switch (j1)
                {
                    case 5:  { image = new ImageIcon("res/Run/Left/Run (1).png").getImage(); break;}
                    case 10: { image = new ImageIcon("res/Run/Left/Run (2).png").getImage(); break;}
                    case 15: { image = new ImageIcon("res/Run/Left/Run (3).png").getImage(); break;}
                    case 20: { image = new ImageIcon("res/Run/Left/Run (4).png").getImage(); break;}
                    case 25: { image = new ImageIcon("res/Run/Left/Run (5).png").getImage(); break;}
                    case 30: { image = new ImageIcon("res/Run/Left/Run (6).png").getImage(); break;}
                    case 35: { image = new ImageIcon("res/Run/Left/Run (7).png").getImage(); break;}
                    case 40: { image = new ImageIcon("res/Run/Left/Run (8).png").getImage(); break;}
                    case 45: { image = new ImageIcon("res/Run/Left/Run (9).png").getImage(); break;}
                    case 50: { image = new ImageIcon("res/Run/Left/Run (10).png").getImage(); break;}
                    case 55: { image = new ImageIcon("res/Run/Left/Run (11).png").getImage(); break;}
                    case 60: { image = new ImageIcon("res/Run/Left/Run (12).png").getImage(); break;}
                    case 65: { image = new ImageIcon("res/Run/Left/Run (13).png").getImage(); break;}
                    case 70: { image = new ImageIcon("res/Run/Left/Run (14).png").getImage(); break;}
                    case 75: { image = new ImageIcon("res/Run/Left/Run (15).png").getImage(); break;}
                    case 80: { image = new ImageIcon("res/Run/Left/Run (16).png").getImage(); break;}
                    case 85: { image = new ImageIcon("res/Run/Left/Run (17).png").getImage(); break;}
                    case 90: { image = new ImageIcon("res/Run/Left/Run (18).png").getImage(); break;}
                    case 95: { image = new ImageIcon("res/Run/Left/Run (19).png").getImage(); break;}
                    case 100: { image = new ImageIcon("res/Run/Left/Run (20).png").getImage();j1 = 0; break;}
                }
                dx = -3;
            }
        } else if (nonLeft && !jump && !fall){
            nonRight = false;
            i = 0;
            j = 0;
            i1 = 0;
            j1 = 0;
            switch (animL)
            {
                case 0: { image = new ImageIcon("res/Idle/Left/Idle (1).png").getImage(); break;}
                case 8: { image = new ImageIcon("res/Idle/Left/Idle (2).png").getImage(); break;}
                case 16: { image = new ImageIcon("res/Idle/Left/Idle (3).png").getImage(); break;}
                case 24: { image = new ImageIcon("res/Idle/Left/Idle (4).png").getImage(); break;}
                case 32: { image = new ImageIcon("res/Idle/Left/Idle (5).png").getImage(); break;}
                case 40: { image = new ImageIcon("res/Idle/Left/Idle (6).png").getImage(); break;}
                case 48: { image = new ImageIcon("res/Idle/Left/Idle (7).png").getImage(); break;}
                case 56: { image = new ImageIcon("res/Idle/Left/Idle (8).png").getImage(); break; }
                case 64: { image = new ImageIcon("res/Idle/Left/Idle (9).png").getImage(); break;}
                case 72: { image = new ImageIcon("res/Idle/Left/Idle (10).png").getImage(); break;}
                case 80: { image = new ImageIcon("res/Idle/Left/Idle (11).png").getImage(); break;}
                case 88: { image = new ImageIcon("res/Idle/Left/Idle (12).png").getImage(); break;}
                case 96: { image = new ImageIcon("res/Idle/Left/Idle (13).png").getImage(); break;}
                case 104: { image = new ImageIcon("res/Idle/Left/Idle (14).png").getImage(); break;}
                case 112: { image = new ImageIcon("res/Idle/Left/Idle (15).png").getImage(); break;}
                case 120: { image = new ImageIcon("res/Idle/Left/Idle (16).png").getImage(); animL = 0; break;}
            }
            animL++;
            dx = 0;
        }

        if (jump) {
            if (oldY == -500) {
                oldY = y;
            }
            if (oldY - 200 <= y) {
                dy = -4;
                if (nonRight || right) {
                    nonLeft = false;
                    if (y == oldY - 12) {image = new ImageIcon("res/Jump/Right/Jump (1).png").getImage();}
                    if (y == oldY - 24) {image = new ImageIcon("res/Jump/Right/Jump (2).png").getImage();}
                    if (y == oldY - 36) {image = new ImageIcon("res/Jump/Right/Jump (3).png").getImage();}
                    if (y == oldY - 48) {image = new ImageIcon("res/Jump/Right/Jump (4).png").getImage();}
                    if (y == oldY - 60) {image = new ImageIcon("res/Jump/Right/Jump (5).png").getImage();}
                    if (y == oldY - 72) {image = new ImageIcon("res/Jump/Right/Jump (6).png").getImage();}
                    if (y == oldY - 84) {image = new ImageIcon("res/Jump/Right/Jump (7).png").getImage();}
                    if (y == oldY - 96) {image = new ImageIcon("res/Jump/Right/Jump (8).png").getImage();}
                    if (y == oldY - 108) {image = new ImageIcon("res/Jump/Right/Jump (9).png").getImage();}
                    if (y == oldY - 120) {image = new ImageIcon("res/Jump/Right/Jump (10).png").getImage();}
                    if (y == oldY - 132) {image = new ImageIcon("res/Jump/Right/Jump (11).png").getImage();}
                    if (y == oldY - 144) {image = new ImageIcon("res/Jump/Right/Jump (12).png").getImage();}
                    if (y == oldY - 156) {image = new ImageIcon("res/Jump/Right/Jump (13).png").getImage();}
                    if (y == oldY - 168) {image = new ImageIcon("res/Jump/Right/Jump (14).png").getImage();}
                    if (y == oldY - 180) {image = new ImageIcon("res/Jump/Right/Jump (15).png").getImage();}

                }
                if (nonLeft || left) {
                    nonRight = false;
                    if (y == oldY - 12) {image = new ImageIcon("res/Jump/Left/Jump (1).png").getImage();}
                    if (y == oldY - 24) {image = new ImageIcon("res/Jump/Left/Jump (2).png").getImage();}
                    if (y == oldY - 36) {image = new ImageIcon("res/Jump/Left/Jump (3).png").getImage();}
                    if (y == oldY - 48) {image = new ImageIcon("res/Jump/Left/Jump (4).png").getImage();}
                    if (y == oldY - 60) {image = new ImageIcon("res/Jump/Left/Jump (5).png").getImage();}
                    if (y == oldY - 72) {image = new ImageIcon("res/Jump/Left/Jump (6).png").getImage();}
                    if (y == oldY - 84) {image = new ImageIcon("res/Jump/Left/Jump (7).png").getImage();}
                    if (y == oldY - 96) {image = new ImageIcon("res/Jump/Left/Jump (8).png").getImage();}
                    if (y == oldY - 108) {image = new ImageIcon("res/Jump/Left/Jump (9).png").getImage();}
                    if (y == oldY - 120) {image = new ImageIcon("res/Jump/Left/Jump (10).png").getImage();}
                    if (y == oldY - 132) {image = new ImageIcon("res/Jump/Left/Jump (11).png").getImage();}
                    if (y == oldY - 144) {image = new ImageIcon("res/Jump/Left/Jump (12).png").getImage();}
                    if (y == oldY - 156) {image = new ImageIcon("res/Jump/Left/Jump (13).png").getImage();}
                    if (y == oldY - 168) {image = new ImageIcon("res/Jump/Left/Jump (14).png").getImage();}
                    if (y == oldY - 180) {image = new ImageIcon("res/Jump/Left/Jump (15).png").getImage();}
                }
            } else {
                fall = true;
            }
        }
        if (fall) {
            if (oldY != y) {
                dy = 2;
                if (nonRight || right) {
                    nonLeft = false;
                    if (y == oldY - 180) {image = new ImageIcon("res/Jump/Right/Jump (16).png").getImage();}
                    if (y == oldY - 168) {image = new ImageIcon("res/Jump/Right/Jump (17).png").getImage();}
                    if (y == oldY - 156) {image = new ImageIcon("res/Jump/Right/Jump (18).png").getImage();}
                    if (y == oldY - 144) {image = new ImageIcon("res/Jump/Right/Jump (19).png").getImage();}
                    if (y == oldY - 132) {image = new ImageIcon("res/Jump/Right/Jump (20).png").getImage();}
                    if (y == oldY - 120) {image = new ImageIcon("res/Jump/Right/Jump (21).png").getImage();}
                    if (y == oldY - 108) {image = new ImageIcon("res/Jump/Right/Jump (22).png").getImage();}
                    if (y == oldY - 96) {image = new ImageIcon("res/Jump/Right/Jump (23).png").getImage();}
                    if (y == oldY - 84) {image = new ImageIcon("res/Jump/Right/Jump (24).png").getImage();}
                    if (y == oldY - 72) {image = new ImageIcon("res/Jump/Right/Jump (25).png").getImage();}
                    if (y == oldY - 60) {image = new ImageIcon("res/Jump/Right/Jump (26).png").getImage();}
                    if (y == oldY - 48) {image = new ImageIcon("res/Jump/Right/Jump (27).png").getImage();}
                    if (y == oldY - 36) {image = new ImageIcon("res/Jump/Right/Jump (28).png").getImage();}
                    if (y == oldY - 24) {image = new ImageIcon("res/Jump/Right/Jump (29).png").getImage();}
                    if (y == oldY - 12) {image = new ImageIcon("res/Jump/Right/Jump (30).png").getImage();}
                }
                if (nonLeft || left) {
                    nonRight = false;
                    if (y == oldY - 180) {image = new ImageIcon("res/Jump/Left/Jump (16).png").getImage();}
                    if (y == oldY - 168) {image = new ImageIcon("res/Jump/Left/Jump (17).png").getImage();}
                    if (y == oldY - 156) {image = new ImageIcon("res/Jump/Left/Jump (18).png").getImage();}
                    if (y == oldY - 144) {image = new ImageIcon("res/Jump/Left/Jump (19).png").getImage();}
                    if (y == oldY - 132) {image = new ImageIcon("res/Jump/Left/Jump (20).png").getImage();}
                    if (y == oldY - 120) {image = new ImageIcon("res/Jump/Left/Jump (21).png").getImage();}
                    if (y == oldY - 108) {image = new ImageIcon("res/Jump/Left/Jump (22).png").getImage();}
                    if (y == oldY - 96) {image = new ImageIcon("res/Jump/Left/Jump (23).png").getImage();}
                    if (y == oldY - 84) {image = new ImageIcon("res/Jump/Left/Jump (24).png").getImage();}
                    if (y == oldY - 72) {image = new ImageIcon("res/Jump/Left/Jump (25).png").getImage();}
                    if (y == oldY - 60) {image = new ImageIcon("res/Jump/Left/Jump (26).png").getImage();}
                    if (y == oldY - 48) {image = new ImageIcon("res/Jump/Left/Jump (27).png").getImage();}
                    if (y == oldY - 36) {image = new ImageIcon("res/Jump/Left/Jump (28).png").getImage();}
                    if (y == oldY - 24) {image = new ImageIcon("res/Jump/Left/Jump (29).png").getImage();}
                    if (y == oldY - 12) {image = new ImageIcon("res/Jump/Left/Jump (30).png").getImage();}
                }
            } else {
                dy = 0;
                oldY = -500;
                onceJ = true;
                fall = false;
            }
        }
        if (up) {
       //     dy = -1;
        }
        if (down) {
       //     dy = 1;
        }


    }

    public void move()
    {
        if (x + dx >= 0 && x + 207 + dx <= 1280) {
            if (GameScreen.background.getX() < 0 && GameScreen.background.getX() + GameScreen.background.getBack().getWidth(null) < 2560) {
                GameScreen.background.setX(0);
            } else if (GameScreen.background.getX() == 0) {
                if (x + dx < 1080) {
                    x += dx;
                } else {
                    GameScreen.background.setdx(-dx);
                    dx = 0;
                }
            } /*else {
                GameScreen.background.setdx(0);
                x += dx;
            }*/
        }
        if (y + 227 + dy <= 700 && y + dy >= 0) {
            y += dy;
        }
    }

    public int getX()
    {
        return x;
    }

    public int getDx()
    {
        return dx;
    }

    public int getY()
    {
        return y;
    }

    public Image getImage()
    {
        return image;
    }

    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE){
            if (onceJ) {
                jump = true;
                fall = false;
                onceJ = false;
            }
        }

        if (key == KeyEvent.VK_SHIFT) {
            shift = true;
        }

        if (key == KeyEvent.VK_LEFT) {
                left = true;
        }

        if (key == KeyEvent.VK_RIGHT) {
                right = true;
        }

        if (key == KeyEvent.VK_UP) {
            up = true;
        }

        if (key == KeyEvent.VK_DOWN) {
            down = true;
        }
    }

    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE){
            fall = true;
            jump = false;
        }

        if (key == KeyEvent.VK_SHIFT) {
            shift = false;
        }

        if (key == KeyEvent.VK_LEFT) {
            left = false;
            nonLeft = true;
        }

        if (key == KeyEvent.VK_RIGHT) {
            right = false;
            nonRight = true;
        }

        if (key == KeyEvent.VK_UP) {
            up = false;
        }

        if (key == KeyEvent.VK_DOWN) {
            down = false;
        }
    }

    public void run()
    {
        Sprite s1 = new Sprite();
        new Thread(s1).start();
    }
}