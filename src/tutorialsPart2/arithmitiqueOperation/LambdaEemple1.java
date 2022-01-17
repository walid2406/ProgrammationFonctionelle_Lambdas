package tutorialsPart2.arithmitiqueOperation;

interface Arithmetique{
    int operation(int a,int b);
}

public class LambdaEemple1 {
    public static void main(String[] args) {

        //addition
        Arithmetique arithmetique=(a,b)->a+b;
        System.out.println(arithmetique.operation(50,30));

        //soustarction
        Arithmetique arithmetique1=(a,b)->a-b;
        System.out.println(arithmetique1.operation(50,30));


    }


}
