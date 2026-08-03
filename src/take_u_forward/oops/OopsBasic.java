package take_u_forward.oops;

public class OopsBasic {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.assignAge(10);

        System.out.println(student1.age);
        System.out.println(student1.height);
        System.out.println(student1.name);

        OopsBasic oopsBasic = new OopsBasic();
        oopsBasic.println();
    }
    public void println(){
        System.out.println("sum");
    }
}

class Student {
    int age;
    int height;
    String name;

    public void assignAge(int age) {
        this.age = age;
    }

    public void assignHeight(int height) {
        this.height = height;
    }

    public void assignName(String name) {
        this.name = name;
    }
}

