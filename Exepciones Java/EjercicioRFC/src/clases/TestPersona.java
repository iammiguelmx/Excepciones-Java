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

public class TestPersona {
    public static void main(String[] args) {
        Persona p1= new Persona();
        String nombre="";
        String apellidoP="";
        String apellidoM="";
        String fechaNac="";
        boolean bandera=false;
        char letra2=0;
        final JPanel panel = new JPanel();
        
        JOptionPane.showMessageDialog(null,"Cálculo del RFC");
        while(true){
            try{
                p1.setNombre(JOptionPane.showInputDialog(null, "Ingrese Nombre")); 
                break;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        while(true){
            try{
                p1.setApellidoP(JOptionPane.showInputDialog(null,"Ingrese Apellido Paterno"));
                break;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        while(true){
            try{
                p1.setApellidoM(JOptionPane.showInputDialog(null, "Ingrese Apellido Materno"));
                break;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        while(true){
            try{
                p1.setFechaNac(JOptionPane.showInputDialog(null, "Ingrese Fecha de Nacimiento (dd/mm/aaaa)"));
                break;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        p1.calcularRfc();
        JOptionPane.showMessageDialog(null, "El RFC es: "+p1.getRfc());
    }
    
}