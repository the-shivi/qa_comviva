package testing_pck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import StringExample.StringDemo;

public class Testing_StringDemo {
	@Test
	public void TestEqual() {
		StringDemo obj = new StringDemo();
		
		assertEquals(obj.reverse("com"),"moc");
		assertEquals(obj.reverse("my name is virat"),"tariv si eman ym");
			
	}
	
	@Test
	public void TestPalindrome() {
		StringDemo obj = new StringDemo();
		
		assertTrue(obj.isPalindrome("mom"));
		assertFalse(obj.isPalindrome("Shivam"));
		assertTrue(obj.isPalindrome("do madam od"));
		
	}
	
	@Test
	public void TestConcatenate() {
		StringDemo obj = new StringDemo();
		
		assertEquals(obj.concatenate("Shivam ","Kumar"),"Shivam Kumar");
		assertTrue(obj.concatenate("Shivam ","Kumar").length()==12);
			
	}
	
	@Test
	public void TestCountOccurance() {
		StringDemo obj = new StringDemo();
		
		assertEquals(obj.countOccurrences("Hello",'l'),2);
		assertTrue(obj.countOccurrences("just looking like a wow",'o')==3);
		assertFalse(obj.countOccurrences("just looking like a wow",'z') != 0);	
	}
	
}