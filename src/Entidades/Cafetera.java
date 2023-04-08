package Entidades;

public class Cafetera {
    private double capacidadMaxima;
    private double cantidadActual;

    ///
    public Cafetera() {

    }

    //
    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    ///
    @Override
    public String toString() {
        return "{" +
                " capacidadMaxima='" + getCapacidadMaxima() + "'" +
                ", cantidadActual='" + getCantidadActual() + "'" +
                "}";
    }

    ///
    public double getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    //
    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    ///
    public double getCantidadActual() {
        return this.cantidadActual;
    }

    //
    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

}
