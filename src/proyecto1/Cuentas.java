/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author marma
 */
public class Cuentas {
    public static int id = 1000;
    private double debito =0; // saldo a favor
    private double credito =0; // saldo ncontra
    private double total = 0;   //total de la cuena
    private Transacciones [] transaccione= new Transacciones[15];

    public Cuentas(double debito) {
        this.debito=debito;
        this.id+=1;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cuentas{" + "debito=" + debito + ", credito=" + credito + ", total=" + total + '}';
    }
    
    
   
    

}
