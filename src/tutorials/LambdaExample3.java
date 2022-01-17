package tutorials;

import java.nio.file.FileSystemNotFoundException;
import java.sql.SQLOutput;

interface Addable{
    int add(int a, int b);

}
public class LambdaExample3 {

    public static void main(String[] args) {
        Addable addable=new Addable() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

        int c=addable.add(5,30);
        System.out.println(c);

        Addable addable1=(int a,int b)-> a+b;
        System.out.println(addable1.add(45,5));
    }
}
