class Bike1{
    Bike1(){System.out.println("Bike is created");}

    public static void main(String []args){
        Bike1 b = new Bike1();
    }
}

class Student4{
    int id;
    String name;

    Student4(int i, String n){
        id = i;
        name = n;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String []args){
         Student4 s1 = new Student4(111, "Abhi");
         Student4 s2 = new Student4(333, "Jerry");

         s1.display();
         s2.display();
    }

}

class Student5{
    int id;
    String name;
    int age;

    Student5(int i, String n){
        id = i;
        name = n;
    }

    Student5(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String []args){
        Student5 s1 = new Student5(111, "Jerry");
        Student5 s2 = new Student5(222, "Abhi", 21);
        s1.display();
        s2.display();
    }
}

class Student6{
    int id;
    String name;

    Student6(int i, String n){
        id = i;
        name = n;
    }

    Student6(Student6 s){
        id = s.id;
        name = s.name;
    }
    void display(){System.out.println(id+" "+name);}

    public static void main(String []args){
        Student6 s1 = new Student6(111,"Jerry");
        Student6 s2 = new Student6(s1);
        s1.display();
        s2.display();
    }
}

class Student7{
    int id;
    String name;
    Student7(int i, String n){
        id = i;
        name = n;
    }
    Student7(){}
    void display(){System.out.println(id+" "+name);}

    public static void main(String []args){
        Student7 s1 = new Student7(111,"Text Text");
        Student7 s2 = new Student7();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }
}
