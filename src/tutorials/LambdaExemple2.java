package tutorials;
interface Printable{

    void print(String message);
}
public class LambdaExemple2  {


    public static void main(String[] args) {

        Printable printable=new Printable() {
            @Override
            public void print(String message) {
                System.out.println(message);

            }
        };
printable.print("bonjour");

Printable printable1=(String message)->System.out.println(message);
printable1.print("boujouuuuuuuuuur");

    }
}
