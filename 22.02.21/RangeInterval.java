public class RangeInterval extends Range{

    protected int counter;

    public RangeInterval(int start, int end)
    {
        super(end);
        counter = start;
        if (start > end){
            System.out.println("Start greater than end");
            // throw exception
        }
    }
}
