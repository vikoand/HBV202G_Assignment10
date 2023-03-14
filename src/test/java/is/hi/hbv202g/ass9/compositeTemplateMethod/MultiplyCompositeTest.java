package is.hi.hbv202g.ass9.compositeTemplateMethod;

import static org.junit.Assert.*;


import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.MultiplyPlusComposite;
import is.hi.hbv202g.ass9.compositeLeafObserverTemplateMethod.NumberLeaf;
import org.junit.Before;
import org.junit.Test;

public class MultiplyCompositeTest {

	private MultiplyPlusComposite multiplyComposite;

	@Before
	public void createMultiplyComposite() {
		multiplyComposite = new MultiplyPlusComposite();
	}

	@Test
	public void testOneElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);

		multiplyComposite.add(number2);
		assertEquals(2, multiplyComposite.getResult());
	}

	public void testTwoElementMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		multiplyComposite.add(number2);
		multiplyComposite.add(number4);
		assertEquals(8, multiplyComposite.getResult());
	}

	public void testNestedMultiplyComposite() {

		NumberLeaf number2 = new NumberLeaf(2);
		NumberLeaf number4 = new NumberLeaf(4);

		multiplyComposite.add(number2);
		multiplyComposite.add(number4);

		MultiplyPlusComposite multiplyComposite2 = new MultiplyPlusComposite();
		multiplyComposite2.add(multiplyComposite);
		multiplyComposite2.add(multiplyComposite);
		assertEquals(64, multiplyComposite.getResult());
	}

	
}
