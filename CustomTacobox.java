public class CustomTacobox implements Tacobox {
    private int tacos;

    public CustomTacobox(int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (tacos >= 1) {
            tacos--;
        }
    }

}
