import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee{
    private String name;
    private Department dept;
    public Employee(String name, Department dept){
        this.name = name;
        this.dept = dept;
    }
    public String getName(){
        return name;
    }
   public String getDept(){
        return dept.getDeptName();
   }
}

class Department{
    private String deptName;
    public Department(String deptName){
        this.deptName = deptName;
    }
    public String getDeptName(){
        return deptName;
    }
}



public class Q5 {

    public static void grouping(Map<String, List<String>> map, List<Employee> list){
        for(Employee i : list){
            if(!map.containsKey(i.getDept())){
                map.put(i.getDept(), new ArrayList<>(List.of(i.getName())));
            }else {
                map.get(i.getDept()).add(i.getName());
            }
        }
        System.out.println(map);

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("ram",new Department("HR"));
        Employee emp2 = new Employee("raj",new Department("HR"));
        Employee emp3 = new Employee("rev",new Department("IT"));
        Employee empr = new Employee("moorthy",new Department("Tech"));

        Map<String, List<String>> map = new HashMap<>();
        List<Employee>  list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(empr);

        grouping(map,list);
    }
}
