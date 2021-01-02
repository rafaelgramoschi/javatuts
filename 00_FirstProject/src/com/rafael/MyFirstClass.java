/*
*
* src folder contains all java files.
* java files will be compiled and turned into .class files
* .class files contain bytecode, and are interpreted by the JVM
* JDK = JRE + JVM
* JRE = JVM + libraries
* JVM = virtual machine that interpretes bytecode
*
* */
package com.rafael;

public class MyFirstClass {

    int myNumber = 10; //primitive data type
    Integer myNum = 2; //Variables of type Integer store references to Integer objects,
                       // just as with any other reference (object) type.

    public static void main( String[] args ){ //main method of the Class
        System.out.println("Hi"); //in java everything is a class
        //this comes from rt.jar
        //System is a folder, out is a class, println is its method

        //to call myMethod() i need to initialize( new ) an istance
        //of the class MyFirstClass (i initialize a object)
        //because myMethod() is not declared as static
        MyFirstClass myFirstObject = new MyFirstClass();
        //now I can access the method of that Class
        myFirstObject.myMethod();

        //I can access staticMethod directly because it is static
        MyFirstClass.staticMethod();

        final Integer myNum = 10; //if i try to change it
        //myNum = 2; //will give me error

        //once you build the project, the .class file gets created
        //.class files can be run on every JVM (Linux, Windows, Mac

    }

    private void myMethod(){
        myNumber = 4; // can acces directly the INSTANCE variable myNumber
        System.out.println("This is a private method. We need to create a object to call this method.");
    }

    static void staticMethod(){
        // can't access INSTANCE variable myNumber
        //myNumber = 2;
        System.out.println("This is a static method, meaning that it needs no object to be initialized to call it.");
    }

    /*
     * ACCESS CONTROL MODIFIERS
     * public: accessible from everywhere within the application
     * default (when no ACM is specified): accessible everywhere from within the package
     * protected: accessible by package and subclasses (inheritance)
     * private: accessible only from within the class
     *
     * NON-ACCESS CONTROL MODIFIERS
     * when you define methods, if you define them as
     * static: you can call that method without initializing an object for that Class
     * 	       when you use static (for methods, class variables...), it allocates space in memory only once
     *	       instead of every time you create an object. a static class variable "myVar" will be the same for every instantiated object of that class
     * final: you can't change it after you create it (good for constants)
     *        if you define a method as final, child classes can't override it.
     *        a class is defined as final, if there can be no subclass of that class
     * abstract: abstract class exist to be extended, they can't be instantiated
     *           abstract is used to create classes that have abstract concept like GameObject
     *           then, you create a Player Class which extends the abstract GameObject
     *           and you can instantiate a Player object.
     *
     *           Inside abstract class, you can use abstract methods.
     *           public abstract void draw(); //no implementation needed
     *           //we can think that every object in a game can be drawn
     *           //in its own unique way (player, menu)
     *           and every other class that extends GameObject, should implement draw();
     *           we do implement the method in the class Player like this:
     *
     *           @Override
     *           public void draw(){ System.out.println("Draw Player!"); }
     *
     *           in the Menu Class we can extend GameObject and ovverride the abstract method draw()
     *           @Override
     *           public void draw(){ System.out.println("Draw Menu!"); }
     *           so every new class that extends draw() has its own implementation
     *
     *           in the main you could write:
     *           GameObject[] gameObjects = new GameObject[2]; //we create an array of two items
     *           gameObjects[0] = player;
     *           gameObjects[1] = menu;
     *           for( GameObject obj : gameObjects ){ obj.draw(); } //all gameObjects got drawn
     *
     *           downsides. the type of the variable dictates the interface of the object
     *           if we create anotherMethod() in Player class.
     *           if we GameObject player = new GameObject();
     *           we can't player.anotherMethod();
     *           unless we Player player = new Player();
     *
     *           the interface is everything you can do with a given object.
     *           so the code above (for loop) still works! because menu & player inherit from GameObject
     * synchronized: used in thread
     * volatile: is for memory (not needed if you've used synchronized)
     *
     * VARIABLE TYPES
     * local: accessible only by the actual scope
     * instance: Class' variable accessible after you create the object
     *           can't be accessed directly in a satic method
     *           can be accessed directly by non-static methods
     *           this is because static methods can be accessed without creating the object
     * static: Class' variable accessible without creating any object
     *         created when program starts, gets destroyed when program stops (1 per class, not 1 per object)
     *
     * DATATYPES
     *
     * primitive: byte(1B), short(2B), int(4B), long(8B), float(4B), double(8B), char(2B), boolean(1b)
     *
     * non-primitive: string (objects in general) like Student stud1 = new Student();
     * the range is simple to calculate: -2^(n-1) to +2^(n-1)-1 where n is the number of bits!!!
     *
     * reference datatypes: java do not work with pointers, you can't manipulate memory location's values
     * anyway it gives you a reference (the name of the variable)
     * reference types do not have size or bit range.
     *
     * Note that every primitive type in Java has an equivalent wrapper class:
     * byte has Byte
     * short has Short
     * int has Integer
     * long has Long
     * boolean has Boolean
     * char has Character
     * float has Float
     * double has Double
     *
     *
     * DATATYPES CONVERSIONS
     * implicit conversion:
     * you can assign implicitly:
     *                  Char =v (will convert into ASCII code: 'c'=97,97.0,..,..,..)
     *   Byte => Short => Integer => Long => Float => Double
     *   byte to, short, integer, long, float, double
     *   short to, integer, long, float, double
     *   char to, integer, long, float, double
     *   integer to, long, float, double
     *   long to float, double
     *   float to, double
     *
     *   All of them will implicitly convert by themselves. i.e: Char myChar = 'c'; Double myDouble = c; //myDouble=97.0
     *
     * explicit conversion: when you want to convert a smaller size data type (might loss data)
     *   i.e. float to char, you need to explicitly convert it (type casting):
     *   Double dn = 45; Integer n = dn; //error, because double has a bigger size than integer
     *   ............... Integer n = (int)dn; //ok
     *   Float f = 45.5; Integer p = (int)f; //p=45
     *
     * type conversions:
     *   String str = "hello"; Integer n = 100; String s = str+n; //s="hello100"
     *
     * type conversions methods:
     *   String str = "123";
     *   Integer num = 0;
     *
     *   Integer a = Integer.parseInt(str); //Integer.parseInt returns the numeric value of a string, a=123
     *   Integer b = Integer.valueOf(str); //Integer.valueOf returns the value of a number, b=123
     *   String abc = String.valueOf(num); //String.valueOf returns a string from a given number, abc="0"
     *
     * OPERATORS
     * Unary:
     * postfix (i++,i--) first we assign the value, then we add
     * prefix (-i,!,~,++i,--i) all the operations are done first, and then assigned
     * ~ is the complement operator (inverts a bit pattern)
     * Arithmetic (*,/,%,+,-)
     * Shift: (>>,<<, >>>) bits shift to the left and bits shifting to the right
     * bitwise AND: &, bitwise exclusive OR: ^, bitwise inclusive OR: |,
     * logical AND: &&, logical OR: ||, ternary: ?: (if-else, nested if-else)
     * assignment: <<=, >>=, >>>=, ^=, &=, |=.....
     *
     * CONTROL STATEMENTS
     * Selection/descision making statements: if-else, switch
     * Iteration statements: for, while, do..while
     * jump statements: break(exit loop), continue, return(return+exit)
     *
     * if(condition){}elseif(condition){}else{}
     * switch(expr){ case val1: break; default: }
     *
     * for loops in java:
     * SIMPLE for loop
     * FOR-EACH or enhanced for loop (array, for each item in the array)
     * for(type var: array){ //code }
     * LABELED for loop ( used very little )
     * labelname:
     * for(initialization;condition;increment){ //code }
     *
     * aa:
     * for(int i=0; i<5; i++){
     *      bb:
     *      for(int j=0; j<5; j++){
     *          System.out.println(j);
     *          break aa;
     *      }
     *      System.out.println(i);
     * }
     *
     *   * */
}
