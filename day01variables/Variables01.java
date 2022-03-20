package day01variables;

public class Variables01 {


    public static void main(String[] args) {

        //I am creating integer variable whose name is age
        int age = 12;

        //I am creating a char variable whose name is initial
        char initial = 'A';

        //Let's print the values of age and initial variables on the console
        System.out.println(age);
        System.out.println(initial);

        //Create 3 integer variables,assign values to them,
        // a) Print them on the console one by one
        // b) Print the sum of the 3 integers
        // c) Print the sum of the 3 integers by a label at the beginning. Example: 'The sum is 39'

        int i01=12, i02=13, i03=14;
        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);

        System.out.println(i01 + i02 + i03);
        System.out.println("The sum is " + i01 + i02 + i03);// The sum is 121314
        System.out.println("The sum is " + (i01 + i02 + i03));

        int sum = i01 + i02 + i03;
        System.out.println("The sum is " + sum);

        //Create 2 integer variables and print their multiplication on the console with a label
        int i04=15, i05=16;

        System.out.println("The multiplication is " + i04*i05);// The multiplication is 240


        /*
            Order of Operations in Math
            1)Do the operations inside the parenthesis first
            2)Do multiplication and division
            3)Do addition and subtraction
        */
    }
}
