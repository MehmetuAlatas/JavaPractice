package day11dowhileconstructors;

public class DoWhile01 {

    public static void main(String[] args) {

        //What is the difference between while loop and do-while loop?
        //In while loop, the codes inside the loop body are not executed sometimes.
        //It means zero execution is possible in while loop
        int i =1;
        while(i<1){
            System.out.println("Hello!");
            i++;
        }

        //do-while
        //in do-while loop, the codes inside the do body are executed at least once
        //It means zero execution is impossible in do-while loop
        int k = 1;
        do{
            System.out.println("Hello!");
            k++;
        }while(k<1);
    }
}
