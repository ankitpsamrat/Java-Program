import java.awt.*;
import java.awt.event.*;

public class create_notepad extends Frame implements MouseMotionListener {
    create_notepad() {
        addMouseMotionListener(this);
        setSize(500, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mouseDragged(MouseEvent a) {
        Graphics mM_g = getGraphics();
        mM_g.setColor(Color.ORANGE);
        mM_g.fillOval(a.getX(), a.getY(), 10, 10);
    }

    public void mouseMoved(MouseEvent e) {
    }

    public static void main(String[] args) {
        new create_notepad();
    }
}
