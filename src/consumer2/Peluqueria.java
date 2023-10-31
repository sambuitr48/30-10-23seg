package consumer2;
import java.util.ArrayList;
import java.util.function.Consumer;
public class Peluqueria {
    public static void main(String[] args) {
        Consumer<String> estilista = cliente -> {
            System.out.println("El estilista está cortando las greñas de " + cliente);
            TipoCorte tipoCorte = obtenerTipoCorteAleatorio();
            System.out.println("Realizando un corte " + tipoCorte + " para " + cliente);
        };
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("Evaristo");
        clientes.add("Gildardo");
        clientes.add("Octavio");
        for (String cliente : clientes) {
            estilista.accept(cliente);
        }
    }
    static TipoCorte obtenerTipoCorteAleatorio() {
        TipoCorte[] tipos = TipoCorte.values();
        int indice = (int) (Math.random() * tipos.length);
        return tipos[indice];
    }
}
