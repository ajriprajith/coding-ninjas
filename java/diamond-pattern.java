// import java.util.Scanner;
// class DiamondPattern {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int rows = scanner.nextInt();

//         int spaces = rows / 2;
//         int stars = 1;
//         // System.out.println(spaces);
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= spaces; j++) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= stars; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//             if (i <= rows / 2) {
//                 spaces--;
//                 stars += 2;
//             } else {
//                 spaces++;
//                 stars -= 2;
//             }
//         }
//     }
// }


import java.util.Scanner;
 class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        int n , i=1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.println('*');
        while(i<=n)
        {
         int j =1;
            System.out.print('*');
            while(j<=i)
            {
                System.out.print(j);
            j++;
            
            }
            int k = i-1;
            while(k>=1)
            {
                System.out.print(k);
                k--;
            }
            System.out.print('*');
            System.out.println();
            i++;
}
         int k = n-1;
        while(k>=1)
        {
            System.out.print('*');
            int j =1;
            while(j<=k)
            {
                System.out.print(j);
                j++;
            }
            int m = k-1;
            while(m>=1)
            {
                System.out.print(m);
                m--;
            }
            System.out.print('*');
             k--;
            System.out.println();
           
           
        }
         System.out.println('*');
        
    }
}