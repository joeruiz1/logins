/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import conexiones.conexion;
import VO.usuario;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class servicioLogin {
    private Connection connection;

    public servicioLogin() throws IOException, SQLException {
        connection = conexion.getConnection();
    }

    public void agregarUsuario(usuario usuario) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Usuarios(usuario,contraseña) values (?, ? )");
            // Parameters start with 1
            preparedStatement.setString(1, usuario.getUsuario());
            preparedStatement.setString(2, usuario.getContraseña());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("agrego algo");
        }
    }
    
}

