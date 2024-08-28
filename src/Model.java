public class Model {
    private HeroSnakeView snake;
    private int moveX = 20;
    private View view;

    public Model(HeroSnakeView snake, View view) {
        this.snake = snake;
        this.view = view;
    }

    public void move() {
        while (true) {
            if (snake.getWidth()<view.getWidth()){
                snake.moveSnake(moveX, 0);
            }else {
              snake.moveSnakeBehind(moveX, 0);
            }
            try {
                Thread.sleep(85);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}