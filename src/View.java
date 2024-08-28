import javax.swing.*;

public class View extends JFrame {
    private HeroSnakeView snake;

    public View() {
        snake = new HeroSnakeView();
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        add(snake);
    }

    public HeroSnakeView getSnakeView() {
        return snake;
    }
}