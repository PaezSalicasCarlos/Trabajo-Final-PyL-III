/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.TrabajoFinal.objetos.controladores;

import ar.edu.unlar.TrabajoFinal.objetos.Alumno;
import java.util.ArrayList;

/**
 *
 * @author DjNiico
 */
public class AlumnoDTO extends Transaccion implements ICrud<Alumno, Integer> {
    
    public AlumnoDTO(Conexion conexion) {
        super(conexion);
    }

    @Override
    public boolean crear(Alumno entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Alumno entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Alumno entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno extraer(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Alumno> extraerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
