/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Miguel
 */
public class Mascota {
    private String tipo;
    private String raza;
    private int edad;
    private double precio;
    private char sexo;
    
    public void setTipo(String tipo){
   this.tipo= tipo;
}
    public void setRaza(String raza){
        this.raza= raza;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    public void setPrecio(double precio){
        this.precio= precio;
    }
    public void setSexo(char sexo){
        this.sexo= sexo;
    }
    public String getTipo(){
        return tipo;
    }
    public String getRaza(){
        return raza;
    }
    public double getPrecio(){
        return precio;
    }
    public String toString(){
        return "Tipo: "+tipo+
                "\nRaza: "+raza+
                "\nEdad: "+edad+
                "\nPrecio: "+precio+
                "\nSexo: "+sexo;
    }
}
