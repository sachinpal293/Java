package oop;

import encapsulation.enrcypt;

public class MainClass {
    public static void main(String[] args) {
//       person p1 = new person(21,"Sachin Kumar Pal");
//       p1.name = "Sachin Kumar Pal";
//       p1.age = 21;
//
//        System.out.println(p1.age +" "+p1.name );
//        p1.walk();
//        p1.eat();
//        p1.walk(5);
//        System.out.println(person.count);

//        Developer d1 = new Developer(20,"Nisha Mehta");
//        d1.walk();



        // Encapsulation
        enrcypt e1 = new enrcypt();
        e1.dowork();
    }
}



class Developer extends person
{

    Developer(int newage, String newName) {
        super(newage, newName);
    }
    // It is run time Polymorphism
    void walk()
    {
        System.out.println("Developer " +name+" is walking very fast");
    }
}

class person {
    protected String name;
    int age;
    static int count;
//      person()
//     {
//         count++;
//         System.out.println("Creating object");
//     }

     person(int newage, String newName)
     {
//         this();
         this.name = newName;
         this.age = newage;
         System.out.println(this.name+" "+this.age);
     }
    void walk() {
        System.out.println(name + " is walking");
    }

    void eat()
    {
        System.out.println(name+" is eating");
    }

    // it is complie time polymorphism
    void walk(int steps)
    {
        System.out.println(name+" is walking "+ steps +"steps");
    }

    void dowork()
    {
        System.out.println(name+" is doing his/her work");
    }
}
