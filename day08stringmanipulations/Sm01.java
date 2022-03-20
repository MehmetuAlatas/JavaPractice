package day08stringmanipulations;

public class Sm01 {

    /*
        If you type code which runs just for specific data it is called "Hard Coding" and
        "Hard Coding" is not acceptable in coding
     */

    public static void main(String[] args) {

        String str = "Ali! is 13 years old, I think he is 15.";

        //1.Example: Remove all space characters from the String
            String noSpace = str.replace(" ", "");
            System.out.println(noSpace);//Aliis13yearsold

        //2.Example: Change digits to *
            //1.Way: Hard Coded which is not good
            String noDigit = str.replace("13", "**").replace("15", "**");
            System.out.println(noDigit);

            //2.Way: Without hard coding
            String noDigitDynamic = str.replaceAll("[0-9]", "*");
            System.out.println(noDigitDynamic);

        //3.Example: Change all letters to !
            String noLetters = str.replaceAll("[A-Za-z]", "!");
            System.out.println(noLetters);

        //4.Example: Change all characters different from letters to ?
            String diffFromLetters = str.replaceAll("[^A-Za-z]", "?");
            System.out.println(diffFromLetters);//Ali?is????years?old??I?think?he?is???

        //5.Example: Change all characters different from digits to *
        String differentFromDigits = str.replaceAll("[^0-9]","*");
        System.out.println(differentFromDigits);

        //6.Example: Change all characters different from space to *
        //1.Way:
        String diffFromSpace1 = str.replaceAll("[^ ]", "*");
        System.out.println(diffFromSpace1);

        /*
            1) \\s means space character
            2) \\S means characters different from space character

            3) \\d means digits
            4) \\D means different from digits

            5) \\w means A-Z and a-z and 0-9 and _
            6) \\W means different from A-Z and a-z and 0-9 and _

            7) \\p{Punct} means all punctuation marks
         */
        //2.Way:
        String diffFromSpace2 = str.replaceAll("\\S", "*");
        System.out.println(diffFromSpace2);

        //7.Example: How many characters are used in the String different from space?
        int numOfCharDiffFromSpace = str.replaceAll("\\s", "").length();
        System.out.println(numOfCharDiffFromSpace);

        //8.Example: How many digits are used in the String?
        int numOfDigits = str.replaceAll("\\D","").length();
        System.out.println(numOfDigits);

        //9.Example: How many letters are used in the String?
        int numOfLetters = str.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters);

        //10.Example: How many punctuation marks are used in the String

        //  "Ali! is 13 years old, I think he is 15.";
        int totalNumberOfCharacters = str.length();
        int numOfCharsDiffFromPunctuationMarks = str.replaceAll("\\p{Punct}", "").length();
        int numOfPunctuationMarks = totalNumberOfCharacters - numOfCharsDiffFromPunctuationMarks;
        System.out.println(numOfPunctuationMarks);

    }
}
