import java.util.*;
import java.text.DecimalFormat;
import java.io.IOException;
import java.net.URL;
public class CurrencyConvertorTask4 {
    private static final String Exchane_rateApi="https://api.exchangeratesapi.io/latest";
    private static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base currency");
        String baseC=sc.nextLine();
        System.out.println("Enter the Target currency");
        String targetC=sc.nextLine();
        double exchangeRate=getExchangeRate(baseC,targetC);
        System.out.println("Enter the AMOUNT TO CONVERT");
        double amount=sc.nextDouble();
        double convertedAmt= amount*exchangeRate;
        DecimalFormat df=new DecimalFormat("#.##");
        System.out.println("The converted amount is"+ df.format(convertedAmt)+" "+targetC);
        sc.close();
    }
public static getExchangeRate(String baseC,String targetC){
    
}
}
