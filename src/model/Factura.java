
package model;

public class Factura extends Acueducto implements OtrosConsumos {

    public Factura(int metros) {
        super(metros);
    }

    @Override
    public void consumo(){
        
        if (getMetros()<=10){
            setVlrConsumo(getMetros()*vlr1); }
        else{ if (getMetros()<=20){
                  setVlrConsumo( (10*vlr1)+( (getMetros()-10)) * vlr2);
                 }
              else{
                   setVlrConsumo( (10*vlr1)+(10*vlr2)+( (getMetros()-20)*vlr3 ));
                }
            }
    }
    
    @Override
    public double alcantarillado(){
        return (getVlrConsumo()*alc);
    }

    @Override
    public double exceso(){
        if (getMetros()>20){
            return ( (getMetros()-20)*vlr3*exc );
        }
        return 0;
    }

    
}
