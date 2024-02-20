import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if(num%2==0){
            JOptionPane.showMessageDialog(null,"El numero digitado es par" );
        }else{
            JOptionPane.showMessageDialog(null,"El numero digitado es impar" );
        }

    }
}