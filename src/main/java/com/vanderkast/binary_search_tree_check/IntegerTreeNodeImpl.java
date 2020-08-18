package com.vanderkast.binary_search_tree_check;

public class IntegerTreeNodeImpl implements TreeNode<Integer> {
    private Integer value;
    private TreeNode<Integer> left;
    private TreeNode<Integer> right;

    public IntegerTreeNodeImpl() {
        value = null;
    }

    public IntegerTreeNodeImpl(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public TreeNode<Integer> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<Integer> left) {
        this.left = left;
    }

    @Override
    public TreeNode<Integer> getRight() {
        return right;
    }

    public void setRight(TreeNode<Integer> right) {
        this.right = right;
    }
}
