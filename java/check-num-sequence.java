import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        if (isSplitPossible(S)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }

    public static boolean isSplitPossible(int[] S) {
        int n = S.length;
        int i = 0;
        while (i < n - 1 && S[i] >= S[i+1]) {
            i++;
        }
        if (i == n - 1) {
            return true;
        }
        i++;
        while (i < n && S[i-1] <= S[i]) {
            i++;
        }
        return i == n;
        
    }
}
