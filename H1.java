
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class H1 {

    //throws ParseException for Q3
    public static void main(String[] args) throws ParseException {
        //Q1
        
        String college = new String ("College of Arts and Sciences");
        String town = new String("UUM Sintok"); // part (a)
        int stringLength;
        String change1, change2, change3;
        stringLength = college.length(); // part (b)
        System.out.println (college + " contains " + stringLength + " characters.");
        change1 = college.toUpperCase(); // part (c)
        System.out.println ("The string is all in upper case: " + change1);
        change2 = change1.replace('O','*'); // part (d)
        System.out.println ("All capital O's are replaced with the asterisk character: " + change2);
        change3 = college.concat(town); // part (e)
        System.out.println ("The final string is " + change3);
    

        //Q2
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a colour: ");
        String colour = input.nextLine();
        System.out.print("Enter a food: ");
        String food = input.nextLine();
        System.out.print("Enter a animal: ");
        String animal = input.nextLine();
        System.out.print("Enter a friend: ");
        String friend = input.nextLine();
        System.out.println("I had a dream that " + friend + " ate a "+ colour + " "+ animal+" and said it tasted like "+ food +"!");
        
        /*
        //Q3
        Scanner input = new Scanner(System.in);
        System.out.println("Enter date in format of dd/MM/yy:");
        String strdate=input.next();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date date = formatter.parse(strdate);
        System.out.print("Date format with dd.MM.yy: ");
        System.out.println(new SimpleDateFormat("dd.MM.yy").format(date));
        

        //Q4
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        String number = input.nextLine();
        for(int i=0; i<number.length();i++){
            System.out.println(number.charAt(i));
        }
        int integer=Integer.parseInt(number),sum=0;
        while(integer>0){
            sum += integer%10;
            integer/=10;
        }
        System.out.println("Sum of digits: " + sum);
        */

    }
}
