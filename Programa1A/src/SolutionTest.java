import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
	
	@Before
	public void emptyAns() {
		Solution.ans = "null";
	}
	
	
	@Test
	public void testExample1() {
		
		Solution.main(new String[]{"10 3 1 2 3 4 5 5 4 3 2 1"});
		assertEquals("4\n"
				+ "0.50\n"
				+ "4.50\n"
				+ "1.41\n"
				+ "3.00\n", Solution.ans);
	}
	
	@Test
	public void testExample2() {
		Solution.main(new String[]{"5 2 500 500 500 500 500"});
		assertEquals("5\n"
			+ "0.00\n"
			+ "500.00\n"
			+ "0.00\n"
			+ "500.00\n", Solution.ans);

		
	}
	
	@Test
	public void testCaminho1() {
		Solution.main(new String[]{"-1 3 -1 2"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho2() {
		Solution.main(new String[]{"-1 3 -1 2 1 2 3"});
		assertEquals("2\n"
				+ "0.50\n"
				+ "2.50\n"
				+ "0.82\n"
				+ "2.00\n", Solution.ans);
	}
	
	@Test
	public void testCaminho3() {
		Solution.main(new String[]{"-1 3 -1 2 1 2"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho4() {
		Solution.main(new String[]{"-1 4 -1 3 1 1 1 1"});
		assertEquals("4\n"
				+ "0.00\n"
				+ "1.00\n"
				+ "0.00\n"
				+ "1.00\n", Solution.ans);
	}
	
	@Test
	public void testCaminho5() {
		Solution.main(new String[]{"-1 4 -1 3 1 -1 -2"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho6() {
		Solution.main(new String[]{"-1 4 -1 3 1 -1 -2 -3 -4"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho7() {
		Solution.main(new String[]{"-1 4 -1 3 -2 3 1"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho8() {
		Solution.main(new String[]{"-1 4 -1 3 -2 3 1 4 2"});
		assertEquals("3\n"
				+ "0.82\n"
				+ "3.00\n"
				+ "1.12\n"
				+ "2.50\n", Solution.ans);
	}
	
	@Test
	public void testCaminho9() {
		Solution.main(new String[]{"3 2 1 2"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho11() {
		Solution.main(new String[]{"3 2"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho12() {
		Solution.main(new String[]{"3 2 1 2 3"});
		assertEquals("2\n"
				+ "0.50\n"
				+ "2.50\n"
				+ "0.82\n"
				+ "2.00\n", Solution.ans);
	}
	
	@Test
	public void testCaminho13() {
		Solution.main(new String[]{"3 2 -1 -2 3"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho15() {
		Solution.main(new String[]{"3 2 -1 2 1"});
		assertEquals("null", Solution.ans);
	}
	
	@Test
	public void testCaminho16() {
		Solution.main(new String[]{"3 2 -1 2 1 3"});
		assertEquals("2\n"
				+ "0.50\n"
				+ "2.50\n"
				+ "0.82\n"
				+ "2.00\n", Solution.ans);
	}

}
