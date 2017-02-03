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
public class Carro {

    private double Numero_Serie;
    private Date Fecha_Ensamblado;
    private Color color;
    private String Marca_llanta;
    private String Polarizado;
    private double Velocidad_Max;
    private double Galones;
    private double Precio;

    public Carro() {
    }

    public Carro(double Numero_Serie, Date Fecha_Ensamblado, Color Pdoubleura, String Marca_llanta, String Polarizado, double Velocidad_Max, double Galones, double Precio) {
        this.Numero_Serie = Numero_Serie;
        this.Fecha_Ensamblado = Fecha_Ensamblado;
        this.color = Pdoubleura;
        this.Marca_llanta = Marca_llanta;
        this.Polarizado = Polarizado;
        this.Velocidad_Max = Velocidad_Max;
        this.Galones = Galones;
        this.Precio = Precio;
    }

    public double getNumero_Serie() {
        return Numero_Serie;
    }

    public void setNumero_Serie(double Numero_Serie) {
        this.Numero_Serie = Numero_Serie;
    }

    public Date getFecha_Ensamblado() {
        return Fecha_Ensamblado;
    }

    public void setFecha_Ensamblado(Date Fecha_Ensamblado) {
        this.Fecha_Ensamblado = Fecha_Ensamblado;
    }

    public Color getPdoubleura() {
        return color;
    }

    public void setPdoubleura(Color Pdoubleura) {
        this.color = Pdoubleura;
    }

    public String getMarca_llanta() {
        return Marca_llanta;
    }

    public void setMarca_llanta(String Marca_llanta) {
        this.Marca_llanta = Marca_llanta;
    }

    public String getPolarizado() {
        return Polarizado;
    }

    public void setPolarizado(String Polarizado) {
        this.Polarizado = Polarizado;
    }

    public double getVelocidad_Max() {
        return Velocidad_Max;
    }

    public void setVelocidad_Max(double Velocidad_Max) {
        this.Velocidad_Max = Velocidad_Max;
    }

    public double getGalones() {
        return Galones;
    }

    public void setGalones(double Galones) {
        this.Galones = Galones;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "Numero_Serie=" + Numero_Serie + ", Fecha_Ensamblado=" + Fecha_Ensamblado + ", Pdoubleura=" + color + ", Marca_llanta=" + Marca_llanta + ", Polarizado=" + Polarizado + ", Velocidad_Max=" + Velocidad_Max + ", Galones=" + Galones + ", Precio=" + Precio + '}';
    }

}
