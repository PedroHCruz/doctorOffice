/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author l a w t
 */
public class UsuarioControl {
    
    private UsuarioDAO dao;

    public UsuarioControl() {
        this.dao = new UsuarioDAO();
    }
     public boolean logaUsuario(String email, String senha, String cargo) {
            if(cargo.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Selecione um cargo", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }        
            if (email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira um email válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            if (senha.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira uma senha válida!", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            return this.dao.logaUsuario(email, senha, cargo);
    }
    
}

