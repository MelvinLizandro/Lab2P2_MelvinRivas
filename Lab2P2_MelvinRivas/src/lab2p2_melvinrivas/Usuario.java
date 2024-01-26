/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_melvinrivas;

/**
 *
 * @author l3306
 */
public class Usuario {

    private String usuario;
    private String Contraseña;
    private String tipouser;

    public Usuario(String usuario, String Contraseña, String tipouser) {
        this.usuario = usuario;
        this.Contraseña = Contraseña;
        this.tipouser = tipouser;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getTipouser() {
        return tipouser;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setTipouser(String tipouser) {
        this.tipouser = tipouser;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", Contrase\u00f1a=" + Contraseña + ", tipouser=" + tipouser + '}';
    }
    
    
    
}
