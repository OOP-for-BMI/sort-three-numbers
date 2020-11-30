package sortthreenumbers;

import javax.swing.JOptionPane;

public class SortThreeNumbers {

    public static void main(String[] args) {
        Integer number1 = 0;
        Integer number2 = 0;
        Integer number3 = 0;
        Integer temporaryNumber = 0;
        
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number 1"));
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number 2"));
        number3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number 3"));
        
        if(number1>number2){
            temporaryNumber = number1;
            number1 = number2;
            number2=temporaryNumber;
        }
        if(number1>number3){
            temporaryNumber = number1;
            number1 = number3;
            number3=temporaryNumber;
        }
        if(number2>number3){
            temporaryNumber = number2;
            number2 = number3;
            number3=temporaryNumber;
        }
        
        JOptionPane.showMessageDialog(null, "Ascensing Order is \n" + number1 + "\n" + number2 + "\n" + number3);
    }

}
