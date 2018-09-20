import javax.swing.*;
import java.awt.*;

import static java.awt.Font.MONOSPACED;
import static java.awt.Font.PLAIN;

public class InputFormat {
    public static void main(String[] args) {

        String name, lengthS, breadthS, costS, display;
        double length, breadth, cost, totalCost, area;

        name=JOptionPane.showInputDialog("Please enter your name");

        lengthS=JOptionPane.showInputDialog("Please enter the length of the room");
        length=Double.parseDouble(lengthS);

        breadthS=JOptionPane.showInputDialog("Please enter the breadth of the room");
        breadth=Double.parseDouble(breadthS);

        costS=JOptionPane.showInputDialog("Please enter the cost per sq meter of carpet");
        cost=Double.parseDouble(costS);

        area=breadth*length;

        totalCost=area*cost;

        JTextArea textArea = new JTextArea();
        Font textFont = new Font(MONOSPACED,PLAIN,13);
        textArea.setFont(textFont);

        textArea.setText("Quotation for "+name+"\n");

        display=String.format("%-25s%.2fm\n%-25s%.2fm\n%-25s%.2fsq.m\n%-25s%.2f€\n%-25s%.2f€","Length of Room:",length,"Breadth of Room:",breadth,"Total Area of Room:",area,"Cost per Sq M of Carpet:",cost,"Total Cost of Carpet:",totalCost);

        textArea.append(display);

        JOptionPane.showMessageDialog(null,textArea);
    }
}