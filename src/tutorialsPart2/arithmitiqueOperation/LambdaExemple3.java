package tutorialsPart2.arithmitiqueOperation;

public class LambdaExemple3 {

    public static void main(String[] args) {

        Thread thread =new Thread(()-> {


            System.out.println(Thread.currentThread().getName());


        });

        thread.start();

    }
}
