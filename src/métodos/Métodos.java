
package métodos;

import javax.swing.JOptionPane;

public class Métodos {

    public static void main(String[] args) {
       int id = 0, tel = 0;
       String nom = "";
       String dir = "";
       
      id = Integer.parseInt(JOptionPane.showInputDialog("digite su identificacion"));
      nom = JOptionPane.showInputDialog("digite sus nombres");
      tel = Integer.parseInt(JOptionPane.showInputDialog("digite su telefono"));
      dir = JOptionPane.showInputDialog("digite su direccion");
      
      Persona personota1 = new Persona (id,nom,tel,dir);
      
      JOptionPane.show
      
      
      
      
      
    }
    
    
}
