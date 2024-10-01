import java.util.Scanner;
public class Classwork
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("What type of item are you buying?");
    String item = sc.nextLine();
    System.out.println("How many are you buying?");
    int amt = sc.nextInt();
    System.out.println("How much does each one weigh?");
    double weight = sc.nextDouble();
    double total = amt * weight;
    System.out.println("So " + amt + " " + item + " at " + weight + " pounds each will weigh " + total + " pounds total");
  }
}
