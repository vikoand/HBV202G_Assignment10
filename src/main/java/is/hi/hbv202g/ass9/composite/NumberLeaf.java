package is.hi.hbv202g.ass9.composite;

public class NumberLeaf implements MathExpression {

    private int numberLeaf;

    public NumberLeaf(int number) {
        this.numberLeaf = number;
    }

    public int getResult() {
        return numberLeaf;
    }


}
