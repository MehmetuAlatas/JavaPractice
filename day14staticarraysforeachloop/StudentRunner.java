package day14staticarraysforeachloop;

public class StudentRunner {

    public static void main(String[] args) {

        //To access static class members "class name" is enough to access
        System.out.println(Student.counter);

        //To access non-static class members you have to create an object
        Student std1 = new Student();
        System.out.println(std1.setStudentId());

    }
}
