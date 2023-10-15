import java.util.Scanner;
class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), c = scanner.nextInt();
        if(c == 1){
            int sum=0;
            for(int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println(sum);
        }
        else if (c == 2){
            int mul=1;
            for(int i = 1; i <= n; i++){
                mul *= i;
            }
            System.out.println(mul);
        }
        else{
            System.out.println(-1);
        }
        scanner.close();

    }
}
