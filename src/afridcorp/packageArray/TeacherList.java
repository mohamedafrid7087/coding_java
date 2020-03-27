package afridcorp.packageArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherList {
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

    public TeacherList(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class TestCode {
    private List<TeacherList> teacherList = new ArrayList<TeacherList>();

    void addTeacherList(String n, int a) {
        teacherList.add(new TeacherList(n, a));
    }

    void printTeacherList() {
        for (TeacherList listOfTeacher : teacherList) {
            System.out.println(listOfTeacher.getName());
            System.out.println(listOfTeacher.getAge());
        }
    }

    public static void main(String[] args) {
        TestCode tL = new TestCode();
        tL.addTeacherList("mohamed afrid", 23);
        tL.addTeacherList("Iffath fathima", 10);
        tL.printTeacherList();
    }
}
