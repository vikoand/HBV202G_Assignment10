package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends AbstractSuperclass implements MathExpression, Observer {

    public int getResult() {
        int sum = 0;
        for (MathExpression child : children) {
            child.getResult();
            sum += child.getResult();
        }
        return sum;
    }

}
