import java.util.Scanner;

public class dp6 {

    public static void main(String args[]) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();


        // First part: Pyramid of '*'
        for (i = 0; i < n / 2+1; i++) {
            // Print leading spaces
            for ( j = 0; j < n - i; j++) {
                System.out.print(' ');
            }
            // Print stars
            for ( j = 0; j < 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.println(); // Move to next line
        }

        // Second part: Column of 'e'
        for (i = 0; i < n; i++) {
            // Print leading spaces
            for ( j = 0; j < n; j++) {
                System.out.print(' ');
            }
            // Print 'e'
            for( j=0;j<1;j++){
              System.out.print('e');
            }
            System.out.println();
        }

        //third part
        for(i=0;i<n;i++){
            for(j=0;j<n/2;j++){
                System.out.print(' ');
            }
            for(j=0;j<n+2;j++){
                if(i==0 || j==0 || j==n+1){
                    System.out.print('*');
                }else
                System.out.print(' ');
            }
            System.out.println();
            
            
        }

    }
}
