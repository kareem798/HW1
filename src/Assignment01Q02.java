public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 1;
        int c=-1;
        int j =3;
        for(int i =1 ; i<Integer.parseInt(args[0]);i++)
            {
                approxPi+=c*1.0/j;
                j+=2;
                c=c*-1;
            }
            approxPi=4*approxPi;

        System.out.println(approxPi + " " + actualPi);
    }
}
