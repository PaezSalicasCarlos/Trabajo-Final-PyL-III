/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.TrabajoFinal.objetos;

/**
 *
 * @author DjNiico
 */
public class Turno {
    private Integer id;
    private String codigo;
    private String descripcion;
    private Grado grado;
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public Turno() {
    }

    @Override
    public String toString() {
        return "Turno{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", grado=" + grado + '}';
    }
    
    
}
