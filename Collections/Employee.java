public class Employee {
    private int employeeid;
    private String employeeName;
    private int employeeSalary;

    public Employee(int empid,String empName,int salary){
        this.employeeid = empid;
        this.employeeName = empName;
        this.employeeSalary = salary;

    }
    public String toString(){
        return "Employee Details are id =" + this.employeeid + " name = " + this.employeeName + " salary=" + this.employeeSalary ;
    }
}
