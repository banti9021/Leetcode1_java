import java.util.*;

public class dp3 {
    public static void main(String args[]) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();  // Input the number of rows

        // Loop through each row
        for (i = 0; i < n; i++) {
            // Print spaces (n - i - 1 spaces)
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars (2 * i + 1 stars)
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
        //second prt
        for(i=0;i<n/2+1;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();

        }






    }
}
