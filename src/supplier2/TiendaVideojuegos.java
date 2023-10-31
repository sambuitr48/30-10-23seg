package supplier2;

import java.util.ArrayList;
import java.util.function.Supplier;

public class TiendaVideojuegos {
    public static void main(String[] args) {
        ArrayList<String> videojuegosDisponibles = new ArrayList<>();
        videojuegosDisponibles.add("El chavo");
        videojuegosDisponibles.add("Aurelio Cheverony");
        videojuegosDisponibles.add("Grand theft auto tu voz estereo");
        videojuegosDisponibles.add("Simulador Colombia 1988");
        Supplier<String> obtenerInfoVideojuego = () -> {
            int indiceAleatorio = (int) (Math.random() * videojuegosDisponibles.size());
            String videojuegoAleatorio = videojuegosDisponibles.get(indiceAleatorio);
            return "Título: " + videojuegoAleatorio + ", Precio: 6876983475 millones de bolivares";
        };
        String informacionVideojuego = obtenerInfoVideojuego.get();
        System.out.println("Información sobre un videojuego disponible en la tienda:");
        System.out.println(informacionVideojuego);
    }
}
