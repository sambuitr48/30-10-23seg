package biconsumer2;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class SimulacionCorrupcion {
    public static void main(String[] args) {
        ArrayList<String> votantes = new ArrayList<>();
        ArrayList<String> candidatos = new ArrayList<>();

        votantes.add("Tamara");
        votantes.add("Gustavo");
        votantes.add("Diego Norrea");

        candidatos.add("Padilla");
        candidatos.add("Fico Gutierrez");
        candidatos.add("Garay");

        BiConsumer<String, String> compraDeVotos = (votante, candidato) -> {
            System.out.println(votante + " recibe un incentivo para votar por " + candidato);
        };

        for (String votante : votantes) {
            String candidatoElegido = candidatos.get((int) (Math.random() * candidatos.size()));
            compraDeVotos.accept(votante, candidatoElegido);
        }
    }
}
