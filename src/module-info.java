package kiranppp;

public class number {

    public static void main(String[] args) {
        int i;
        int j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(i + j - 1 + " ");
            }
            System.out.println();
        }
    }

}
