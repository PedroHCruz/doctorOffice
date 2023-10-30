/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import tools.FactoryPostgres;

/**
 *
 * @author l a w t
 */
public class UsuarioDAO {
    
    private Connection conexaoBanco;

    public UsuarioDAO() {
        this.conexaoBanco = FactoryPostgres.getConexaoPostgres();
    }
    
    public boolean logaUsuario(String email, String senha, String cargo) {
        String sql = "SELECT email,senha FROM pedrocruz_individual.usuario WHERE cargo = '" + cargo + "'AND email = '" + email + "' AND senha = '" + senha + "';";
        try ( PreparedStatement trans = this.conexaoBanco.prepareStatement(sql)) {
            ResultSet resultadoBD = trans.executeQuery();

            if (resultadoBD.next()) {
                return true;
            } else {

                return false;
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao logar");
            return false;
        }
        }
}
