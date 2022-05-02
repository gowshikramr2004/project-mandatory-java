import java.util.Scanner;

public class ram {
    public static int fact(int num) { // This is function which is used for finding factorial
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("#################################################");
        System.out.println("This is program to print ncr value of desired term ");
        System.out.println("#################################################");

        System.out.print("enter you n value ");
        int sum = 0;
        n = s.nextInt();
        int r;
        System.out.print("enter you r value");
        int fact = 1;
        r = s.nextInt();
        int res, facn, facr, facnr;
        facn = fact(n);
        facr = fact(r);
        facnr = fact(n - r);
        res = facn / (facr * facnr);// this is formulae for ncr
        System.out.println(res);

    }
}