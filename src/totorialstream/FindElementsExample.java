package totorialstream;

import java.util.*;

public class FindElementsExample {

    public static void main(String[] args) {


        List<Integer> integerList= Arrays.asList(1,2,3,4,5);

        //find an element on list using stream
        Optional<Integer> result= integerList.stream().findFirst();
        if(result.isEmpty()){
            System.out.println("pas  d'element ");
        }
        else{
            System.out.println(result.get());
        }
//        System.out.println(result);

        //rechercher any element dans le stream

        result=integerList.stream().findAny();
        if(result.isEmpty()){
            System.out.println("pas  d'element ");
        }
        else{
            System.out.println(result.get());
        }

         long nbre= integerList.stream().count();
        System.out.println(nbre);

        System.out.println(integerList.stream().min(Comparator.comparing(Integer::valueOf)).get()) ;





    }
}
