package Supplier;

import java.util.Objects;
import java.util.function.Supplier;
public class SupplierMain {
    public static void main(String[] args) {
        Supplierx s = new Supplierx("vick",17,"dark black");
        Supplier<String> subject = s::getName;
        Supplier<Integer> subjectAge= s::getAge;
        Supplier<String> subjectColor= s::getSkinColor;
        String nombre = subject.get();
        Integer edad = subjectAge.get();
        String colorDePiel = subjectColor.get();
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\ncolor de piel: "+colorDePiel);
    }
}
