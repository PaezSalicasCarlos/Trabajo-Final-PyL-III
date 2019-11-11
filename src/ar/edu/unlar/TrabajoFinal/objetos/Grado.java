/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.TrabajoFinal.objetos;

import java.util.ArrayList;

/**
 *
 * @author DjNiico
 */
public class Grado {
    private Integer id;
    private Integer numero;
    private String seccion;
    private ArrayList <Docente> docentes;
    private ArrayList <Alumno> alumnos; 
    private Turno turno;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Grado() {
    }

    @Override
    public String toString() {
        return "Grado{" + "numero=" + numero + ", seccion=" + seccion + ", docentes=" + docentes + ", alumnos=" + alumnos + ", turno=" + turno + '}';
    }
    
    
}
