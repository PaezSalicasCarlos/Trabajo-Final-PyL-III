/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.TrabajoFinal.objetos.controladores;

import ar.edu.unlar.TrabajoFinal.objetos.Turno;
import java.util.ArrayList;

/**
 *
 * @author DjNiico
 */
public class TurnoDTO extends Transaccion implements ICrud<Turno, Integer>{
    
    public TurnoDTO(Conexion conexion) {
        super(conexion);
    }

    public TurnoDTO() {
    }
    
    @Override
    public boolean crear(Turno entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(Turno entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(Turno entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Turno extraer(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Turno> extraerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
