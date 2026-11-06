public class Assignment01Q03 {
    public static void main(String[] args) {
        int x =Integer.parseInt(args[0]) ;
        System.out.println("The first " + x + " Fibonacci numbers are:");

       
        int numOdd =0 ;
        int curr = 1;
        int prev = 1;
        for (int i = 2; i < x; i++) {
            int val;
            if (i == 0 || i == 1) {
                val = 1;
            } else {
                val = prev + curr;
                prev = curr;
                curr = val;
            }

            System.out.print(val);

            if (val % 2 != 0) {
                numOdd++;
            }
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
