import java.util.Scanner;

public class GradeAveraging {
    public static void main(String[] args) { 

        // ask the end user to input their numberical grades
        int counter = 1;
        int grade;
        double total=0;
        double average;

        Scanner input = new Scanner (System.in);

        while(counter <=5){
            System.out.println("Please enter your " + counter+ " numerical grade");
            grade = input.nextInt();
            total += grade;
            counter += 1;
        }
    
        String message;
        char LetterGrade;
        
        counter-=1;
        
        average = total/counter;
        System.out.println("You have earned at average grade of " + average);

        if(average>=90 && average<=100) {
            LetterGrade = 'A';
            message = "Excellent work!";
        }else if (average>=80 && average<90){
            LetterGrade = 'B';
            message = "Solid work!";
        }else if (average>=70 && average<80){
            LetterGrade = 'C';
            message = "More studying necessary";
        }else if (average>=65 && average<70){
            LetterGrade = 'D';
            message = "Sqeaking by!";
        }else {
            LetterGrade = 'F';
            message = "Not a passing grade";
        }

        System.out.println("You have earned the following letter grade " + LetterGrade +" and here is the message "+ message);

    }
}
