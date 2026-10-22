/** LeetCode provides the ListNode class. */
class Solution {
    public ListNode sortList(ListNode head) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        int[] values = new int[count];
        current = head;
        for (int i = 0; i < count; i++) {
            values[i] = current.val;
            current = current.next;
        }

        int[] sorted = mergeSort(values);
        current = head;
        for (int i = 0; i < count; i++) {
            current.val = sorted[i];
            current = current.next;
        }
        return head;
    }

    private int[] mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < nums.length; i++) {
            right[i - mid] = nums[i];
        }

        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
}
