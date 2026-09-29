public class BSR {
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10, 13, 18, 21};
        int target = 18;

        int result = binarySearchRecursive(a, target, 0, a.length - 1);

        System.out.println(result);
    }

    public static int binarySearchRecursive(int[] a, int target, int low, int high) {

        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;

        if (a[mid] == target) {
            return mid;
        }
        if (target < a[mid]) {
            return binarySearchRecursive(a, target, low, mid - 1);
        }
        return binarySearchRecursive(a, target, mid + 1, high);
    }

}