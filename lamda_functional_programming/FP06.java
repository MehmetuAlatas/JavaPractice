package lamda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class FP06 {
    public static void main(String[] args) {
        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Autumn", "English Night", 93, 144);

        List<Courses> coursesList=new ArrayList<>();
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        System.out.println(coursesList);
        System.out.println(checkAvarageGreater(coursesList,90));
        System.out.println(checkIfNamesContains(coursesList,"turkish"));

    }
    //1)Create a method to check if all average scores are greater than given number
    public static boolean checkAvarageGreater( List<Courses>list,int number){
      return list.stream().allMatch(t->t.getAverageScore()>number);
    }
    //2)Create a method to check if at least one of the course names contains “Turkish” word
    public static boolean checkIfNamesContains(List<Courses>list,String word){
        return list.stream().anyMatch(t->t.getCourseName().contains(word));
    }

}
