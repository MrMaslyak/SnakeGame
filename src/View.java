import javax.swing.*;
import javax.swing.SwingUtilities;

public class View extends JFrame {
    private HeroSnakeView snake = new HeroSnakeView();
    public View() {
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        add(snake);
        ui();
    }

    private void ui() {

    }

}
