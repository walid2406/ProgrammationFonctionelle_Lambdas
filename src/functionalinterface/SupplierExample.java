package functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<PredicateExemple.Person> personSupplier=()->new PredicateExemple.Person("fff",12);
        System.out.println(personSupplier.get().toString());

    }
}
