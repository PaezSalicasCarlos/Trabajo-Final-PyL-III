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
public class Alumno extends Persona {
    private Integer matricula;
    private Integer id;
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Alumno{" + "matricula=" + matricula + '}';
    }

    public Alumno() {
    }
    
    
}
