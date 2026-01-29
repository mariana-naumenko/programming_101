public class ColoredStars {
    public static void main(String[] args) {

        // ANSI color codes
        String GREEN = "\u001B[32m";
        String RESET = "\u001B[0m";

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(GREEN + "* " + RESET);
            }
            System.out.println();
        }
    }
}
