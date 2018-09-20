public class MyMethods {

    public static int cube(int number)
    {
        return number*number*number;
    }

    public static String formatResults(int i, int cubedNum)
    {
        return String.format("\n%-20d%-15d",i,cubedNum);
    }

    public static boolean isEven(int number)
    {
        if(number%2==0)
            return true;
        else
            return false;
    }
}
