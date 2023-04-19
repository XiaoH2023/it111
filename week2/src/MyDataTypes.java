public class MyDataTypes {
    
    public static void main(String[] args) {

        short num1 = 32_000;
        int num2 = 2_000_000;
        long num3 = 3_000_000_000L;
        float num4 = 30.57F;
        double num5 = 50.12345678;
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        
        boolean dry = true;
        if (dry){
            System.out.println("it is dry");          
        }else{

            System.out.println("not dry");  
        }

        char best = 'A';
        System.out.println(best);  

    }
}
