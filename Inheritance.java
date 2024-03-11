class Employee{
    float salary = 40000;
}

class Programmer extends Employee{
    int bonus = 10000;
    public static void main(String []args){
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: "+p.salary);
        System.out.println("Bonus of Programmer is: "+p.bonus);
    }
}

class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
    void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
    public static void main(String []args){
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}

class Animal2{
    void eat (){
        System.out.println("eating ...");
    }
}
class Dog2 extends Animal2{
    void bark(){
        System.out.println("barking...");
    }
}
class BabyDog extends Dog2{
    void weep(){
        System.out.println("weeping...");
    }
}

class TestInheritance4{
    public static void main(String []args){
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}


class one{
    public void print_phpa(){
        System.out.println("PHPPOINT");
    }
}
class two extends one{
    public void print_me(){
        System.out.println("Jerry");
    }
}
class three extends one{
    /*................*/
}

// public class Inheritance{
//     public static void main(String []args){
//         three g = new three();
//         g.print_phpa();
//     }
// }


// interface One 
// { 
// 	public void print_php2(); 
// } 

// interface Two
// { 
// 	public void print_me2(); 
// } 

// interface Three extends One,Two
// { 
// 	public void print_php2(); 
// } 
// class child implements Three 
// { 
// 	@Override
// 	public void print_php2() { 
// 		System.out.println("PHPTPOINT"); 
// 	} 

// 	public void print_me2() 
// 	{ 
// 		System.out.println("Jerry"); 
// 	} 
// } 

// // Drived class 
// public class Inheritance
// { 
// 	public static void main(String[] args) 
// 	{ 
// 		child c = new child(); 
// 		c.print_php2(); 
// 		c.print_me2(); 
// 		c.print_php2(); 
// 	} 
// }

// class A{
//     void msg(){
//         System.out.println("Hello");
//     }
// }
// class B{
//     void msg(){
//         System.out.println("Welcome");
//     }
// }
// class C extends A, B{
//     public static void main(String []args){
//         C obj = new C();
//         obj.msg();
//     }
// }