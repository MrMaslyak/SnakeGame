public class Constructor {
    private View view;
    private Model model;

    public Constructor(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void start() {
        new Thread(() -> model.move()).start();
    }
}