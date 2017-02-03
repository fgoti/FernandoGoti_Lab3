/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernandogoti_lab.pkg3;

/**
 *
 * @author Fernando Goti
 */
public class Empleados extends Personas {

    private int Numero_Ht;
    private Clientes Cliente;

    public Empleados() {
        super();
    }

    public Empleados(int Numero_Ht, Clientes Cliente, String Nombre, String ID, double Edad, double Altura, double Peso) {
        super(Nombre, ID, Edad, Altura, Peso);
        this.Numero_Ht = Numero_Ht;
        this.Cliente = Cliente;
    }

    public int getNumero_Ht() {
        return Numero_Ht;
    }

    public void setNumero_Ht(int Numero_Ht) {
        this.Numero_Ht = Numero_Ht;
    }

    public Clientes getCliente() {
        return Cliente;
    }

    public void setCliente(Clientes Cliente) {
        this.Cliente = Cliente;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleados{" + "Numero_Ht=" + Numero_Ht + ", Cliente=" + Cliente + '}';
    }

}
