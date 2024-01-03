package testing_pck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class Testing_ArrayList {

	@Test
	public void test1() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(42);
		list.add(-3);
		list.add(15);
		
		assertEquals((Integer)42, list.get(0));
		assertTrue(list.get(1)==-3);
		assertEquals(3,list.size());
	}

	@Test
	public void testIsEmpty() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertTrue(list.isEmpty());
		list.add(123);
		assertFalse(list.isEmpty());
		list.remove(0);
		assertTrue(list.isEmpty());
	}
}