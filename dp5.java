import java.util.Scanner;

public class dp5 {
    public static void main(String args[]) {
        int i,j,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(i=0;i<1;i++){
            for(j=0;j<n-1;j++){
                System.out.print('e');

            }
        }
            for(j=0;j<n;j++){
                System.out.print(' ');




            }
            
            for(j=0;j<1;j++){
                System.out.print('*');
            }
            //second part
            for(i=0;i<n;i++){
                for(j=0;j<n/2+1;j++){
                    System.out.print(' ');

                }
                for(j=0;j<1;j++){
                    
                        System.out.print('*');
                    
                }
                for(j=0;j<n;j++){
                    if(i==n/2){
                        System.out.print('e');
                    }
                    System.out.print(' ');
                }
                for(j=0;j<n;j++){
                    if(i==n/2){
                        System.out.print('e');
                    }else
                    System.out.print(' ');
                }
                //third
                for(i=0;i<1;i++){
                    for(j=0;j<n*2-1;j++){
                        System.out.print(' ');
                    }
                    for(j=0;j<1;j++){
                        System.out.print('*');
                    }
                    for(j=0;j<n;j++){
                        System.out.print(' ');
                    }
                    for(j=0;j<n-1;j++){
                        System.out.print('e');
                    }
                    System.out.println();
                }

            }
        


            
            
            
        


                



        
    }
}
