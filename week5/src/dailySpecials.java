import java.util.Scanner;

public class dailySpecials{
    public static void main(String[]args){

    String specials = "";
    
    Scanner input = new java.util.Scanner(System.in);

    System.out.println("Please enter a day of the week excluding weekends (Monday-Friday only!)");

    String coffee="";
    double price=0, total=0;
    int number=0;
    boolean validDay = false;

     while(validDay == false){ 
        specials = input.nextLine();
        
        switch(specials){ 
        
            case "Monday":
            coffee ="Latte";
            price = 4.95;
            System.out.println(specials+"'s coffee of the day is a  "+coffee+ " and the price will be $" +price);
            validDay = true;
            break;

            case "Tuesday":
            coffee ="Frapp";
            price = 5.95;
            System.out.println(specials+"'s coffee of the day is a  "+coffee+ " and the price will be $" +price);
            validDay = true;
            break;

            case "Wednesday":
            coffee ="Cappucino";
            price = 4.35;
            System.out.println(specials+"'s coffee of the day is a  "+coffee+ " and the price will be $" +price);
            validDay = true;
            break;

            case "Thursday":
            coffee ="Regular Joe";
            price = 2.95;
            System.out.println(specials+"'s coffee of the day is a  "+coffee+ " and the price will be $" +price);
            validDay = true;
            break;

            case "Friday":
            coffee ="Green Tea Latte";
            price = 6.95;
            System.out.println(specials+"'s coffee of the day is a  "+coffee+ " and the price will be $" +price);
            validDay = true;
            break;

            default:
                System.out.println("Please enter a week day, not weekend!");
                validDay = false;

        }

    }  

     System.out.println("How many "+coffee+ "would you like to order?");
     
     number = input.nextInt();

     if(number<0){
        System.out.println("invalid number");
     } else if (number==0) {
        System.out.println("Looks like you don't like " +coffee+ " ! So sad!!!");
     }else if (number==1) {
        System.out.println( "Looks like you will be ordering only 1 " + coffee + " today!");
     }else{
        //count
        total = number * price;
        System.out.printf("%d %s have been ordered totalling $%.2f dollars !\n",number,coffee,total);
     }

    input.close();

    }
} 