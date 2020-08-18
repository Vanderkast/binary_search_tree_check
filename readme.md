# Binary Search Tree Checker

This project is simple implementation of Binary Tree based on `TreeNode` with generic `value`.   
`BinarySearchTreeChecker` checks that binary tree represents search tree.

### Pseudo code:

bool check(TreeNode node):  
begin  
if node.value is undefined then return true  

bool left_subtree_is_binary = true, right_subtree_is_binary = true  
if node.left exists then left_subtree_is_binary = check(node.left)  
if node.right exists then right_subtree_is_binary = check(node.right)  
  
if  node.left.value exists and less then node.value  
    and (node.right.value exists and bigger then node.value)  
    and left_subtree_is_binary  
    and right_subtree_is_binary  
    return true, false otherwise  
end.
