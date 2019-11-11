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
public class Docente extends Persona{
    private Integer numeroLegajo;
    private Cargo tipoCargo;
    private Integer id;

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public Cargo getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(Cargo tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    @Override
    public String toString() {
        return "Docente{" + "numeroLegajo=" + numeroLegajo + ", tipoCargo=" + tipoCargo + '}';
    }

    public Docente() {
    }
    
    
   
}
