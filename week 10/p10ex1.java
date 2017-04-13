package enum10_1;
import java.lang.*;
import java.util.Scanner;
enum Apple {
   Jonathan, GoldenDel, RedDel, Winesap, Cortland;
}
public class Enum10_1 {

    public static void main(String[] args) {
        System.out.println("enter the names of the apple:");
        for(Apple a:Apple.values())
        {
           System.out.println(a);
        }

System.out.println("select one name and check whether that is same apple or not ");
Scanner s=new Scanner(System.in);
String m=s.next();

switch(Apple.valueOf(m))
{
    case Jonathan:
       System.out.println("It is a medium-sized sweet apple");
        break;
    case GoldenDel:
        System.out.println("The Golden Delicious is a cultivar of apple with a yellow color");
        break;
    case RedDel:
        System.out.println("Crisp and juicy apple");
        break;
    case Winesap:
        System.out.println("The apples are sweet with a tangy finish");
        break;
    case Cortland:
        System.out.println("'Cortland' is a cultivar of apple");
        break;
}
    }

}
