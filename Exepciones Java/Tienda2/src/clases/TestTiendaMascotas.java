/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Miguel
 */
public class TestTiendaMascotas {

    public static void main(String[] args) {
        final JPanel panel = new JPanel();
        Tienda t1 = new Tienda("El Gato Volador");//<---
        int op = 0;
        String tipo = "";
        String raza = "";
        int edad = 0;
        double precio = 0.0;
        char sexo = ' ';
        boolean bandera = false;

        do {
            Mascota[] mascotas = null;
            do {
                try {
                    op = Integer.parseInt(JOptionPane.showInputDialog("MENU"
                            + "\n1] Agregar mascota"
                            + "\n2] Buscar mascota por raza"
                            + "\n3] Buscar mascota por precio"
                            + "\n4] Salir"));
                    bandera = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(panel, "Introduzca un valor númerico", "Error ", JOptionPane.ERROR_MESSAGE);
                    bandera = false;
                }
            } while (!bandera);
            switch (op) {
                case 1:
                    char letra1 = 0;
                    char letra2 = 0;

                    do {
                        tipo = JOptionPane.showInputDialog("¿Tipo?");
                        bandera = true;
                        for (int o = 0; o < tipo.length(); o++) {
                            letra2 = tipo.charAt(o);
                            if (Character.isLetter(letra2)) {
                                bandera = true;
                            } else {
                                JOptionPane.showMessageDialog(panel, "Introduzca solamente letras", "Error ", JOptionPane.ERROR_MESSAGE);
                                bandera = false;
                            }
                        }
                    } while (!bandera);
                    char letras = 0;
                    do {
                        raza = JOptionPane.showInputDialog("Raza:");
                        for (int i = 0; i < raza.length(); i++) {
                            letras = raza.charAt(i);
                            if (Character.isLetter(letras)) {
                                bandera = true;
                            } else {
                                JOptionPane.showMessageDialog(panel, "Introduzca solamente letras", "Error ", JOptionPane.ERROR_MESSAGE);
                                bandera = false;
                            }
                        }
                    } while (!bandera);

                    do {
                        try {
                            edad = Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));
                            bandera = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(panel, "Introduzca un número entero", "Error ", JOptionPane.ERROR_MESSAGE);
                            bandera = false;
                        }
                    } while (!bandera);
                    do {
                        try {
                            precio = Double.parseDouble(JOptionPane.showInputDialog("¿Precio?"));
                            bandera = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(panel, "Introduzca un valor númerico", "Error ", JOptionPane.ERROR_MESSAGE);
                            bandera = false;
                        }
                    } while (!bandera);
                    do {
                        sexo = JOptionPane.showInputDialog("Sexo").charAt(0);
                        if (sexo == 'M' || sexo == 'F') {
                            bandera = true;
                            t1.agregarMascota(tipo, raza, edad, precio, sexo);
                        } else {
                            bandera = false;
                            JOptionPane.showMessageDialog(panel, "Teclee M ó F", "Error ", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (!bandera);
                    break;
                case 2:
                    do {
                        raza = JOptionPane.showInputDialog("¿Raza?");
                        char letraq = 0;
                        for (int q = 0; q < raza.length(); q++) {
                            letraq = raza.charAt(q);
                            if (Character.isLetter(letraq)) {
                                bandera = true;
                            } else {
                                JOptionPane.showMessageDialog(panel, "Introduzca solamente letras", "Error ", JOptionPane.ERROR_MESSAGE);
                                bandera = false;
                            }
                        }
                    } while (!bandera);
                    mascotas = t1.buscarRaza(raza);
                    if (mascotas != null) {
                        for (int j = 0; j < mascotas.length; j++) {
                            JOptionPane.showMessageDialog(null, mascotas[j].toString());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existen mascotas de esa Raza!!");
                    }
                    break;
                case 3:
                    do {
                        try {
                            precio = Double.parseDouble(JOptionPane.showInputDialog("¿Precio límite?"));
                            bandera = true;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(panel, "Introduzca un valor númerico", "Error ", JOptionPane.ERROR_MESSAGE);
                            bandera = false;
                        }
                    } while (!bandera);
                    mascotas = t1.buscarPrecio(precio);
                    if (mascotas != null) {
                        for (int i = 0; i < mascotas.length; i++) {
                            JOptionPane.showMessageDialog(null, mascotas[i].toString());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existen mascotas con ese límite de precio!!");
                    }
                    break;
                default:
                    if (op == 4) {
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(panel, "Introduzca un valor del 1 al 4", "Error ", JOptionPane.ERROR_MESSAGE);
                    }
            }
        } while (op != 4);
    }
}
