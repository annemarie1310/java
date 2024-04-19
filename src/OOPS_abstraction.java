abstract class Animal        // abstract means that class which exists only virtually .
{
    abstract void walk();
    public void eats(){
        System.out.println("Animal eats");
    }

}
class Horse extends Animal {
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

// below is how you can create interfaces .

interface Animal2 {
    int eyes =2;
    void walk();

}

// Multiple inheritance is done through interfaces in java and not through class . ( imp interview question )
class Horse2{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
// interface end above line


//------------------------------------------------------------
// below is how you use static keyword .

class Studentinformation {
    String name;
    static String school;       // here we used static because any no.of derived class be made for this base
                                // ..class school will be same for all .
    public static void changeSchool(){
        school="newschool";
    }

}



public class OOPS_abstraction {

        public static void main(String args[])
        {
            Horse horse=new Horse();
            horse.walk();
            horse.eats();

            // interface below
            Horse2 horse2 = new Horse2();
            horse2.walk();
            // interface end above line



            /// static below .
            Studentinformation.school="JMV";
            Studentinformation student1 =new Studentinformation();
            student1.name="Tony";
            student1.changeSchool();
            System.out.println(student1.school);
        }

    }


