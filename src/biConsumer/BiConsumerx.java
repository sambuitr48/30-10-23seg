package biConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
public class BiConsumerx {

        public static void main(String[] args) {
            List<String> hombres = Arrays.asList("Sam", "Tamara", "Lui");
            List<String> mujeres = Arrays.asList("Dieguita", "", "Samuela");

            List<String> parejas = new ArrayList<>();

            BiConsumer<String, String> biConsumer = (s1, s2) -> parejas.add(s1 + " " + s2);
            for(int i=0; i<hombres.size(); i++) {
                biConsumer.accept(hombres.get(i), mujeres.get(i));
            }
            System.out.println("Las parejas de esta noche son: "+ parejas);
        }
    }

