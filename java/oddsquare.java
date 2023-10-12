import java.util.Scanner;
public class oddsquare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(),i = 1;
        while (i<=n){
            int num = (i*2)-1, j = 1;
            while(j<=n){
                if(num>(n*2)-1 ){
                    num = 1;
                }
                System.out.print(num);
                num += 2;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
