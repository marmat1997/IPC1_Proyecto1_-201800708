/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;
public class Usuarios {
public Cuentas[] cuentas = new Cuentas[3];

private long id;
public String NombreUsuario;
public String ApellidoUsuario;
private String Contraseña;
int ContadorUsuarios = 1000;
    public long getId() {
        return id;
    }
    public long setId() {
        return id;
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }

    public void setApellidoUsuario(String ApellidoUsuario) {
        this.ApellidoUsuario = ApellidoUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public Usuarios(long id, String NombreUsuario, String ApellidoUsuario, String Contraseña) {
        this.id = id;
        this.NombreUsuario = NombreUsuario;
        this.ApellidoUsuario = ApellidoUsuario;
        this.Contraseña = Contraseña;
        //ContadorUsuarios ++;
    }

}
