import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HeroSnakeView extends JPanel {
    private int width = 400, height = 400;
    private int segmentSize = 20;


    public HeroSnakeView() {
        setSize(width, height);
        setLocation(0, 0);
        setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, width, height);

    }

    public void moveSnake(int moveX, int moveY) {

    }
    public void moveSnakeBehind(int moveX, int moveY) {

    }

    public int getWidth() {
        return width;
    }


}