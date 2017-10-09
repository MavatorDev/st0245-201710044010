
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Esta clase contiene los test que verifican si cada metodo se comporta correctamente en diferentes casos.
 */public class LinkedListTest {

	@Test
	public void testInsert() {
		LinkedList list = new LinkedList();
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		for (int i = 0; i < list.size(); i++)
		{
			assertEquals(list.get(0),1);
			assertEquals(list.get(1),2);
			assertEquals(list.get(2),3);
			assertEquals(list.get(3),4);
			assertEquals(list.get(4),5);			
		}		
	}
	@Test
	public void testInsert2() {
	   LinkedList list = new LinkedList();
	   list.insert(5, 0);
	   }

	@Test
	public void testRemove() {
		LinkedList list = new LinkedList();
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		assertTrue(list.contains(3));
		list.remove(2);
		assertFalse(list.contains(3));
		list.remove(4);
		list.remove(0);
	}
	@Test
	public void testRemove2() {
		LinkedList list = new LinkedList();
		assertFalse(list.remove(6));		
	}
	

	@Test
	public void testContains() {
		LinkedList list = new LinkedList();
		list.insert(5, 0);
		list.insert(4, 0);
		list.insert(3, 0);
		list.insert(2, 0);
		list.insert(1, 0);
		assertTrue(list.contains(3));
		assertFalse(list.contains(10));
		assertTrue(list.contains(5));
		assertTrue(list.contains(1));
	}
	@Test
	public void testContains2() {
		LinkedList list = new LinkedList();
		
		assertFalse(list.contains(10));
}
          

}