/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.TrabajoFinal.objetos.controladores;

import java.util.ArrayList;

/**
 *
 * @author DjNiico
 * @param <T>
 * @param <I>
 */
public interface ICrud<T, I> {
    public boolean crear(T entidad);
    public boolean eliminar(T entidad);
    public boolean modificar(T entidad);
    public T extraer(I id);
    public ArrayList<T> extraerTodo();
}
