import java.util.Scanner;

public class termsofap {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(),i=1, count= 0;
        while (count<x){
            int n = 3*i+2;
            if(n%4!=0){
                System.out.print(n+" ");
                count++;
            }
            i++;
        }
        scanner.close();
    }
}
