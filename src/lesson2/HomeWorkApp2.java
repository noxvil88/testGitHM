public class HomeWorkApp2 {
    public static void main(String[] args) {
        if (within10and20(10,20)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        isPositiveOrNegative(-5);
        System.out.println(isNegative(9));
        printWordNTimes("word",8);

    }
    public static boolean within10and20(int x1, int x2) {
        return (x1 + x2 >= 10) && (x1 + x1 <= 20);
    }
    public static void isPositiveOrNegative(int x) {
        if (x >=0) {
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printWordNTimes(String word, int times) {
        for (int i =1; i <=8; i++) {
            System.out.print("word " + i );
        }
    }


}