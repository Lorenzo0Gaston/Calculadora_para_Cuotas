package Logica;

public class Procesos {

    private double valor;
    private double porcentaje;
    private double montoCuota;
    private double total;
    private int cantCuota;

    public Procesos() {
    }

    public Procesos(double valor, double porcentaje, double montoCuota, double total, int cantCuota) {
        this.valor = valor;
        this.porcentaje = porcentaje;
        this.montoCuota = montoCuota;
        this.total = total;
        this.cantCuota = cantCuota;
    }
    
   public void calcularTotal(){
       total = valor + (valor * porcentaje / 100);
   }
   
   public void valorCuota(){
       montoCuota = total/ cantCuota;
   }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantCuota() {
        return cantCuota;
    }

    public void setCantCuota(int cantCuota) {
        this.cantCuota = cantCuota;
    }
    
    
    
}
