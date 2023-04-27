public class Litertogallon {
    public static void main(String[] args) { 

        double liter,gallon;
        int j;

        for(gallon=1 , j= 1; gallon<100; gallon=gallon+4, j++){
            liter=gallon*3.785;

            if(gallon==1){
                System.out.printf("%.2f liters = %.1f gallon \n", liter, gallon);
            }else{
                System.out.printf("%.2f liters = %.1f gallons \n", liter, gallon);
            }

            if(j%5 == 0){
                System.out.println();
            }

        } 

        System.out.println("we are done");
    }
}