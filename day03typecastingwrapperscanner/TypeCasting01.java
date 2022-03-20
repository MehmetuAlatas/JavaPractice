package day03typecastingwrapperscanner;

public class TypeCasting01 {
    //Type Casting: Converting small data type to large data type or converting large data type to small data type is called "Type Casting"

    // byte < short < int < long < float <  double

    public static void main(String[] args) {

        //How to convert small data type to large data type: Auto Widening
        byte b = 47;// 47 is in byte data type
        int i = b;// 47 is in int data type

        //How to convert large data type to small data type: Explicit Narrowing
        double d = 1.2;
        short s = (short)d;

        //Convert short 257 to byte?
        short r = 257;
        byte y = (byte)r;
        System.out.println(y);// 1
    }
}
