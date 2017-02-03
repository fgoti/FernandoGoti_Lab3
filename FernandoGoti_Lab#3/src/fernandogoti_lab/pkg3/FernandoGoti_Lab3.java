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
        String opcion4 = "";
        String opcion5 = "";

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
        if (opcion.equals("b")) {
            while (!opcion4.equalsIgnoreCase("g")) {
                opcion4 = JOptionPane.showInputDialog(" a)Modificar Clientes.\n"
                        + "b)  Modificar Empleado.\n"
                        + "c) Modificar Carros.\n"
                        + "g) Salir.\n");
                if (opcion4.equals("a")) {
                    int p1;
                    p1 = Integer.parseInt(
                            JOptionPane.showInputDialog("Posicion de la Persona:"));
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
                    ((Clientes) (Lista_Personas.get(p1))).setID(ID);
                    ((Clientes) (Lista_Personas.get(p1))).setNombre(Nombre);
                    ((Clientes) (Lista_Personas.get(p1))).setAltura(Altura);
                    ((Clientes) (Lista_Personas.get(p1))).setEdad(Edad);
                    ((Clientes) (Lista_Personas.get(p1))).setPeso(Peso);
                    ((Clientes) (Lista_Personas.get(p1))).setDinero(Dinero);
                }
                if (opcion4.equals("b")) {
                    int p1;
                    p1 = Integer.parseInt(
                            JOptionPane.showInputDialog("Posicion del Empleado:"));
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
                    ((Empleados) (Lista_Personas.get(p1))).setNombre(Nombre);
                    ((Empleados) (Lista_Personas.get(p1))).setID(ID);
                    ((Empleados) (Lista_Personas.get(p1))).setEdad(Edad);
                    ((Empleados) (Lista_Personas.get(p1))).setAltura(Altura);
                    ((Empleados) (Lista_Personas.get(p1))).setPeso(Peso);
                    ((Empleados) (Lista_Personas.get(p1))).setNumero_Ht(Numero_Ht);
                }
                if (opcion4.equals("c")) {
                    int p1;

                    while (!opcion5.equalsIgnoreCase("g")) {
                        opcion5 = JOptionPane.showInputDialog(" a)Maybach.\n"
                                + "b)  Morgan Aero 8.\n"
                                + "c) Fisker Automotive,.\n"
                                + "d) Tramontana.\n"
                                + "g) Salir.\n");
                        if (opcion4.equals("a")) {
                            p1 = Integer.parseInt(
                                    JOptionPane.showInputDialog("Posicion del Carro:"));
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
                            ((Maybach) (Lista_Carros.get(p1))).setColor(color);
                            ((Maybach) (Lista_Carros.get(p1))).setFecha_Ensamblado(Fecha_Ensamblado);
                            ((Maybach) (Lista_Carros.get(p1))).setGalones(Galones);
                            ((Maybach) (Lista_Carros.get(p1))).setLlantas_Rep(Llantas_Rep);
                            ((Maybach) (Lista_Carros.get(p1))).setMarca_llanta(Marca_llanta);
                            ((Maybach) (Lista_Carros.get(p1))).setNumero_Serie(Numero_Serie);
                            ((Maybach) (Lista_Carros.get(p1))).setPolarizado(Polarizado);
                            ((Maybach) (Lista_Carros.get(p1))).setPrecio(Precio);
                            ((Maybach) (Lista_Carros.get(p1))).setVelocidad_Max(Velocidad_Max);
                        }
                        if (opcion4.equals("b")) {
                            p1 = Integer.parseInt(
                                    JOptionPane.showInputDialog("Posicion del Carro:"));
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
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setCabina(Cabina);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setColor(color);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setConbertible(Conbertible);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setFecha_Ensamblado(Fecha_Ensamblado);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setGalones(Galones);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setMarca_llanta(Marca_llanta);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setNumero_Serie(Numero_Serie);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setPolarizado(Polarizado);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setPrecio(Precio);
                            ((Morgan_Aero_8) (Lista_Carros.get(p1))).setVelocidad_Max(Velocidad_Max);
                        }
                        if (opcion4.equals("c")) {
                            p1 = Integer.parseInt(
                                    JOptionPane.showInputDialog("Posicion del Carro:"));
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
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setColor(color);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setConvertible_Si_no(Convertible_Si_no);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setFecha_Ensamblado(Fecha_Ensamblado);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setGalones(Galones);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setMarca_llanta(Marca_llanta);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setNumero_Serie(Numero_Serie);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setPolarizado(Polarizado);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setPrecio(Precio);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setTipo_Auto(Tipo_Auto);
                            ((Fisker_Automotive) (Lista_Carros.get(p1))).setVelocidad_Max(Velocidad_Max);
                        }
                        if (opcion4.equals("c")) {
                            p1 = Integer.parseInt(
                                    JOptionPane.showInputDialog("Posicion del Carro:"));
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
                            ((Trasmontana) (Lista_Carros.get(p1))).setColor(color);
                            ((Trasmontana) (Lista_Carros.get(p1))).setFecha_Ensamblado(Fecha_Ensamblado);
                            ((Trasmontana) (Lista_Carros.get(p1))).setGalones(Galones);
                            ((Trasmontana) (Lista_Carros.get(p1))).setMarca_llanta(Marca_llanta);
                            ((Trasmontana) (Lista_Carros.get(p1))).setNumero_Serie(Numero_Serie);
                            ((Trasmontana) (Lista_Carros.get(p1))).setPolarizado(Polarizado);
                            ((Trasmontana) (Lista_Carros.get(p1))).setPrecio(Precio);
                            ((Trasmontana) (Lista_Carros.get(p1))).setTrasmision(Trasmision);
                            ((Trasmontana) (Lista_Carros.get(p1))).setVelocidad_Max(Velocidad_Max);
                            ((Trasmontana) (Lista_Carros.get(p1))).setPeso(Peso);
                        }
                    }
                }
            }
        }
    }
}
