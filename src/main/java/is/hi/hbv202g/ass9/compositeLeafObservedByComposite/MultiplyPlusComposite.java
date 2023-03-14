package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyPlusComposite implements MathExpression, Observer {

    private List<MathExpression> children = new ArrayList<MathExpression>();

    private int lastObservedResult;


    public int getResult() {
        int multi = 1;
        for (MathExpression child : children) {
            child.getResult();
            multi *= child.getResult();
        }
        return multi;
    }

    public void add(MathExpression mathExpression) {
        children.add(mathExpression);
    }

    public void remove(MathExpression mathExpression) {
        children.remove(mathExpression);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.printf(lastObservedResult + " ");
    }

}
