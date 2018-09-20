import java.util.Scanner;

public class UserDefinedBoolean {
    public static void main(String[] args) {

        int number=01;

        Scanner input = new Scanner(System.in);

        while(number!=-1) {
            System.out.println("Please enter a number (-1 to exit) ");
            number = input.nextInt();

            if(number!=-1)
            {
                if(MyMethods.isEven(number))
                    System.out.println(number+" is even\n");
                else
                    System.out.println(number+" is odd");
            }
        }
    }
}
