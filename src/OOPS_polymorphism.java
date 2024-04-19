
class Studentinfo {
    String name ;
    int age;

    //polymorphism below :-
    // below we have used one function name for doing different thing like print name, print age and print both..
    //... creating and using one function name in same class to do different things is called :- ( FUNCTION OVERLOADING )
    // ( Early Binding ) is done while FUNCTION OVERLOADING called static method.
    // return type is checked not method overriding
    // Rules of creating functions as polymorphism .   !!!!!!!
    // 1 there should be some differentiator .
    // ya toh functions return types should be different; or if return types are same then parameters should be different;...
    //... or if return type and parameters are same then number of parameters should be different .


    // parameter , signatures ,and name of method is same is called method ( FUNCTION OVERRIDING in java ); called as polymorphism .
    // ( Late binding )is done in method overriding. called as dynamic overriding at the time of runtime it decides.
    // return type is checked in method overriding
    public void printInfo (String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}

class a extends Studentinfo{

    String name ;
    public void printInfo (String name){
        System.out.println(name);
    }

}

public class OOPS_polymorphism extends Studentinfo{

    public static void main(String args[]){
        Studentinfo s1 =new Studentinfo();
        s1.name="josh"; s1.age=30;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name , s1.age);

        a a1= new a();
        a1.name="nicole";
        a1.printInfo(a1.name);

    }

}
