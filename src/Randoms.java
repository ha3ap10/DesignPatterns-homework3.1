import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int diff;

    public Randoms(int min, int max) {
        this.min = min;
        diff = max - min;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(diff + 1) + min;
            }
        };
    }
}
