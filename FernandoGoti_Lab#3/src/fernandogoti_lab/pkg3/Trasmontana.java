/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernandogoti_lab.pkg3;

import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Goti
 */
public class Trasmontana extends Carro {

    private double Peso;
    private double Trasmision;

    public Trasmontana() {
        super();
    }

    public Trasmontana(double Peso, double Trasmision, double Numero_Serie, Date Fecha_Ensamblado, Color Pdoubleura, String Marca_llanta, String Polarizado, double Velocidad_Max, double Galones, double Precio) {
        super(Numero_Serie, Fecha_Ensamblado, Pdoubleura, Marca_llanta, Polarizado, Velocidad_Max, Galones, Precio);
        this.Peso = Peso;
        this.Trasmision = Trasmision;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        if (Peso > 0 && Peso > 1276 && Peso < 1376) {
            this.Peso = Peso;
        } else {
            JOptionPane.showMessageDialog(null, "El peso debe ser mayor que 0 y ser mayor que 1276 y menor que 1376");
        }
    }

    public double getTrasmision() {
        return Trasmision;
    }

    public void setTrasmision(double Trasmision) {
        if (Trasmision > 6 && Trasmision < 7) {
            this.Trasmision = Trasmision;
        } else {
            JOptionPane.showMessageDialog(null, "La Trasmision solo puede ser de 6 0 7 Velocidades.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Trasmontana{" + "Peso=" + Peso + ", Trasmision=" + Trasmision + '}';
    }

}
