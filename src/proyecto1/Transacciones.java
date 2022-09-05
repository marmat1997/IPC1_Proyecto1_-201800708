/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.Date;

/**
 *
 * @author marma
 */
public class Transacciones {
    private static int no_transaccion=5000;
    public Date fecha; // inicializar
    private String tipo_transaccion;
    private double cantidad;

    public Transacciones(String tipo_transaccion, double cantidad) {
        this.tipo_transaccion = tipo_transaccion;
        this.cantidad = cantidad;
        no_transaccion+=1;
        
    }

    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(String tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Transacciones{" + "fecha=" + fecha + ", tipo_transaccion=" + tipo_transaccion + ", cantidad=" + cantidad + '}';
    }
    
    
    
    
    
}
