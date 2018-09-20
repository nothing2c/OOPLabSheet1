import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numbers[] = new int[10];

        for(int i=0;i<numbers.length;i++)
        {
            System.out.print("Please enter an Integer: ");
            numbers[i]=input.nextInt();
        }

        System.out.println("The first value in the array is "+numbers[0]+
                           "\nThe 5th number in the array is "+numbers[4]);
    }
}
