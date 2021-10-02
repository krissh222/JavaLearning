public class Example1 {
    public static void main(String[] args) {
        /* Creating variable using Primitive Data Types such as:
         *
         * Int :  To Store Integer value like 1,2,0,-1 etc. >> Whole Number
         * float :  To Store Float value like 2.0, 1.2 etc. >> Precision Number
         * boolean : To Store Boolean Value like True or False, 0 or 1 etc.
         * Char : To Store Character Value like 'a', 'B', 'c' etc.
         *
         * Let's take example of student and store their related info
         * */

        int Age = 29; //age variable store age of student
        float gpa = 3.45f; //gpa variable store gpa of student
        char sex = 'M'; //sex variable store sex of student
        boolean isPassed = true; //isPassed variable store status of student based on Pass (true) or Fail (false)

        //Now Printing those value stored on variables
        System.out.println("Age of Student is " + Age);
        System.out.println("GPA of Student is " + gpa);
        System.out.println("Sex, M for Male & F for Female : " + sex);
        System.out.println("isPassed : " + isPassed);

    }
}

