/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fernandogoti_lab.pkg3;

import java.util.ArrayList;
import java.util.Date;
import java.awt.Color;
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

        ArrayList Lista_Personas = new ArrayList();
        ArrayList Lista_Carros = new ArrayList();
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
                    Lista_Personas.add(new Clientes(Dinero, Nombre, ID, Edad, Altura, Peso));
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
                    Lista_Personas.add(new Clientes(Numero_Ht, Nombre, ID, Edad, Altura, Peso));
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
                            Date Fecha_Ensamblado = new Date();
                            Color color = new Color(Color.BITMASK);
                            String Marca_llanta = JOptionPane.showInputDialog("Ingrese Marca de la llanta: ");
                            String Polarizado = JOptionPane.showInputDialog("Esta polarizado [SI/NO]: ");
                            double Velocidad_Max = Double.parseDouble(
                                    JOptionPane.showInputDialog("Velocidad Maxima :"));
                            while (Velocidad_Max < 155 || Velocidad_Max > 160) {
                                JOptionPane.showMessageDialog(null, "La velocidad maxima debe estar entre 155 a 160 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Velocidad Maxima :"));
                            }
                            double Galones = Double.parseDouble(
                                    JOptionPane.showInputDialog("Galones :"));
                            while (Galones < 55 || Galones > 55) {
                                JOptionPane.showMessageDialog(null, "Los galones deben estar entre 50 a 55 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Galones :"));
                            }
                            double Precio = Double.parseDouble(
                                    JOptionPane.showInputDialog("Precio :"));
                            while (Precio < 400000 || Precio > 600000) {
                                JOptionPane.showMessageDialog(null, "El precio deben estar entre 400000 a 600000 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Precio :"));
                            }
                            int Llantas_Rep = Integer.parseInt(
                                    JOptionPane.showInputDialog("LLantas de repuesto [1/2]: "));
                            Lista_Carros.add(new Maybach(Llantas_Rep, Numero_Serie, Fecha_Ensamblado, color, Marca_llanta, Polarizado, Velocidad_Max, Galones, Precio));
                        }
                        if (opcion3.equals("b")) {
                            double Numero_Serie = Double.parseDouble(
                                    JOptionPane.showInputDialog("Ingrese numero de serie: :"));
                            Date Fecha_Ensamblado = new Date();
                            Color color = new Color(Color.BITMASK);
                            String Marca_llanta = JOptionPane.showInputDialog("Ingrese Marca de la llanta: ");
                            String Polarizado = JOptionPane.showInputDialog("Esta polarizado [SI/NO]: ");
                            double Velocidad_Max = Double.parseDouble(
                                    JOptionPane.showInputDialog("Velocidad Maxima :"));
                            while (Velocidad_Max < 140 || Velocidad_Max > 145) {
                                JOptionPane.showMessageDialog(null, "La velocidad maxima debe estar entre 155 a 160 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Velocidad Maxima :"));
                            }
                            double Galones = Double.parseDouble(
                                    JOptionPane.showInputDialog("Galones :"));
                            while (Galones < 35 || Galones > 40) {
                                JOptionPane.showMessageDialog(null, "Los galones deben estar entre 50 a 55 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Galones :"));
                            }
                            double Precio = Double.parseDouble(
                                    JOptionPane.showInputDialog("Precio :"));
                            while (Precio < 500000 || Precio > 700000) {
                                JOptionPane.showMessageDialog(null, "El precio deben estar entre 400000 a 600000 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Precio :"));
                            }
                            String Conbertible = JOptionPane.showInputDialog("Convertible [si/no]: ");
                            String Cabina = JOptionPane.showInputDialog("Cabina [Unica/Doble]: ");
                            Lista_Carros.add(new Morgan_Aero_8(Conbertible, Cabina, Numero_Serie, Fecha_Ensamblado, color, Marca_llanta, Polarizado, Velocidad_Max, Galones, Precio));
                        }
                        if (opcion3.equals("c")) {
                            double Numero_Serie = Double.parseDouble(
                                    JOptionPane.showInputDialog("Ingrese numero de serie: :"));
                            Date Fecha_Ensamblado = new Date();
                            Color color = new Color(Color.BITMASK);
                            String Marca_llanta = JOptionPane.showInputDialog("Ingrese Marca de la llanta: ");
                            String Polarizado = JOptionPane.showInputDialog("Esta polarizado [SI/NO]: ");
                            double Velocidad_Max = Double.parseDouble(
                                    JOptionPane.showInputDialog("Velocidad Maxima :"));
                            while (Velocidad_Max < 140 || Velocidad_Max > 145) {
                                JOptionPane.showMessageDialog(null, "La velocidad maxima debe estar entre 155 a 160 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Velocidad Maxima :"));
                            }
                            double Galones = Double.parseDouble(
                                    JOptionPane.showInputDialog("Galones :"));
                            while (Galones < 35 || Galones > 40) {
                                JOptionPane.showMessageDialog(null, "Los galones deben estar entre 50 a 55 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Galones :"));
                            }
                            double Precio = Double.parseDouble(
                                    JOptionPane.showInputDialog("Precio :"));
                            while (Precio < 500000 || Precio > 700000) {
                                JOptionPane.showMessageDialog(null, "El precio deben estar entre 400000 a 600000 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Precio :"));
                            }
                            String Tipo_Auto = JOptionPane.showInputDialog("Tipo de auto [Camioneta/Turismo]: ");
                            String Convertible_Si_no = JOptionPane.showInputDialog("Es Convertible [SI/NO]: ");
                            Lista_Carros.add(new Fisker_Automotive(Tipo_Auto, Convertible_Si_no, Numero_Serie, Fecha_Ensamblado, color, Marca_llanta, Polarizado, Velocidad_Max, Galones, Precio));
                        }
                        if (opcion3.equals("d")) {
                            double Numero_Serie = Double.parseDouble(
                                    JOptionPane.showInputDialog("Ingrese numero de serie: :"));
                            Date Fecha_Ensamblado = new Date();
                            Color color = new Color(Color.BITMASK);
                            String Marca_llanta = JOptionPane.showInputDialog("Ingrese Marca de la llanta: ");
                            String Polarizado = JOptionPane.showInputDialog("Esta polarizado [SI/NO]: ");
                            double Velocidad_Max = Double.parseDouble(
                                    JOptionPane.showInputDialog("Velocidad Maxima :"));
                            while (Velocidad_Max < 175 || Velocidad_Max > 180) {
                                JOptionPane.showMessageDialog(null, "La velocidad maxima debe estar entre 155 a 160 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Velocidad Maxima :"));
                            }
                            double Galones = Double.parseDouble(
                                    JOptionPane.showInputDialog("Galones :"));
                            while (Galones < 50 || Galones > 55) {
                                JOptionPane.showMessageDialog(null, "Los galones deben estar entre 50 a 55 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Galones :"));
                            }
                            double Precio = Double.parseDouble(
                                    JOptionPane.showInputDialog("Precio :"));
                            while (Precio < 8000000 || Precio > 1000000) {
                                JOptionPane.showMessageDialog(null, "El precio deben estar entre 400000 a 600000 km");
                                Double.parseDouble(
                                        JOptionPane.showInputDialog("Precio :"));
                            }
                            double Peso = Double.parseDouble(
                                    JOptionPane.showInputDialog("Peso :"));
                            double Trasmision = Double.parseDouble(
                                    JOptionPane.showInputDialog("Trasmision :"));
                            Lista_Carros.add(new Trasmontana(Peso, Trasmision, Numero_Serie, Fecha_Ensamblado, color, Marca_llanta, Polarizado, Velocidad_Max, Galones, Precio));
                        }
                    }

                }
            }
        }
    }

}
