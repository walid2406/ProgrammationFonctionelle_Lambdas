package tutorialsPart2.sorting;

import java.sql.SQLOutput;
import java.util.*;

public class SortList {

    public static void main(String[] args) {
       /*  ***************sorting simple list ********************

       List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        Collections.sort(list); //assending by defautt
        System.out.println(list);
        Collections.reverse(list);// decendant
        System.out.println(list);*/

        List<Employee> employees=new ArrayList<Employee>();
        employees.add(new Employee(10,"Walid",30,1830));
        employees.add(new Employee(20,"employer2",29,1730));
        employees.add(new Employee(30,"employer3",30,1930));
        employees.add(new Employee(40,"employer4",29,2030));
       // System.out.println(employees.toString());

       /* //comparaison en utilisant une classe implemantant comparator overrid comp version sous class local
        class MySort implements Comparator<Employee>{

            @Override
            public int compare(Employee o1, Employee o2) {
                return (int )(o2.getSalary()- o1.getSalary());
            }
        }

        Collections.sort(employees,new MySort());
        System.out.println(employees);*/

/*// sorting using anonymous class
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int )(o2.getSalary()- o1.getSalary());
            }
        });
        System.out.println(employees);*/


        //lambdas version sorting by salary
        employees.sort((o1,o2)-> (int) (o2.getSalary()-o1.getSalary()));
        System.out.println(employees);

        employees.sort((o1,o2)->  (o1.getName().compareToIgnoreCase(o2.getName())));
        System.out.println(employees);


    }
}
