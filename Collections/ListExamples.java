import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListExamples {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee(1,"Vineeth",1000000);
        Employee e2 = new Employee(2,"Jyo",100000);
        Employee e3 = new Employee(3,"Rajesh",10000000);
        Employee e4 = new Employee(4,"Sandeep",100000000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        //Basic for loop
        for(int i=0;i<employees.size();i++){
            System.out.println(employees.get(i));
        }

        //enhanced for loop
        for(Employee e:employees){
            System.out.println(e);
        }

        //Iterator
        Iterator<Employee> i = employees.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        // foreach loop iteration
        employees.forEach(System.out::println);

        System.out.println("looping using streams");
        Stream st = employees.stream();
        st.forEach(e->System.out.println(e));
    }
}
