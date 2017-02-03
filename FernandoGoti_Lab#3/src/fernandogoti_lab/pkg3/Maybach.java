/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernandogoti_lab.pkg3;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Fernando Goti
 */
public class Maybach extends Carro {

    private int Llantas_Rep;

    public Maybach() {
        super();
    }

    public Maybach(int Llantas_Rep, int Numero_Serie, Date Fecha_Ensamblado, Color Pintura, String Marca_llanta, String Polarizado, int Velocidad_Max, int Galones, int Precio) {
        super(Numero_Serie, Fecha_Ensamblado, Pintura, Marca_llanta, Polarizado, Velocidad_Max, Galones, Precio);
        this.Llantas_Rep = Llantas_Rep;

    }

    public int getLlantas_Rep() {
        return Llantas_Rep;
    }

    public void setLlantas_Rep(int Llantas_Rep) {
        this.Llantas_Rep = Llantas_Rep;
    }

    @Override
    public String toString() {
        return super.toString() + "Maybach{" + "Llantas_Rep=" + Llantas_Rep + '}';
    }

}
