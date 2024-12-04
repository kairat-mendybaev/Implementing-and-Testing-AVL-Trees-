import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AVLTreeTest {
    private AVLTree avl;

    @Before
    public void setUp() {
        avl = new AVLTree();
    }

    @Test
    public void testInsertAndSearch() {
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        assertTrue(avl.search(20));
        assertFalse(avl.search(40));
    }

    @Test
    public void testDelete() {
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        assertTrue(avl.delete(20));
        assertFalse(avl.search(20));
    }

    @Test
    public void testInOrderTraversal() {
        avl.insert(10);
        avl.insert(20);
        avl.insert(15);
        avl.insert(25);
        avl.insert(30);
        avl.inOrderTraversal();  // Should output sorted keys
    }
}
