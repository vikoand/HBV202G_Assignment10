package is.hi.hbv202g.ass9.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

    private List<MathExpression> children = new ArrayList<MathExpression>();

    private int result;

    public int getResult() {
        MathExpression child;
        for (MathExpression child : children) {
            child.getResult();
        }
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

    public int add(NumberLeaf number) {

        result += number.getResult();

        return result;
    }


}
