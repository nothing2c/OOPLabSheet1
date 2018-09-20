public class UserDefinedMethod {
    public static void main(String[] args) {

        int cubedNum;
        String results=String.format("%-20s%-15s\n%-20s%-15s","Number","Cube","------","----");

        for(int i=1;i<16;i++)
        {
            cubedNum=MyMethods.cube(i);
            results+=MyMethods.formatResults(i, cubedNum);
        }

        System.out.println(results);
    }

}
