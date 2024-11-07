import java.util.Scanner;

public class  Fibonacci {

    public static void main(String[] args) {
        // Compute the nth number
        System.out.println("Enter the value of the position you looking for");
        Scanner input = new Scanner(System.in);
        int position = input.nextInt();

        // Fibonacci computation
        int value = fibo(position);


    }

    public static Integer fibo( int nthValue){
        // Initializing an array to store the fibonacci values that will be computed
        int [] sequence  = new int [nthValue];

        // Manually computing the first wo values of the
        // Fibonacci sequence in order to preform the calculation of the rest of the numbers
        sequence[0] = 0;
        sequence[1] = 1;

        //Creating for loop to continue to calculate fibonacci value until position provided
        // For Loop starts at index position 2 because the first two positions have already been defined
        int i;
        for(i = 2; i < nthValue; i++){

            // Fibonacci sequence formula (e.g Fn = Fn-1 + Fn -2)
            sequence[i] = sequence[i -1] + sequence[i -2];
        }

        return sequence[i - 1];
    }
}