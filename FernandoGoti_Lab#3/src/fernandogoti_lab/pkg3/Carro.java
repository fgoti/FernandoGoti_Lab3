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

    private int Numero_Serie;
    private Date Fecha_Ensamblado;
    private Color Pintura;
    private String Marca_llanta;
    private String Polarizado;
    private int Velocidad_Max;
    private int Galones;
    private int Precio;

    public Carro() {
    }

    public Carro(int Numero_Serie, Date Fecha_Ensamblado, Color Pintura, String Marca_llanta, String Polarizado, int Velocidad_Max, int Galones, int Precio) {
        this.Numero_Serie = Numero_Serie;
        this.Fecha_Ensamblado = Fecha_Ensamblado;
        this.Pintura = Pintura;
        this.Marca_llanta = Marca_llanta;
        this.Polarizado = Polarizado;
        this.Velocidad_Max = Velocidad_Max;
        this.Galones = Galones;
        this.Precio = Precio;
    }

    public int getNumero_Serie() {
        return Numero_Serie;
    }

    public void setNumero_Serie(int Numero_Serie) {
        this.Numero_Serie = Numero_Serie;
    }

    public Date getFecha_Ensamblado() {
        return Fecha_Ensamblado;
    }

    public void setFecha_Ensamblado(Date Fecha_Ensamblado) {
        this.Fecha_Ensamblado = Fecha_Ensamblado;
    }

    public Color getPintura() {
        return Pintura;
    }

    public void setPintura(Color Pintura) {
        this.Pintura = Pintura;
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

    public int getVelocidad_Max() {
        return Velocidad_Max;
    }

    public void setVelocidad_Max(int Velocidad_Max) {
        this.Velocidad_Max = Velocidad_Max;
    }

    public int getGalones() {
        return Galones;
    }

    public void setGalones(int Galones) {
        this.Galones = Galones;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Carro{" + "Numero_Serie=" + Numero_Serie + ", Fecha_Ensamblado=" + Fecha_Ensamblado + ", Pintura=" + Pintura + ", Marca_llanta=" + Marca_llanta + ", Polarizado=" + Polarizado + ", Velocidad_Max=" + Velocidad_Max + ", Galones=" + Galones + ", Precio=" + Precio + '}';
    }

}
