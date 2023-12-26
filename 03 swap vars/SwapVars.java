public class SwapVars {
    public static void main(String[] args) {
        String x = "water";
        String y = "coolaid";

        String temp;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("\nX': " + x);
        System.out.println("Y': " + y);
    }
}