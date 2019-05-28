/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JPanel;

/**
 *
 * @author Miguel 
 */
public class Persona {
   
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String fechaNac;
    private String rfc;
    final JPanel panel = new JPanel();
    //Métodos
    private boolean tieneNumero(String str){ 
        if(str.matches(".*\\d.*")) 
            return true;
        else
            return false;
    }
    
    public void setNombre(String nombre) throws Exception{ 
        if(nombre == null || nombre.isEmpty())                        
            throw new Exception("Este campo no puede ser nulo");
        if(tieneNumero(nombre))
            throw new Exception("No escriba números");
        this.nombre= nombre;
    }
    
    public void setApellidoP(String apellidoP) throws Exception{
        if(apellidoP == null || apellidoP.isEmpty())
            throw new Exception("Este campo no puede ser nulo");
        if(tieneNumero(apellidoP))
            throw new Exception("No escriba números");
        this.apellidoP= apellidoP;
    }
    
    public void setApellidoM(String apellidoM) throws Exception{
        if(apellidoM == null || apellidoM.isEmpty())
            throw new Exception("Este campo no puede ser nulo");
        if(tieneNumero(apellidoM))
            throw new Exception("No escriba números");
        this.apellidoM= apellidoM;
    }
    
    public void setFechaNac(String fechaNac) throws Exception{
        if(!fechaNac.matches("\\d{2}/\\d{2}/\\d{4}"))
            throw new Exception("Recuerde el formato (dd/mm/aaaa)");
        this.fechaNac= fechaNac;
    }
    
    public void calcularRfc(){
        rfc= ""+apellidoP.charAt(0);
        int pos=0;
        char letra=' ';
        for(int i=1;i<apellidoP.length();i++){
            letra= apellidoP.charAt(i);
            if(letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U'){
                pos=i;
                break;
            }
        }
        rfc= rfc+apellidoP.charAt(pos);
        rfc= rfc+apellidoM.charAt(0);
        rfc= rfc+nombre.charAt(0);
        rfc= rfc+fechaNac.substring(8);
        rfc= rfc+fechaNac.substring(3, 5);
        rfc= rfc+fechaNac.substring(0, 2);
    }
    
    public String getRfc(){
        return rfc;
    }
    
}//Fin de la clase