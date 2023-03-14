package is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod;


public class MultiplyPlusComposite extends AbstractSuperclass implements MathExpression, Observer {

    public int getResult() {
        int multi = 1;
        for (MathExpression child : children) {
            child.getResult();
            multi *= child.getResult();
        }
        return multi;
    }


}
