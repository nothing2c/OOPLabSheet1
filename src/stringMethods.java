import javax.swing.*;

public class stringMethods {
    public static void main(String[] args) {

        String name, allCaps, surname;
        int charTotal;
        char firstInitial;

        name=JOptionPane.showInputDialog("Please enter your name");

        charTotal=getNameLength(name);

        firstInitial=name.charAt(0);

        allCaps=name.toUpperCase();

        surname=getSurname(name);

        JOptionPane.showMessageDialog(null,charTotal+"\n"+firstInitial+"\n"+allCaps+"\n"+surname);
}

    private static int getNameLength(String name){
        int total=0;

        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i)!=' ')
                total++;
        }

        return total;
    }

    private static String getSurname(String name) {

        int position;

        position=name.lastIndexOf(' ');

        return name.substring(position,name.length());
    }
    }
