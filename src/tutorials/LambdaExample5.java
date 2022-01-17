package tutorials;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample5 {
    public static void main(String[] args) {
        List<String> progLangs=new ArrayList<String>();
        progLangs.add("php");
        progLangs.add("c#");
        progLangs.add("c++");
        progLangs.add("cobol");


        progLangs.sort((e1,e2)-> {
            return (e1.compareToIgnoreCase(e2) );
        });

        progLangs.forEach(e-> System.out.println(e) );
    }
}
