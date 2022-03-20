package day13statickeywordvariabletypes;

public class Static01 {

    public static int sCounter = 0;//To create a static variable(class variable) use "static" keyword before "return type"
    public int iCounter = 0; //To create instance variable(object variable) do not use "static" keyword

    public Static01(){
        sCounter++;
        iCounter++;
    }

    public static void main(String[] args) {//args stands for "arguments"

        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();

        System.out.println("Value of sCounter:" + obj3.sCounter);//Value of sCounter:3
        System.out.println("Value of iCounter:" + obj3.iCounter);//Value of iCounter:1

        System.out.println("Value of sCounter:" + obj2.sCounter);
        System.out.println("Value of iCounter:" + obj2.iCounter);

        System.out.println("Value of sCounter:" + obj1.sCounter);
        System.out.println("Value of iCounter:" + obj1.iCounter);

        int age = 13; //If you create a variable inside a method it is called "local variable"
                      //Normally Java assigns default values to variables but if it is "local variable" Java does not assign any value
                      //Because of that, when you create a local variable you HAVE TO assign a value before using it.
                      //Local variables cannot be used outside the method
                      //Note: "static variables" and "instance variables" can be used in entire the class
        System.out.println(age);

        add(3, 5);//The real values used in method call are called "arguments"

    }

    public static int add(int a, int b){
        int c = 2;//c is a "local variable" because it is inside the "add" method
        return c+a+b;
    }

}
