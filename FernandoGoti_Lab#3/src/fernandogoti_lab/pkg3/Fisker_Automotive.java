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
public class Fisker_Automotive extends Carro {

    private double Tipo_Auto;
    private double Convertible_Si_no;

    public Fisker_Automotive() {
        super();
    }

    public Fisker_Automotive(double Tipo_Auto, double Convertible_Si_no, double Numero_Serie, Date Fecha_Ensamblado, Color Pdoubleura, String Marca_llanta, String Polarizado, double Velocidad_Max, double Galones, double Precio) {
        super(Numero_Serie, Fecha_Ensamblado, Pdoubleura, Marca_llanta, Polarizado, Velocidad_Max, Galones, Precio);
        this.Tipo_Auto = Tipo_Auto;
        this.Convertible_Si_no = Convertible_Si_no;
    }

    public double getTipo_Auto() {
        return Tipo_Auto;
    }

    public void setTipo_Auto(double Tipo_Auto) {
        this.Tipo_Auto = Tipo_Auto;
    }

    public double getConvertible_Si_no() {
        return Convertible_Si_no;
    }

    public void setConvertible_Si_no(double Convertible_Si_no) {
        this.Convertible_Si_no = Convertible_Si_no;
    }

    @Override
    public String toString() {
        return super.toString() + "Fisker_Automotive{" + "Tipo_Auto=" + Tipo_Auto + ", Convertible_Si_no=" + Convertible_Si_no + '}';
    }

}
