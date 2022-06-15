import java.util.Random;

public class Randoms {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }
}
