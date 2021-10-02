public class Example2 {
    public static void main(String[] args) {
        /* Creating variable using Derived Data Types from Primitive such as:
         *
         * double :  To Store Float value like 2.0, 1.2 etc. >> Precision Number
         * string : To Store sequence of character Value like "abc", "ABc", "aBc" etc.
         *
         * Let's take example of student and store their related info
         * */
        String firstName = "Balkrishna";//Derived
        String lastName = "Singh";//Derived
        int Age = 25; //Primitive
        double gpa = 3.45; //Derived
        String sex = "Male"; //Derived
        boolean isPassed = true; //Primitive

        //Now Printing those value stored on variables
        System.out.println("Full Name : "+firstName+" "+lastName+".");
        System.out.println("Age of Student is " + Age + " year.");
        System.out.println("GPA in Bachelor is " + gpa+".");
        System.out.println("Sex : " + sex+".");
        System.out.println("isPassed : " + isPassed);
    }
}
