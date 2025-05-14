package trees;


public class EqualTreePartition {
    private boolean found = false;
    private int totalSum = 0;

    private int calculateTotalSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + calculateTotalSum(node.left) + calculateTotalSum(node.right);
    }

    private int checkSubtreeSum(TreeNode node) {
        if (node == null) return 0;

        int left = checkSubtreeSum(node.left);
        int right = checkSubtreeSum(node.right);
        int currentSum = node.val + left + right;

        // Correct check: avoid checking entire tree's sum
        if (currentSum == totalSum / 2 && currentSum != totalSum) {
            found = true;
        }

        return currentSum;
    }

    public int solve(TreeNode A) {
        if (A == null) return 0;

        totalSum = calculateTotalSum(A);
        if (totalSum % 2 != 0) return 0;

        checkSubtreeSum(A);
        return found ? 1 : 0;
    }
}
