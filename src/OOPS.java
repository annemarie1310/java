// below is class 1
class Pen                     // this is a Pen class which we created .
{

    // below is  blueprint /properties which are  defined below of above class .
    String color;
    String type;  //ball /gen/ink.

    // below are function which are defined in class are called methods : which are below eg:- write(),printColor().
    public void write (){
        System.out.println("Writing something");
    }

    public void printColor()
    {                                     // Here 'this'  is keyword helps function to know which function has called it .
        System.out.println(this.color);     // Here which ever object will call 'this' function it will do the ... .
                                          //... work for it .as below pen1 & pen2 are calling this function and 'this'.color is printing its color .
    }
}

// below is class 2
class Student
{
    // object names below .
    String name;
    int age;


    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
/*
    Student ()         // example of non parameter constructor  // constructor do not have return type such as void etc..
    {
        System.out.println("Constructor called");
    }
*/

    Student(String name , int age)  // example of constructor with parameters
    {
        this.name=name;         // here purple colored name is object name;  and name in white color is what we have passed as parameter .
        this.age=age;
    }


    // below is example of copy constructor .
    Student(Student s3){
        this.name=s3.name;
        this.age=s3.age;
    }

    Student(){

    }



}



// below is how you create objects for above class
public class OOPS {
    public static void main(String args[])
    {
/*
        Pen pen1 = new Pen();              // Pen is class name,pen1 is its name over here .
        pen1.color="blue";                 // Over here properties are defined and properties are accessed with ..
        pen1.type="gel";                    //.. the help of '.'dot which s defined in its blueprint .

        Pen pen2=new Pen();
    pen2.color="black";
    pen2.type="ink";

    pen1.printColor();   // here we have called the above function created in blueprint.
    pen2.printColor();

    pen1.write();
*/
/*
        Student s1=new Student();   // Here new keyword is creating a new memory in heap and storing all data of the object .
        s1.name="josh";            //…. And student() is if a special function called constructor
        s1.age=21;
        s1.printInfo();
*/

//        Student s1=new Student();           // calling constructor with no parameter

        Student s2=new Student("aman" ,24);   // calling constructor with parameter
        s2.printInfo();

/*
        // below for copy constructor
        Student s1 =new Student();
            s1.name="arthur";
            s1.age=25;

        Student s3 =new Student(s1);  // here we have passed (s1) so that it will copy all data of s1 into s3 .
        s3.printInfo();
*/







    }

}
