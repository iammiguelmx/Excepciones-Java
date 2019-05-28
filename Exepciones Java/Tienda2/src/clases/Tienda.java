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
public class Tienda {

    private static int nm;
    private String nombre;
    private Mascota[] mascotas;

    public Tienda(String nombre) {
        this.nombre = nombre;
        mascotas = new Mascota[50];
    }

    public void agregarMascota(String tipo, String raza, int edad, double precio, char sexo) {
        Mascota nuevo = new Mascota();
        nuevo.setTipo(tipo);
        nuevo.setRaza(raza);
        nuevo.setEdad(edad);
        nuevo.setPrecio(precio);
        nuevo.setSexo(sexo);
        mascotas[nm] = nuevo;
        nm++;
    }

    public Mascota[] buscarRaza(String raza) {
        Mascota[] registros = null;//<---
        int nr = 0;//número de registros que cumplen la condición
        int pos = 0;  //<------
        //cuenta cuántas mascotas son de esa raza
        for (int i = 0; i < nm; i++) {
            if (mascotas[i].getRaza().equalsIgnoreCase(raza)) {
                nr++;
            }
        }
        if (nr > 0) {
            registros = new Mascota[nr];
            for (int i = 0; i < nm; i++) {
                if (mascotas[i].getRaza().equalsIgnoreCase(raza)) {
                    registros[pos] = mascotas[i];
                    pos++;
                }
            }
        }
        return registros;
    }
    public Mascota[] buscarPrecio(double precio) {
        Mascota[] registros = null;//<---
        int nr = 0;//número de registros que cumplen la condición
        int pos = 0;  //<------
        //cuenta cuántas mascotas son de esa raza
        for (int i = 0; i < nm; i++) {
            if (mascotas[i].getPrecio()<=precio) {
                nr++;
            }
        }
        if (nr > 0) {
            registros = new Mascota[nr];
            for (int i = 0; i < nm; i++) {
                if (mascotas[i].getPrecio()<=precio) {
                    registros[pos] = mascotas[i];
                    pos++;
                }
            }
        }
        return registros;
    }
}
