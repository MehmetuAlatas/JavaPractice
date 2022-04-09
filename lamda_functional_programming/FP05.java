package lamda_functional_programming;

    import java.util.stream.IntStream;
    public class FP05 {
        public static void main(String[] args) {

            System.out.println(getTheSumFromSevenToHundred());
            System.out.println(getTheSumFromSevenToHundred02());
            System.out.println(FindMultiplicationFromTwoToEleven());
            System.out.println(factorial(-5));
            System.out.println(factorial(5));
        }
        //1)Create a method to find the sum of integers from 7 to 100 (7 and 100 inclusive)
        //1.way:
        public static int getTheSumFromSevenToHundred(){
//      IntStream method does the same actions as for loop does in structured programming
            return IntStream.range(7,101).reduce(0,Math::addExact);
        }
        //2.Way:
        public static int getTheSumFromSevenToHundred02(){
            return IntStream.rangeClosed(7,100).sum();
        }
        //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
        public static int FindMultiplicationFromTwoToEleven(){
            return IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
        }
        //3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
        public static Object factorial(int x){
            return x>=0  ?  IntStream.rangeClosed(1,x).reduce(1,Math::multiplyExact)  :   "Do not enter negative numbers.."  ;
        }
    }

