package functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

//        Consumer<PredicateExemple.Person>=(person)->person

        List<PredicateExemple.Person> list=new ArrayList<PredicateExemple.Person>();
        list.add(new PredicateExemple.Person("Tony",45));
        list.add(new PredicateExemple.Person("Tom",25));
        list.add(new PredicateExemple.Person("Ramsis",29));

        list.forEach(person ->{
            System.out.println(person.getName());
        } );

        Consumer<PredicateExemple.Person> consumer=(person)-> System.out.println(person.getAge());
        consumer.accept(new PredicateExemple.Person("Ramsis",29));
    }
}
