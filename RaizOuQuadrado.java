import javax.swing.JOptionPane;

public class RaizOuQuadrado{
   public static void main(String [] args){
      double numero;
      numero = Double.parseDouble(JOptionPane.showInputDialog ("Digite um numero"));
      
      if(numero<0){
         numero= Math.pow(numero, 2);
         JOptionPane.showMessageDialog(null,"o quadrado do numero é: " + numero);   
      }  
      else{
         numero= Math.pow(numero, 0.5);
         JOptionPane.showMessageDialog(null,"a raiz do numero é: " + numero);   
      }       
   }
}   