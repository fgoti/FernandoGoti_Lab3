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
public class Morgan_Aero_8 extends Carro {

    private String Conbertible;
    private String Cabina;

    public Morgan_Aero_8() {
        super();
    }

    public Morgan_Aero_8(String Conbertible, String Cabina, double Numero_Serie, Date Fecha_Ensamblado, Color Pdoubleura, String Marca_llanta, String Polarizado, double Velocidad_Max, double Galones, double Precio) {
        super(Numero_Serie, Fecha_Ensamblado, Pdoubleura, Marca_llanta, Polarizado, Velocidad_Max, Galones, Precio);
        this.Conbertible = Conbertible;
        this.Cabina = Cabina;
    }

    public String getConbertible() {
        return Conbertible;
    }

    public void setConbertible(String Conbertible) {
        this.Conbertible = Conbertible;
    }

    public String getCabina() {
        return Cabina;
    }

    public void setCabina(String Cabina) {
        this.Cabina = Cabina;
    }

    @Override
    public String toString() {
        return super.toString() + "Morgan_Aero_8{" + "Conbertible=" + Conbertible + ", Cabina=" + Cabina + '}';
    }

}
