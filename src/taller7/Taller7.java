
package taller7;

import javax.swing.JOptionPane;
import model.Factura;

public class Taller7 {

    public static void main(String[] args) {
        // TODO code application logic here
        int metros = Integer.parseInt(JOptionPane.showInputDialog("Digite metros cubicos de agua "));
        
        Factura factura = new Factura(metros);
        
        factura.consumo();
        double exceso = factura.exceso();
        double alcantarillado= factura.alcantarillado();
        factura.presenta(exceso, alcantarillado);
    }
    
}
