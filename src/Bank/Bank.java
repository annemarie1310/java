package Bank;

import javax.accessibility.AccessibleComponent;
// below are access modifiers :- public ,private, protected , default .
/*
Private:  The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
Default:  The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
          If you do not specify any access level, it will be the default.
Protected: The access level of a protected modifier is within the package and outside the package through child class.
          If you do not make the child class, it cannot be accessed from outside the package.
Public:   The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class,
          within the package and outside the package.
*/

class Account{

    public String name;          // available everywhere
    protected String email;      // only within the package and to its sub classes .
    private String password;    // within the class .

    // getters and setters
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass){
        this.password =pass;
    }

}
public class Bank {

     public static void main (String args[]){
         Account account1=new Account();
         account1.name="anne marie";
         account1.email="annemarie@gmail.com";
         account1.setPassword("abcd");
         System.out.println(account1.getPassword());

     }

}
