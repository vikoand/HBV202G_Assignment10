package is.hi.hbv202g.ass9.composite;

public class PlusComposite {

    private int result;
    public int add(NumberLeaf number) {

        result += number.getResult();

        return result;
    }
}
