package day05ifelsestatements;

public class AndOrOperators {

    public static void main(String[] args) {
        /*
                || means "or": If you use "||" between 2 things it means at least 1 of them is enough for you
                       For example; "tea || coffee" means just tea, or just coffee, or both
                       To get false from || operation all must be false
                       true || true ==> true
                       true || false ==> true
                       false || true ==> true
                       false || false ==> false
                     Note: "|" checks both conditions.
                           "||" does not check the second condition, if first one is true
                           "||" is faster than "|"
       && means "and":  If you use "&&" between 2 things it means you want both.
                        For example; "tea && coffee" means I want both, just one of them will not be enough
                        To get true from && operation all must be true.
                        true && true ==> true
                        true && false ==> false
                        false && true ==> false
                        false && false ==> false
        & means "and":  If you use "&" between 2 things it means you want both.
                        For example; "tea & coffee" means I want both, just one of them will not be enough
                        To get true from && operation all must be true.
                        true & true ==> true
                        true & false ==> false
                        false & true ==> false
                        false & false ==> false
        Note: "&" and "&&" do the same but
              "&&" does not check the second condition if the first condition is false.
              "&" checks both conditions every time.
         */
        System.out.println(5>4); //true
        System.out.println(5<4); //false
        System.out.println( 5>4 || 4>5);//true
        System.out.println( 5>4 && 4>5);//false
        System.out.println( 5<4 || 3+4==7);//true
        System.out.println( 5<4 && 3+4==7);//false
        //I want to buy a PC
        //I have cash, I have credit card
        boolean cash = false;
        boolean creditCard = false;
        if(cash || creditCard){
            System.out.println("I can buy a PC");
        } else {
            System.out.println("I can not buy a PC");
        }
        //I want to learn Java
        //I have PC and I watch videos
        boolean havingPC = true;
        boolean watchingVideos = false;
        if(havingPC && watchingVideos){
            System.out.println("I can learn Java");
        } else {
            System.out.println("I can not learn Java");
        }
    }
}
