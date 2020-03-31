package afridcorp.packageArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Teacher {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


class TestCode {
    private List<Teacher> teacherList = new ArrayList<Teacher>();


    void addTeacherList(String n, int a) {
        teacherList.add(new Teacher(n, a));
    }

    void printTeacherList() {
        Iterator itr = teacherList.iterator();
        while(itr.hasNext()){
            System.out.println(teacherList.isEmpty());
            System.out.println(teacherList.size());
            break;
        }

        for (Teacher listOfTeacher : teacherList) {
            if(teacherList!=null)
            System.out.println(listOfTeacher.getName());
            System.out.println(listOfTeacher.getAge());
        }
    }

    public static void main(String[] args) {
        TestCode tL = new TestCode();
        tL.addTeacherList("mohamed afrid", 23);
        tL.addTeacherList("Iffath fathima", 10);
        tL.addTeacherList("franklin",34);
        tL.addTeacherList("isa",24);
        tL.addTeacherList("musa",54);
        tL.addTeacherList("syed",48);
        tL.printTeacherList();
    }
}