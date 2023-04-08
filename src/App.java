import Entidades.Cafetera;
import Servicios.CafeteraServicio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("NESPRESSO");
        Cafetera cafetera = new Cafetera(100, 0);
        CafeteraServicio cafeServicio = new CafeteraServicio();
        System.out.println(cafetera.toString());
        ///
        cafeServicio.llenarCafetera(cafetera);
        System.out.println(cafetera);
        ///
        cafeServicio.servirTaza(cafetera, 20);
        System.out.println(cafetera);
        ///
        cafeServicio.vaciarCafetera(cafetera);
        System.out.println(cafetera);
        ///
        cafeServicio.agregarCafe(cafetera, 100);
        System.out.println(cafetera);
    }
}
