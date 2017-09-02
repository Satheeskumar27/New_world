package oddsorevens;
//import static java.lang.System.exit;
import java.util.Scanner;
import java.util.Random;
//import static javafx.application.Platform.exit;
public class OddsOrEvens 
{
 public static void main(String[] args) 
 {
     Scanner name= new Scanner (System.in);   // getting input from user
     System.out.print("Hi! What's your name: ");
     String user = name.nextLine();    // getting user name
     System.out.println("Hello: "+user);
     System.out.println("Let's play OddsOrEvens");
     System.out.println("Choose Odd or Even");
     String s ="oddOrEven";
     Scanner str = new Scanner(System.in);   // getting new string from uder
     String s1 = str.next();  //storing odd or even here
     o:
     if (s1.equals("even")||(s1.startsWith("e")))
     {
         System.out.println("You choose even");
         System.out.println("Computer choose odd");
     }
     else if (s1.equals("odd")||(s1.startsWith("o")))
     {
         System.out.println("You choose odd");
         System.out.println("Computer choose even");
     } 
     else
     {
          System.out.println("Entered wrong keyword"); 
     }    
     System.out.print("How many fingers you want to put out: ");
     Scanner num = new Scanner(System.in);
     int n=num.nextInt();
     Random rand = new Random();
     int computer = rand.nextInt(6);
     System.out.println("Computer choose "+ computer +" fingers");
     int sum;
     sum=n+computer;
     System.out.println(sum);
     if(sum%2==0)
     {
         System.out.println(sum+" is even");
     }
     else 
     {
         System.out.println(sum+" is odd");
     }
      int  u = s1.length();
          if(u/2==0)
          {
              System.out.println("You won :)");
          }
          else
          {
              System.out.println("You lose :(");
          }     
 }
}
        