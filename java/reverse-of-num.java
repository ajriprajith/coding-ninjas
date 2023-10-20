import java.util.Scanner;
class reverse {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), rev=0;
        while(n!=0){
            int i = n%10;
            rev =  rev*10 + i;
            n /= 10;
        }
        System.out.println(rev);
        scanner.close();
    }
}
