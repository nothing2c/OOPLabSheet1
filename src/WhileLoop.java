import javax.swing.*;

public class WhileLoop {
    public static void main(String[] args) {

        String exchangeRateS, poundS;
        double exchangeRate, pound=1, euro;

        exchangeRateS= JOptionPane.showInputDialog("Please enter exchange rate (£ to €)");
        exchangeRate=Double.parseDouble(exchangeRateS);

        while(pound!=0)
        {
            poundS=JOptionPane.showInputDialog("Please enter the pounds to be converted");
            pound=Integer.parseInt(poundS);

            if(pound>0)
            {
                euro=pound*exchangeRate;

                JOptionPane.showMessageDialog(null,"£"+pound+" equals €"+String.format("%.2f",euro));
            }
        }
    }
}
