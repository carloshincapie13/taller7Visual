
package model;

import static java.lang.Math.round;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public abstract class Acueducto {
    private int metros;
    private double vlrConsumo;

    public Acueducto(int metros) {
        this.metros = metros;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public double getVlrConsumo() {
        return vlrConsumo;
    }

    public void setVlrConsumo(double vlrConsumo) {
        this.vlrConsumo = vlrConsumo;
    }
    
    public abstract void consumo();
    
    public void presenta(double exceso, double alcantarillado){
        JOptionPane.showMessageDialog(null,"Valor consumo: "+getVlrConsumo()+
                                        "\nValor Exceso: "+exceso+
                                        "\nValor alcantarillado: "+alcantarillado+
                                       "\nTotal a pagar: "+(getVlrConsumo()+exceso+alcantarillado));
    }
    
    public void presenta(double exceso,double alcantarillado,
                         JLabel lblConsumo, JLabel lblAlcantarillado,
                         JLabel lblExceso, JLabel lblNeto ){
        
        DecimalFormat formato = new DecimalFormat("#,###,###.##");
        /*
        lblConsumo.setText(""+round(getVlrConsumo()));
        lblAlcantarillado.setText(""+round(alcantarillado));
        lblExceso.setText(""+round(exceso));
        lblNeto.setText(""+round(getVlrConsumo()+exceso+alcantarillado));
        */
        lblConsumo.setText(""+formato.format(getVlrConsumo()));
        lblAlcantarillado.setText(""+formato.format(alcantarillado));
        lblExceso.setText(""+formato.format(exceso));
        lblNeto.setText(""+formato.format(getVlrConsumo()+exceso+alcantarillado));
    }
    
    
}
