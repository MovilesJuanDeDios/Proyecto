package cr.ac.una.escinf.proyectoaerolinea.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by slon on 9/4/2018.
 */

public class Usuario {

    private String usuario;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String correo;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;
    private String celular;
    private List<Tiquete> listaTiquetes;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, String nombre, String apellidos, String correo, Date fechaNacimiento, String direccion, String telefono, String celular) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        listaTiquetes = new ArrayList<>();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Tiquete> getListaTiquetes() {
        return listaTiquetes;
    }

    public void setListaTiquetes(List<Tiquete> listaTiquetes) {
        this.listaTiquetes = listaTiquetes;
    }
}
