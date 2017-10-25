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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class servicioLogin {
    private Connection connection;

public void agregarContexto(usuario usu) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("");
            // Parameters start with 1
            preparedStatement.setString(1, usu.getContraseña());
            preparedStatement.setString(2, usu.getContraseña());
          
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("agrego algo");
        }
    }
   
//            

    
            
              public ArrayList<usuario> busqueda() {
        ArrayList<usuario> usuarios = new ArrayList<usuario>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from usuario where usuarios ='fernando' or usuarios='fabiola' and contraseña='localAGR'");
            while (rs.next()) {
                
                usuario u=new usuario();

                u.setUsuario(rs.getString("usuario "));
                u.setContraseña(rs.getString("contrasena"));
               
                usuarios.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    
    
}

}

