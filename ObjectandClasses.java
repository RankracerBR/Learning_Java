// public class ObjectandClasses {
//     int x = 10;
//     public static void main(String []args){
//         MyClass Obj = new DemoClass();
//         System.out.println(Obj.x);
//     }
// }


class Student{
    int stuid;
    String name;
    public static void main(String []args){
        Student stu1 = new Student();
        System.out.println(stu1.stuid);
        System.out.println(stu1.name);
    }
}

class DemoStudent{
    public static void main(String []args){
        Student stu1 = new Student();
        System.out.println(stu1.stuid);
        System.out.println(stu1.name);
    }
}

class DemoStudent2{
    public static void main(String []args){
        Student stu1 = new Student();
        stu1.stuid = 001;
        stu1.name = "Anand";
        System.out.println(stu1.stuid+" "+stu1.name);
    }
}

class Student2{
    int stuid;
    String name;

    void savData(int a, String b){
        stuid = a;
        name = b;
    }

    void showData(){
        System.out.println(stuid+" "+name);
    }
}

class DemoStudent3{
    public static void main(String []args){
        Student2 stu1 = new Student2();
        Student2 stu2 = new Student2();
        stu1.savData(001, "Abhi");
        stu2.savData(002, "Nitin");
        stu1.showData();
        stu2.showData();
    
    }
}

class Student3{
    int stuid;
    String name;
    float marks;
    void insert(int i, String n, float m){
        stuid = i;
        name = n;
        marks = m;
    }
    void show(){
        System.out.println(stuid+" "+name+" "+marks);
    }
}

public class ObjectandClasses{
    public static void main(String []args){
        Student3 stu1 = new Student3();
        Student3 stu2 = new Student3();
        stu1.insert(001, "Nitin", 95);
        stu2.insert(002, "pankaj", 90);
        stu1.show();
        stu2.show();
    }
}