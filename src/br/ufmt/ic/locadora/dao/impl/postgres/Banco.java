/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.locadora.dao.impl.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raphael
 */
public class Banco {

    protected Connection conexao;

    public Banco(boolean postgresql) {
        try {
            if (postgresql) {
                conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bdlocadora", "postgres", "123");
            } else {
                conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdlocadora", "root", "123");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void executar(String sql) {
        try {
            conexao.createStatement().execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public PreparedStatement prepareStatement(String sql) {
        try {
            return conexao.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet executarQuery(String sql) {
        try {
            return conexao.createStatement().executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
