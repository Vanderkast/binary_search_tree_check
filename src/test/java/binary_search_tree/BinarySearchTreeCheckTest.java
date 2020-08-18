package binary_search_tree;

import com.vanderkast.binary_search_tree_check.BinarySearchTreeCheck;
import com.vanderkast.binary_search_tree_check.IntegerTreeNodeImpl;
import com.vanderkast.binary_search_tree_check.comparator.IntegerComparator;
import org.junit.Test;

import static org.junit.Assert.*;

public final class BinarySearchTreeCheckTest {
    private final IntegerTreeNodeImpl treeNode = new IntegerTreeNodeImpl();
    private BinarySearchTreeCheck<Integer> checker = new BinarySearchTreeCheck(new IntegerComparator());


    @Test
    public void isBinarySearch_Real() {
        fillReal();
        assertTrue(checker.isBinarySearch(treeNode));
    }

    @Test
    public void isBinarySearch_Fake() {
        fillFake();
        assertFalse(checker.isBinarySearch(treeNode));
    }

    @Test
    public void isBinarySearch_RealWithNull() {
        fillRealWithNull();
        assertTrue(checker.isBinarySearch(treeNode));
    }

    @Test
    public void isBinarySearch_FakeWithNull() {
        fillFakeWithNull();
        assertFalse(checker.isBinarySearch(treeNode));
    }

    private void fillRealWithNull() {
        treeNode.setValue(5);
        treeNode.setLeft(new IntegerTreeNodeImpl(3));
        treeNode.setRight(new IntegerTreeNodeImpl(7));

        ((IntegerTreeNodeImpl) treeNode.getLeft()).setLeft(null);
        ((IntegerTreeNodeImpl) treeNode.getLeft()).setRight(new IntegerTreeNodeImpl(4));

        ((IntegerTreeNodeImpl) treeNode.getRight()).setLeft(new IntegerTreeNodeImpl(6));
        ((IntegerTreeNodeImpl) treeNode.getRight()).setRight(new IntegerTreeNodeImpl(8));
    }

    private void fillReal() {
        treeNode.setValue(5);
        treeNode.setLeft(new IntegerTreeNodeImpl(3));
        treeNode.setRight(new IntegerTreeNodeImpl(7));

        ((IntegerTreeNodeImpl) treeNode.getLeft()).setLeft(new IntegerTreeNodeImpl(2));
        ((IntegerTreeNodeImpl) treeNode.getLeft()).setRight(new IntegerTreeNodeImpl(4));

        ((IntegerTreeNodeImpl) treeNode.getRight()).setLeft(new IntegerTreeNodeImpl(6));
        ((IntegerTreeNodeImpl) treeNode.getRight()).setRight(new IntegerTreeNodeImpl(8));
    }

    private void fillFake() {
        treeNode.setValue(5);
        treeNode.setLeft(new IntegerTreeNodeImpl(6));
        treeNode.setRight(new IntegerTreeNodeImpl(6));
    }


    private void fillFakeWithNull() {
        treeNode.setValue(5);
        treeNode.setLeft(new IntegerTreeNodeImpl(3));
        treeNode.setRight(new IntegerTreeNodeImpl(6));

        ((IntegerTreeNodeImpl) treeNode.getLeft()).setLeft(null);
        ((IntegerTreeNodeImpl) treeNode.getLeft()).setRight(new IntegerTreeNodeImpl(4));

        ((IntegerTreeNodeImpl) treeNode.getRight()).setLeft(new IntegerTreeNodeImpl(6));
        ((IntegerTreeNodeImpl) treeNode.getRight()).setRight(new IntegerTreeNodeImpl(8));
    }
}
