package day13statickeywordvariabletypes;

public class Static02 {

    public static void main(String[] args) {

        Static01 obj4 = new Static01();
        System.out.println(Static01.sCounter);//To access a "static variable" NO NEED to use object, just by using class name you can access to it
        System.out.println(obj4.iCounter);//To access "instance variable" you HAVE TO use objects. By using class names it is impossible to
                                          //access instance variables

    }
}
