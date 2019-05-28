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
public class TestImc {

    public static void main(String[] args) {
        Persona2 p1 = new Persona2();
        String nombre = "";
        double peso = 0.0;
        double estatura = 0.0;
        String dato = ""; 
        boolean bandera = false;
        final JPanel panel = new JPanel();
        do {
         char letra2=0;
        nombre = JOptionPane.showInputDialog("Nombre?");
         bandera = true;
                        for (int o = 0; o < nombre.length(); o++) {
                            letra2 = nombre.charAt(o);
                            if (Character.isLetter(letra2)) {
                                bandera = true;
                            } else {
                                JOptionPane.showMessageDialog(panel, "Introduzca solamente letras", "Error ", JOptionPane.ERROR_MESSAGE);
                                bandera = false;
                            }
                        }
        }while(!bandera);
        
        do {
            try {
                dato = JOptionPane.showInputDialog("Peso?");
                peso = Double.parseDouble(dato);                 
                bandera = true;
            } catch (NumberFormatException e) {
                 JOptionPane.showMessageDialog(panel, "Introduzca un valor númerico", "Error ", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            } catch (java.lang.NullPointerException e) {
                JOptionPane.showMessageDialog(panel, "No puede dejar este campo vacio", "Error ", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
        } while (!bandera);

        do {
            try {
                bandera = false;
                dato = JOptionPane.showInputDialog("Estatura?");
                estatura = Double.parseDouble(dato);             
                bandera = true;
            } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(panel, "Introduzca un valor númerico", "Error ", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(panel, "No puede dejar este campo vacio", "Error ", JOptionPane.ERROR_MESSAGE);
                bandera = false;
            }
        } while (!bandera);

        p1.setEstatura(estatura);
        p1.setPeso(peso);
        p1.calcularImc();
        p1.calcularSalud();
        JOptionPane.showMessageDialog(null, "IMC: " + p1.getImc() + "\nSalud: " + p1.getSalud());
    }
}
