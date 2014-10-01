import java.io.*;
import java.util.*;

public class Greeter {

    private String greeting = new String("Hello world!");

    // constructors
    /* Notes 
       -the name is the same as the class name
       -there is no return type (nothing between public and the name)
       -it's ALWAYS public

       a constructor is run automatically when you instantiate the class. 
       that is, if you have: Greeter g = new Greeter("Hello")
       then Java will automatically call this constructor sending Hello 
       in as parameter g. It will then set the instance variable
       greeting to what g refers to, which is hello
    */

    public Greeter(String g) {
	greeting = g;
    }

    /* we can overload methos ( including constructors) which means we
       have more than one method with the same name. They just have 
       to have different "signatures" which means different parameter types.
       Java figures our which one to run by matching parameter types
     */
    // regular methods

    public void setGreeting(String s) {
	greeting = s;
    }

    // String is the "return type," that is, the type of data that we
    // will send back using the return statement
    // void is a special "return type" which means we won't be returning any 
    // value
    public String getGreeting() {
	return greeting;
    }

    /* our original greet just printed the greeting
       Generally, we want our methods to */
    public void greet() {
	//String greeting = new String("Sup!");
	System.out.println(greeting);
    }

    public void ungreet() {
	System.out.println(greeting);
    }
}
