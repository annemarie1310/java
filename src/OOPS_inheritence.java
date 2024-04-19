class shape{
    String color;
}
class Triangle extends shape {

}
// below are 4 types of inheritance .
// 1) Single level inheritance. where there is  (1 base class ,1 derived class )
// 2) Multi level inheritance . where there is (1 base class,two derived class) data of base class to 1st derived class ,1st derived class to 2nd derived class data is copied.
// 3) Hierarchical inheritance. where there is (1 base class,two derived class) data of same base class to multiple derived class.
// 4) Hybrid inheritance . where mix of Single level inheritance ,Multi level inheritance,Hierarchical inheritance
// 5) multilevel is not possible in java i.e = 1 derived class is extended to 2 base class .
class  Shape2                                            // this is base class
{
    public  void area (){
        System.out.println("displays area ");
    }
}

class Triangle2 extends Shape2                          // this is derived class of base class
{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle2             // this is derived class of Triangle2
{
    public void area (int l, int h){
        System.out.println(1/2*l*h);
    }

}

class Circle extends Shape2                             // this is derived class of base class
{
    public void area (int r){
        System.out.println((3.14)*r*r);
    }
}



public class OOPS_inheritence
{
    public static void main(String args[])
    {

        Triangle t1 =new Triangle();
        t1.color="red";

    }

}
