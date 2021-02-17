import java.util.Iterator;

public class Range implements Iterable<Integer> {
    private final int end;
    private int counter;
    private int start;

    public Range(int start, int end) {
        this.start = start
        counter = start;
        this.end = end;
        if (end < start){
            System.out.println("end < start");
        }
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return counter < end;
            }

            @Override
            public Integer next() {
                return counter++;
            }
        };
    }
}
