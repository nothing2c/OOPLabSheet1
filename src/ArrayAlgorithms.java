import javax.swing.*;
import java.util.Arrays;

public class ArrayAlgorithms {
    public static void main(String[] args) {

        String weightInput, display;
        double weights[] = new double[10], lightest, average;
        int under250, atLeast400;

        for(int i=0;i<weights.length;i++) {
            weightInput=JOptionPane.showInputDialog("Please enter the weight of animal "+(i+1));
            weights[i]=Double.parseDouble(weightInput);
        }

        display="Weights: "+Arrays.toString(weights);

        sortArray(weights);

        under250=amountUnder250(weights);
        display+="\nNumber of animals under 250Kg: "+under250;

        atLeast400=(amountAtLeast400(weights)/weights.length)*100;
        display+="\nPercentage over 400Kg: "+atLeast400+"%";
        display+="\nLightest animal: "+weights[0];

        JOptionPane.showMessageDialog(null,display);
    }

    public static void sortArray(double weights[])
    {
        double lowest, temp;
        int index;

        for(int i=0;i< weights.length;i++)
        {
            lowest=weights[i];
            index=i;

            for(int j=i+1;j<weights.length;j++)
            {
                if(weights[j]<lowest)
                {
                    lowest=weights[j];
                    index=j;
                }
            }

            temp=weights[i];
            weights[i]=weights[index];
            weights[index]=temp;
        }
    }

    public static int amountUnder250(double weights[])
    {
        int i;

        for(i=0;i<weights.length;i++)
        {
            if(weights[i]>250)
                break;
        }

        return i;
    }

    public static int amountAtLeast400(double weights[])
    {
        int i;

        for(i=0;i<weights.length;i++)
        {
            if(weights[i]>400)
                break;
        }

        return weights.length-i;
    }
}
