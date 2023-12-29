import javax.swing.*;
import java.awt.event.*;

public class Canvas extends JFrame implements KeyListener {

    private Ninja ninja = new Ninja();

    Canvas(){
        setSize(2500,2000);
        setLayout(null);
        addKeyListener(this);
        setVisible(true);

        ninja.setBounds(ninja.getX(),ninja.getY(),ninja.getWidthOfStandingNinja(), ninja.getHeightOfStandingNinja());
        add(ninja);
        ninja.standAnim();
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()){
            case KeyEvent.VK_RIGHT:
                ninja.runAnim();
                break;
            case KeyEvent.VK_SPACE:
                ninja.jumpAnim();
                break;
            default:
                ninja.standAnim();
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        ninja.standAnim();
    }
}