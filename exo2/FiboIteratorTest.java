package exo2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FiboIteratorTest {

    @Test
    void testHasNext() {
        FiboIterator fiboIterator = new FiboIterator(10);
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next(); 
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertTrue(fiboIterator.hasNext());
        fiboIterator.next();
        assertFalse(fiboIterator.hasNext());
    }

    @Test
    void testNext() {
        FiboIterator fiboIterator = new FiboIterator(10);
        assertEquals(1, fiboIterator.next());
        assertEquals(2, fiboIterator.next());
        assertEquals(3, fiboIterator.next());
        assertEquals(5, fiboIterator.next());
        assertEquals(8, fiboIterator.next());
        assertEquals(13, fiboIterator.next());
        assertEquals(21, fiboIterator.next());
        assertEquals(34, fiboIterator.next());
        assertEquals(55, fiboIterator.next());
        assertEquals(89, fiboIterator.next());
        assertThrows(java.util.NoSuchElementException.class, () -> fiboIterator.next());

    }
}