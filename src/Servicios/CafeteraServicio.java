package Servicios;

import Entidades.Cafetera;

public class CafeteraServicio {

    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Cafetera llenando");
    }

    //
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
        System.out.println("Cafetera vaciando");
    }

    ///
    public void servirTaza(Cafetera cafetera, int tamanioTazaVacia) {
        if (cafetera.getCantidadActual() < tamanioTazaVacia) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - cafetera.getCantidadActual());
            System.out.println("Taza incompleta, no alcanzaba lo que tenia la cafetera");
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanioTazaVacia);
            System.out.println("Taza llena");
        }
    }

    ///
    public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
        if ((cafetera.getCantidadActual() + cantidadCafe) < cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
            System.out.println("Pedido completa, se agrego a cafetera: " + cantidadCafe);
        }
        if ((cafetera.getCantidadActual() + cantidadCafe) == cafetera.getCapacidadMaxima()) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
            System.out.println("Pedido completa, se agrego a cafetera: " + cantidadCafe);
        } else {
            System.out.println(
                    "Pedido incuumplido porque " + cantidadCafe + " Supera la capacidad maxima de la cafetera.");
        }
    }

}
