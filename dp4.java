import java.util.Scanner;

public class dp4 {

    public static void main(String args[]) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();


        for(i=0;i<n;i++){
            for(j=0;j<n+3-i;j++){
                System.out.print(' ');
            }

            for(j=0;j<2*i+1;j++){
                System.out.print('*');

            }
            System.out.println();
        }

        //second prt
        for(i=0;i<n;i++){
            for(j=0;j<n/2+1;j++){
                if(j>=n/2-i && j>=i-n/2){
                    System.out.print('*');
                }else
                System.out.print(' ');
            }
            for(j=0;j<n*2-3;j++){
                System.out.print(' ');
            }
            for(j=0;j<n/2+1;j++){
                if(j>=n/2-i && j>=i-n/2){
                    System.out.print('*');
                } else
                    System.out.print(' ');


                   }
            for(i=0;i<n-1;i++){
                for(j=0;j<n+2+i;j++){
                    System.out.print(' ');

                }
                for(j=0;j<n*1-i;j++){
                    System.out.print('*');
                }
                System.out.println();
            }
                     
        }
        
    }
}