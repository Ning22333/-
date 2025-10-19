import java.util.function.DoubleUnaryOperator;

public class 二分法 {

    // 在有序数组中二分查找，返回索引或 -1
    public static int binarySearch(int[] a, int target) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (a[mid] == target) return mid;
            if (a[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    // 数值二分法（区间 [left,right]，要求 f(left) 与 f(right) 异号）
    // 返回近似根
    public static double bisection(DoubleUnaryOperator f, double left, double right, double tol, int maxIter) {
        double fl = f.applyAsDouble(left);
        double fr = f.applyAsDouble(right);
        if (Double.isNaN(fl) || Double.isNaN(fr)) throw new IllegalArgumentException("f(left) or f(right) is NaN");
        if (fl * fr > 0) throw new IllegalArgumentException("f(left) and f(right) must have opposite signs");

        double mid = left;
        for (int i = 0; i < maxIter; i++) {
            mid = (left + right) / 2.0;
            double fm = f.applyAsDouble(mid);
            if (Math.abs(fm) <= tol || (right - left) / 2.0 < tol) return mid;
            if (fl * fm <= 0) {
                right = mid;
                fr = fm;
            } else {
                left = mid;
                fl = fm;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        // 二分查找示例
        int[] arr = {1, 3, 5, 7, 9, 11};
        int t = 7;
        int idx = binarySearch(arr, t);
        System.out.println("binarySearch: target=" + t + " index=" + idx);

        // 数值二分法示例：求 x^3 - x - 2 = 0 的根（在 [1,2]）
        DoubleUnaryOperator f = x -> x * x * x - x - 2;
        double root = bisection(f, 1.0, 2.0, 1e-12, 100);
        System.out.println("bisection root ≈ " + root);
    }
}