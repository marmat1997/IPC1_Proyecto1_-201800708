package proyecto1;
public class Cuentas {
    public  static int id = 1000;
    private int idCuenta;
    private double debito =0; // saldo a favor
    private double credito =0; // saldo ncontra
    private double total = debito - credito;   //total de la cuena
    private Transacciones [] transaccione= new Transacciones[15];

    public Cuentas(double debito) {
        this.debito=debito;
        idCuenta=id;
        this.id+=1;
        
        this.total= debito-credito;
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
        this.total = debito - credito;
    }

    public int getId() {
        return this.idCuenta;
    }

    public void setId(int id) {
        this.idCuenta = id;
    }
    
    @Override
    public String toString() {
        return "Cuentas{" + "debito=" + debito + ", credito=" + credito + ", total=" + total + '}'+ "ID= "+this.idCuenta;
    }
    
    
   
    

}
