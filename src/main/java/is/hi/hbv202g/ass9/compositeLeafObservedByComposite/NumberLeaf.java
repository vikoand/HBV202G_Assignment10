package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf extends Observable implements MathExpression {

    private int numberLeaf;


    public NumberLeaf(int number) {
        this.numberLeaf = number;
    }

    public int getResult() {
        return numberLeaf;
    }

    public void setValue(int value) {
        this.numberLeaf = value;
        notifyObservers();
    }





}
