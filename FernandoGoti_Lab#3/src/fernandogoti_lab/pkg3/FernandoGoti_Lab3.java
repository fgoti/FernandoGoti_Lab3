/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernandogoti_lab.pkg3;

import java.util.ArrayList;
import java.util.Date;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando Goti
 */
public class FernandoGoti_Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList Lista_Clientes = new ArrayList();
        ArrayList Lista_Empleados = new ArrayList();
        String opcion = "";
        String opcion2 = "";
        String opcion3 = "";

        while (!opcion.equalsIgnoreCase("g")) {
            opcion = JOptionPane.showInputDialog(" a)Agregar.\n"
                    + "b) Modificar.\n"
                    + "c) Eliminar.\n"
                    + "g) Salir.\n");
        }
        if (opcion.equals("a")) {
            while (!opcion2.equalsIgnoreCase("g")) {
                opcion2 = JOptionPane.showInputDialog(" a)Agregar Cliente.\n"
                        + "b) Agregar Empleado.\n"
                        + "c) Agregar Carro.\n"
                        + "g) Salir.\n");
                if (opcion2.equals("a")) {
                    String Nombre = JOptionPane.showInputDialog("Nombre: ");
                    String ID = JOptionPane.showInputDialog("Ingrese numero de identidad: ");
                    double Edad = Double.parseDouble(
                            JOptionPane.showInputDialog("Edad :"));
                    double Altura = Double.parseDouble(
                            JOptionPane.showInputDialog("Altura :"));
                    double Peso = Double.parseDouble(
                            JOptionPane.showInputDialog("Peso :"));
                    double Dinero = Double.parseDouble(
                            JOptionPane.showInputDialog("Dinero: :"));
                    Lista_Clientes.add(new Clientes(Dinero, Nombre, ID, Edad, Altura, Peso));
                }
                if (opcion2.equals("b")) {
                    String Nombre = JOptionPane.showInputDialog("Nombre: ");
                    String ID = JOptionPane.showInputDialog("Ingrese numero de identidad: ");
                    double Edad = Double.parseDouble(
                            JOptionPane.showInputDialog("Edad :"));
                    double Altura = Double.parseDouble(
                            JOptionPane.showInputDialog("Altura :"));
                    double Peso = Double.parseDouble(
                            JOptionPane.showInputDialog("Peso :"));
                    int Numero_Ht = Integer.parseInt(
                            JOptionPane.showInputDialog("Horas Trabajadas: "));

                }
                if (opcion3.equals("c")) {
                    while (!opcion3.equalsIgnoreCase("g")) {
                        opcion2 = JOptionPane.showInputDialog(" a)Maybach.\n"
                                + "b)  Morgan Aero 8.\n"
                                + "c) Fisker Automotive,.\n"
                                + "d) Tramontana.\n"
                                + "g) Salir.\n");
                        if (opcion3.equals("a")) {
                            double Numero_Serie = Double.parseDouble(
                                    JOptionPane.showInputDialog("Ingrese numero de serie: :"));
                            Date fecha = new Date();
                            Color color = Color.BLUE;
                            String Marca_llanta = JOptionPane.showInputDialog("Ingrese Marca de la llanta: ");
                            String Polarizado = JOptionPane.showInputDialog("Esta polarizado [SI/NO]: ");
                            double Velocidad_Max = Double.parseDouble(
                                    JOptionPane.showInputDialog("Velocidad Maxima :"));
                            double Galones = Double.parseDouble(
                                    JOptionPane.showInputDialog("Galones :"));
                            double Precio = Double.parseDouble(
                                    JOptionPane.showInputDialog("Precio :"));
                            int Llantas_Rep = Integer.parseInt(
                                    JOptionPane.showInputDialog("LLantas de repuesto [1/2]: "));
                        }

                    }

                }
            }

        }
    }
}
