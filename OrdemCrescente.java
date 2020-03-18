import javax.swing.JOptionPane;

public class OrdemCrescente{
   public static void main(String [] args){
      int num1, num2, num3;
      num1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite um numero"));
      num2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite outro numero"));
      num3 = Integer.parseInt(JOptionPane.showInputDialog ("Digite mais um numero"));
      
      if(num1<=num2 && num1<=num3){ 
         if(num2 <= num3){
            JOptionPane.showMessageDialog(null, num1 + " " + " " + num2 + " " + num3);   
         }
         else{
            JOptionPane.showMessageDialog(null, num1 + " " + " " + num3 + " " + num2);   
         }  
      }  
      else{
         if(num2<=num3 && num2<=num1){ 
            if(num1 <= num3){
               JOptionPane.showMessageDialog(null, num2 + " " + " " + num1 + " " + num3);   
            }
            else{
               JOptionPane.showMessageDialog(null, num2 + " " + " " + num3 + " " + num1);   
            }  
         }
         else{
            if(num3<=num2 && num3<=num1){ 
               if(num2 <= num1){
                  JOptionPane.showMessageDialog(null, num3 + " " + " " + num2 + " " + num1);   
               }
               else{
                  JOptionPane.showMessageDialog(null, num3 + " " + " " + num1 + " " + num2);   
               }  
            }
         }      
      }       
   }
}   