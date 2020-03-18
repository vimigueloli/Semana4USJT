import javax.swing.JOptionPane;

public class SomadorVinte{
   public static void main(String [] args){
      int num1, num2;
      num1 =Integer.parseInt(JOptionPane.showInputDialog ("Digite um numero"));
      num2= Integer.parseInt(JOptionPane.showInputDialog ("Digite outro numero"));
      num1= num1 + num2;
      
      if(num1<=20){
         JOptionPane.showMessageDialog(null,"o resultado é: " + (num1-5));   
      }  
      else{
         JOptionPane.showMessageDialog(null,"o numero é superior a 20" );   
      }       
   }
}   