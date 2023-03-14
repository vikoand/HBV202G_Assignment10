package is.hi.hbv202g.ass9.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {

    private List<MathExpression> children = new ArrayList<MathExpression>();


    public int getResult() {
        int sum = 0;
        for (MathExpression child : children) {
            child.getResult();
            sum += child.getResult();
        }
        return sum;
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



}
