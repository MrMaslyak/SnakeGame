import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HeroSnakeView extends JPanel {
    private int width = 400, height = 400;
    private int segmentSize = 20;
    private List<Point> snakeSegments;

    public HeroSnakeView() {
        setSize(width, height);
        setLocation(0, 0);
        setVisible(true);
        setFocusable(true);

        snakeSegments = new ArrayList<>();
        snakeSegments.add(new Point(100, 100));
        snakeSegments.add(new Point(80, 100));
        snakeSegments.add(new Point(60, 100));
        snakeSegments.add(new Point(40, 100));
        snakeSegments.add(new Point(20, 100));
        snakeSegments.add(new Point(0, 100));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);

        for (Point point : snakeSegments) {
            g.fillRect(point.x, point.y, segmentSize, segmentSize);
        }
    }
}