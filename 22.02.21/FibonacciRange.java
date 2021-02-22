import java.util.Iterator;

public class FibonacciRange implements Iterable<Integer> {
    private int n;
    private int firstPrevious;
    private int secondPrevious;
    private int counter;

    public FibonacciRange(int n) {
        this.n = n;
        firstPrevious = 0;
        secondPrevious = 1;
        counter = 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return counter < n;
            }

            @Override
            public Integer next() {
                int result = firstPrevious + secondPrevious;
                ;
                firstPrevious = secondPrevious;
                secondPrevious = result;
                counter++;
                return result;
            }
        };
    }
}