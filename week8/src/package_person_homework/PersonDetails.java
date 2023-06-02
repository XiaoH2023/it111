package package_person_homework;
public class PersonDetails {
    public static void main(String[] args){

        Person firstPerson = new Person();
        Person secondPerson = new Person();

        firstPerson.name = "Cathy"; 
        firstPerson.gender = 'F';
        firstPerson.age = 33;  
        firstPerson.car = "Volvo";   
        firstPerson.carAge = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Tom"; 
        secondPerson.gender = 'M';
        secondPerson.age = 22;  
        secondPerson.car = "Honda";   
        secondPerson.carAge = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        firstPerson.display();
        firstPerson.displayPremium();

        secondPerson.display();
        secondPerson.displayPremium();        
    }
}
