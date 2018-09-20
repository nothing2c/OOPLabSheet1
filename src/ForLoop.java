import javax.swing.*;

public class ForLoop {
    public static void main(String[] args) {

        int inches;

        JTextArea textArea = new JTextArea();
        textArea.setText(String.format("%-10s%-10s\n%-10s%-10s","Yards","Inches","-----","------"));

        for(int yards=1;yards<=10;yards++)
        {
            inches=yards*36;

            textArea.append(String.format("\n%-10d%-10d",yards,inches));
        }

        JOptionPane.showMessageDialog(null,textArea);
    }
}
