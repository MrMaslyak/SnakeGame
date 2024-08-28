import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            View view = new View();
            HeroSnakeView snake = view.getSnakeView();
            Model model = new Model(snake, view);
            Constructor constructor = new Constructor(view, model);
            constructor.start();
        });
    }
}