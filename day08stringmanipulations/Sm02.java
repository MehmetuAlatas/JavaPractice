package day08stringmanipulations;

public class Sm02 {

    public static void main(String[] args) {

        String fullName = "";
        System.out.println(fullName);

        //How to remove spaces from the beginning and from the end in a String
        String trimmedName = fullName.trim();
        System.out.println(trimmedName);

        //How to understand if a String is empty or not?
        //1.Way:
        int numOfChar = fullName.length();
        if(numOfChar==0){
            System.out.println("You did not enter your name");
        }else{
            System.out.println("You entered your name successfully");
        }
        //2.Way:
        //isEmpty() returns true if there is no any character
        boolean isEmpty = fullName.isEmpty();
        if(isEmpty){
            System.out.println("You did not enter your name");
        }else{
            System.out.println("You entered your name successfully");
        }

        String str = " ";
        //isBlank() returns true if there is space character or space characters or nothing
        boolean isBlank = str.isBlank();
        System.out.println(isBlank);
    }
}
