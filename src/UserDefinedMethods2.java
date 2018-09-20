import javax.swing.*;

public class UserDefinedMethods2 {
    public static void main(String[] args) {

        String lengthS;
        int length, cubeValue;

        lengthS=JOptionPane.showInputDialog("Please enter the length of the cube");
        length=Integer.parseInt(lengthS);

        cubeValue=MyMethods.cube(length);


        if(cubeValue>100)
        {
            JOptionPane.showMessageDialog(null,"You cant take this on board, put it into your check-in luggage");
        }

        else
        {
            JOptionPane.showMessageDialog(null,"Welcome aboard");
        }
    }
}
