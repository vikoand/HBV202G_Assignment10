package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyPlusComposite {

    private List<MathExpression> children = new ArrayList<MathExpression>();


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

}
