package totorialstream;

import java.util.*;
import java.util.stream.Stream;

public class CreateStreamObjects {

    public static void main(String[] args) {

        //create stream
        Stream<String> stream=Stream.of("a","b","c");
        stream.forEach(System.out::println);

        //create a stream from source
        Collection<String> collection= Arrays.asList("Java","J2EE","Spring","Hebernate");
        Stream<String> stream2=collection.stream();
        stream2.forEach(System.out::println);

        //from list
        List<String> list= Arrays.asList("JavaL","J2EEL","SpringL","HebernateL");
        Stream<String> stream3=list.stream();
        stream3.forEach(System.out::println);

        //from set
        Set<String> set=new HashSet<>(list);
        Stream<String> stream4=set.stream();
        stream4.forEach(System.out::println);

        //from array
        String[] strArray={"a","b","c"};
        Stream<String> stream5= Arrays.stream(strArray);
        stream5.forEach(System.out::println);


    }
}
