public class arrayNumbers24 {
    public static void main(String[] args) {
        // this is an integer array. it will not work because integers cannot hold decimal values
        // int[] num = new int[4];
        // num[0] = 5.0;
        // num[1] = 4;
        // num[2] = 7.5;
        // num[3] = 54;

        // this is a double array. it will work because double can hold decimal values
        double[] num = new double[4];
        num[0] = 5.0;
        num[1] = 12867;
        num[2] = 7.5;
        num[3] = 2000000;

       for (int i = 0; i <= 4; i++){
        System.out.println(num[1]);
       }
    }
}