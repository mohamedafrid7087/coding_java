package afridcorp.packageArray;

public class Employee {
    String name;
    int empId;
    boolean isIndian;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public boolean isIndian() {
        return isIndian;
    }

    public void setIndian(boolean indian) {
        isIndian = indian;
    }

    public Employee(String name, int empId, boolean isIndian) {
        this.name = name;
        this.empId = empId;
        this.isIndian = isIndian;
    }
}


class MainCode{
    Employee[] employeeList = new Employee[5];

    public void addEmpForm(String name, int age, boolean isIndian) {
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] == null) {
                employeeList[i] = new Employee(name, age, isIndian);
                break;
            }
        }
    }

    public void increaseEmpFormSize(){
        Employee[] tempEmpFormSize = new Employee[1000];
        copyPreviousEmpForm(employeeList, tempEmpFormSize);
    }

    public Employee[] copyPreviousEmpForm(Employee[] oldEmployeeList, Employee[] newEmployeeList){
        for(int i=0 ; i<oldEmployeeList.length; i++) {
            oldEmployeeList[i] = newEmployeeList[i];
        }
        return newEmployeeList;
    }

    public void printEmpForm() {
        System.out.println(employeeList.length);
        for (Employee eachEmpForm : employeeList) {
            if (employeeList != null) {
                System.out.println(eachEmpForm.name);
                System.out.println(eachEmpForm.empId);
                System.out.println(eachEmpForm.isIndian);
            }
        }
    }

    public static void main(String[] args) {
        MainCode empForm = new MainCode();
        empForm.addEmpForm("mohamed afrid", 01, true);
        empForm.addEmpForm("tommy", 02, false);
        empForm.addEmpForm("jimmy", 03, false);
        empForm.printEmpForm();
    }
}
