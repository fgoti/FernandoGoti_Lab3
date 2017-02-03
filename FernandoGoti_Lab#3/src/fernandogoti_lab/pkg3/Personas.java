/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernandogoti_lab.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Goti
 */
public class Personas {

    private String Nombre;
    private String ID;
    private double Edad;
    private double Altura;
    private double Peso;

    public Personas() {
        super();
    }

    public Personas(String Nombre, String ID, double Edad, double Altura, double Peso) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Edad = Edad;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getEdad() {
        return Edad;
    }

    public void setEdad(double Edad) {
        if (Edad > 18) {
            this.Edad = Edad;
        } else {
            JOptionPane.showMessageDialog(null, "Debe ser Mayor de 18 años.");
        }
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        if (Altura > 1.55) {
            this.Altura = Altura;
        } else {
            JOptionPane.showMessageDialog(null, "La altura debe ser mayor de 1.55.");
        }
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", ID=" + ID + ", Edad=" + Edad + ", Altura=" + Altura + ", Peso=" + Peso + '}';
    }

}
