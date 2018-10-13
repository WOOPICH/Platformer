package woopich.Frame;

import woopich.Unit.Sprite;

import javax.swing.*;
import java.awt.*;

public class Background
{
    private Image back;
    private int X = 0;
    private int Y = 0;
    private int dX;


    Background()
    {
        back = new ImageIcon("res/back.png").getImage();
    }

    public void checkRight()
    {
        if (GameScreen.sprite.getX() + 200 + GameScreen.sprite.getDx() + 207 >= 1264) {
            dX = -GameScreen.sprite.getDx();
        } else {
            dX = 0;
        }
    }

    public void checkLeft()
    {
        if (GameScreen.sprite.getX() - 200 + GameScreen.sprite.getDx() <= 0) {
            dX = -GameScreen.sprite.getDx();
        } else {
            dX = 0;
        }
    }

    public void checkBoth()
    {
        if (GameScreen.sprite.getX() + 200 + GameScreen.sprite.getDx() + 207 >= 1264 || GameScreen.sprite.getX() - 200 + GameScreen.sprite.getDx() <= 0) {
            dX = -GameScreen.sprite.getDx();
        } else {
            dX = 0;
        }
    }

    public void update()
    {
        if (X + dX >= 0) {
            checkRight();
        }
        if (X + dX <= 0 && X + back.getWidth(null) + dX >= 1264) {
           checkBoth();
        }
        if (X + back.getWidth(null) + dX <= 1264) {
            checkLeft();
        }
    }

    public void move()
    {
        X += dX;
    }

    public Image getBack()
    {
        return back;
    }


    public int getX()
    {
        return X;
    }

    public int getY()
    {
        return Y;
    }

    public int getdX()
    {
        return dX;
    }

    public void setdx(int dX)
    {
        this.dX = dX;
    }

    public  void setX(int X)
    {
        this.X = X;
    }
}
