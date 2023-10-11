import java.util.Scanner;
class solution{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces before the first asterisk

            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print numbers in decreasing order, excluding the last number (1 for the first row)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Print spaces after the last number (1 for the first row)
           

            System.out.println();
        }

        // while(i<=n*2+1){
        //     int j = 1;
        //     while(j<=cols){
        //         int print = 1;
        //         if (j==1 || j==cols)
        //             System.out.print("x");
        //         else if((cols/2)+1<=j)   
        //         {        
        //             System.out.print(print);  
        //             print++;
        //         }
        //         else{
        //             System.out.print(print);
        //             print--;
        //         }
        //         j++;
        //     }
        //     if(i<=((n*2+1)/2)+1){
        //         cols+=2;
        //     }
        //     else{
        //         cols-=2;
        //         System.out.println();
        //     }
        //     i++;
        //     System.out.println(j);
            
        // }
    }
}