public class TripleTacobox implements Tacobox {
    private int tacos;

    public TripleTacobox() {
        this.tacos = 3;
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