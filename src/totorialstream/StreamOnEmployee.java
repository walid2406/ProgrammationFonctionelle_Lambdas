package totorialstream;

import tutorialsPart2.sorting.Employee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamOnEmployee {

    public static void main(String[] args) {



        //creation list of string
        List<String> stringList=new ArrayList<String>();
        stringList.add("walid");
        stringList.add("sirine");
        stringList.add("fourat");
        stringList.add("khaled");
        stringList.add("zeineb");

        System.out.println("******source**********");
        System.out.println(stringList);

        //list of string object asc
        System.out.println("ascendant..................");
        stringList.stream().sorted((e1,e2)->e1.compareToIgnoreCase(e2)).forEach(System.out::println);
        //list of string object desc
        System.out.println("descendant............");
        stringList.stream().sorted((e1,e2)->e2.compareToIgnoreCase(e1)).forEach(System.out::println);


        //creation list of employee
        List<Employee> employees=new ArrayList<Employee>();
        employees.add(new Employee(10,"Walid",30,1830));
        employees.add(new Employee(20,"employer2",29,1730));
        employees.add(new Employee(30,"employer3",30,1930));
        employees.add(new Employee(40,"employer4",29,2030));

        //list of employee by salary asc
        System.out.println("list of employee by salary asc............");
        employees.stream().sorted((e1,e2)-> (int) ( e1.getSalary()-e2.getSalary())).forEach(System.out::println);

        //list of employee by salary desc
        System.out.println("list of employee by salary desc............");
        employees.stream().sorted((e1,e2)-> (int) ( e2.getSalary()-e1.getSalary())).forEach(System.out::println);





        //list of employee by age asc
        System.out.println("list of employee by age asc............");
        employees.stream().sorted((e1,e2)-> (int) ( e1.getAge()-e2.getAge())).forEach(System.out::println);
        //list of employee by age desc
        System.out.println("list of employee by age desc............");
        employees.stream().sorted((e1,e2)-> (int) ( e2.getAge()-e1.getAge())).forEach(System.out::println);

        //list of employee by name asc
        System.out.println("list of employee by name asc............");
        employees.stream().sorted((e1,e2)-> (int) ( e1.getName().compareToIgnoreCase(e2.getName()))).forEach(System.out::println);
        //list of employee by name desc
        System.out.println("list of employee by name desc............");
        employees.stream().sorted((e1,e2)-> (int) ( e2.getName().compareToIgnoreCase(e1.getName()))).forEach(System.out::println);

    //afficher le salaire muin
        System.out.println("le salaire minimum est "+
        employees.stream().min(Comparator.comparing(Employee::getSalary)).get().getSalary()
                );

        //afficher le salaire maximum
        System.out.println("le salaire maxxxxxx est "+
                employees.stream().max(Comparator.comparing(Employee::getSalary)).get().getSalary()
        );


    }


}
