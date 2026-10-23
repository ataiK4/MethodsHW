public class Basics {
    public static void printHello() {
        System.out.println("Hello, world!");
    }
    public static void printNumbers() {
        for(int i = 1; i < 11; i++){
            System.out.print(i + " ");
        }
    }
    public static void printSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public static void greatUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
    public static boolean isEven(int n) {
        boolean result = false;
        if (n % 2 == 0)
            result = true;
        return result;
    }
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }
    public static void reverseArray(int[] nums) {
        for (int i = nums.length - 1; i > -1 ; i--) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int area(int side) {
        return side*side;
    }
    public static int area(int width, int height) {
        return width*height;
    }
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        printHello();
        printNumbers();
        System.out.println();
        printSum(10, 5);
        greatUser("Atai");
        System.out.println("Is 8 even? " + isEven(8));
        System.out.println("Is 9 even? " + isEven(9));
        System.out.println(findMax(new int[]{3, 7, 1, 2, 4, 8}));
        reverseArray(new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144});
        System.out.println("\n" + area(5));
        System.out.println(area(4, 5));
        System.out.println(area(4.5d));
    }
}
