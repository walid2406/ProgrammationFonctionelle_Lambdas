package functionalinterface;


import java.util.function.Predicate;

public class PredicateExemple {
    public static void main(String[] args) {

        Predicate<Person> predicate=(person)->person.getAge()>30;
        boolean result=predicate.test(new Person("walid",42));
        System.out.println(result);


    }

    static class Person{

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
