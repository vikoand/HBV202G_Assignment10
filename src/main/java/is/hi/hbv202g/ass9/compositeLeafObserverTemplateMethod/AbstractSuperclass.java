package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSuperclass {

    protected List<MathExpression> children = new ArrayList<MathExpression>();

    private int lastObservedResult;

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

    public abstract int getResult();

    public void update() {
        lastObservedResult = getResult();
        System.out.printf(lastObservedResult + " ");
    }

}