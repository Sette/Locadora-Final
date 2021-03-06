/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufmt.ic.locadora.dao;

import br.ufmt.ic.locadora.exception.RegistroException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author raphael
 */
public interface GenericaDAO<T> {
    
    public void inserir(T generica) throws RegistroException,SQLException;
    
    public void remover(int codigo) throws SQLException;
    
    public void alterar(T generica) throws SQLException;
    
    public T consultar(int codigo);
    
    public List<T> listar();
    
}
