public class JUnitMethodes {

    public static void main(String[] args) {
        int x = 5;
        int y = 110;
        int sum = calculateSum(x, y);
        System.out.println(sum);
        System.out.println(isGreaterThan100(101));
    }

    public static int calculateSum(int x, int y) {
        return x + y;
    }

    public static boolean isGreaterThan100(int x) {
        if (x > 100) {
            return true;
        } else {
            return false;
        }
    }
}
