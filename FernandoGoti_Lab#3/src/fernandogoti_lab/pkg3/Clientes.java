/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernandogoti_lab.pkg3;

import java.util.ArrayList;

/**
 *
 * @author Fernando Goti
 */
public class Clientes extends Personas {

    private double Dinero;
    private ArrayList<Carro> Carros = new ArrayList();

    public Clientes() {
        super();
    }

    public Clientes(double Dinero, String Nombre, String ID, double Edad, double Altura, double Peso) {
        super(Nombre, ID, Edad, Altura, Peso);
        this.Dinero = Dinero;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<Carro> getCarros() {
        return Carros;
    }

    public void setCarros(ArrayList<Carro> Carros) {
        this.Carros = Carros;
    }

    @Override
    public String toString() {
        return "Clientes{" + "Dinero=" + Dinero + ", Carros=" + Carros + '}';
    }

}
