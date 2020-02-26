package epam_task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestCalculationTest {
	InterestCalculation obj=new InterestCalculation();
	private static final double DELTA = 1e-15;
	@Test
	public void test() {
		String s="SimpleIntrest";
		assertEquals(576.0f,obj.IntrestMethod(s,1200,2,24.0),DELTA);
	}
	@Test
	public void test1() {
		String p="CompoundIntrest";
		assertEquals(828.0000000000002,obj.IntrestMethod(p,1200,2,30),DELTA);
	}

}
