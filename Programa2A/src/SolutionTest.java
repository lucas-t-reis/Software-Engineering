import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SolutionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		Solution.ans = "null";
		
	}

	@Test
	public void testExample1() {
		
		Solution.main(new String[] {"3 10 20 30"});
		assertEquals("80\n"
				+ "2 3\n", Solution.ans);
	}
	@Test
	public void testExample2() {
		
		Solution.main(new String[] {"3 10 30 20"});
		assertEquals("60\n"
				+ "2\n", Solution.ans);
	}
	@Test
	public void testExample3() {
		
		Solution.main(new String[] {"3 30 10 20"});
		assertEquals("100\n"
				+ "1 2\n", Solution.ans);
	}
	@Test
	public void testExample4() {
		
		Solution.main(new String[] {"5 80 50 10 5 15"});
		assertEquals("290\n"
				+ "1 2\n", Solution.ans);
	}
}
