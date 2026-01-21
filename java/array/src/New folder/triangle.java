public class triangle {
    
    public static void main(String[] args)
    
    {
        System.out.println("  ");
 int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }

    }
    
}
