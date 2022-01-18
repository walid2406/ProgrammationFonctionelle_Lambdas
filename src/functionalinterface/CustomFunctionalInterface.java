package functionalinterface;

@FunctionalInterface
interface Printable
{
    void print(String message);



}

public class CustomFunctionalInterface {

    public static void main(String[] args) {
        Printable printable=(message)-> System.out.println(message);
        printable.print("bonjour lambda");
    }
}
