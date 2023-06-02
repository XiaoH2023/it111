package package_person_homework;

public class Person {
    final int CARMINAGE = 2010;
    String name;
    char gender;
    int age;
    String car;
    int carAge;
    boolean violations;
    int creditScore;

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Car: " + car);
        System.out.println("Car Year: " + carAge);
        System.out.println("Violations: " + violations);
        System.out.println("Credit Score: " + creditScore);
    }

    public int getRate(){
        int monthlyRate;
        if(violations == true && creditScore <= 700){
            monthlyRate = 500;
        }else{

            monthlyRate = 100;
        }
        return monthlyRate;
    }

    public int assumeGender(){
        int adjustedRate;
        if(gender == 'M' && age <=25){
            adjustedRate = 100;          
        }else{
            adjustedRate = 0;    
        }

        return adjustedRate;
    }

    public int assumeCarAge(){
        int adjustedCarAgeRate;
        if(carAge >= CARMINAGE ){
            adjustedCarAgeRate = (carAge - CARMINAGE) * 30;          
        }else{
            adjustedCarAgeRate = 0;    
        }

        return adjustedCarAgeRate;
    }

    public void displayPremium(){
        System.out.println("Preliminary Rate for " + name + ": "+getRate() +" dollars");
        System.out.println("Adjustments: " + (assumeGender() + assumeCarAge()));
        System.out.print("Here is " + name + "'s total monthly premium: ");
        System.out.println(getRate() + assumeGender() + assumeCarAge());
        System.out.println();
    }

}
