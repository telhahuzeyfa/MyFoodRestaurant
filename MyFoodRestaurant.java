import java.util.*;
public class MyFoodRestaurant{
  public static void main (String[] args){
       foods();
       askForFood();
       getTheFood();
       askIfUserWantDrinks();
       askForDrink();
       getTheDrink();
       getAddress();
       price();
       paymentMethod();
       creditOrDebit(1987334331);
       textMessage(1987334331);
       again();
  }
  public static void foods(){

    Scanner scnr = new Scanner (System.in);
    System.out.println("Welcome to Huzeyfa's food restaurant");
    System.out.println("@(^_^)@");
    System.out.println("Can i take your order?");
    System.out.println("Enter 1 and enter to continue");
    scnr.nextInt(); 
  }

  public static void askForFood(){

    Scanner scnr = new Scanner (System.in);
    System.out.println("Here is your food options for today");
    System.out.println("Pick one number from the following options and enter");
    System.out.println("===========================================");
    System.out.println("1. Pizza");
    System.out.println("2. Chicken");
    System.out.println("3. Burger");
    System.out.println("4. Chipotle");
    System.out.println("5. Beef Steak");
    System.out.println("6. Shero Wet");
  }

  public static void getTheFood(){

    Scanner scnr = new Scanner (System.in);
    int FoodNum;
    System.out.println("-------------------------------------------");
    FoodNum = scnr.nextInt();
    
    if (FoodNum == 1){
    System.out.println("We are preparing your Pizza!!!");
    }

    if (FoodNum == 2){
    System.out.println("We are prepareing your Chicken...");
    System.out.println("-------------------------------------------");
    }

    if (FoodNum == 3){
    System.out.println("We are preparing your Burger...");
    System.out.println("-------------------------------------------");
    }

    if (FoodNum == 4){
    System.out.println("We are preparing your Chipotle...");
    System.out.println("-------------------------------------------");
    }

    if (FoodNum == 5){
    System.out.println("We are preparing your Beef Steak...");
    System.out.println("-------------------------------------------");
    }

    if (FoodNum == 6){
    System.out.println("We are preparing your Shero Wet...");
    System.out.println("-------------------------------------------");
    }

  }

  public static int askIfUserWantDrinks(){
    Scanner scnr = new Scanner (System.in);
    System.out.println("++++++++++++++++++++++++++++++++++");
    System.out.println("Enter 1 to continue");
    int anotherNumber = 1;
    anotherNumber = scnr.nextInt();
    return 1;
  }
   
   public static void price(){

    Scanner scnr = new Scanner (System.in);
    int PriceTag;
    System.out.println("Total: $10 + $5 for delivery");
    System.out.println("$15");
    System.out.println("-------------------------------------------");
  }

  public static void getAddress(){

    Scanner scnr = new Scanner (System.in);
    System.out.println("Enter you address");
    int deliveryOrCarryout = scnr.nextInt();
  }
  
  public static void paymentMethod(){

    Scanner scnr = new Scanner (System.in);
    int Payment;
    System.out.println("How do you want to make your payment");
    System.out.println("|Enter: 1 For credit | Enter: 2 for Debit |");
    System.out.println("-------------------------------------------");
    
    Payment = scnr.nextInt();
   
    if (Payment == 1){
      System.out.println("Enter the last 4 digits of your Credit card");
    }

    if (Payment == 2){
      System.out.println("Enter the last 4 digits of your Debit card");
    }

  }
  public static void creditOrDebit(int number){
    Scanner scnr = new Scanner (System.in);
    int Number;
    System.out.println("number");
    Number = scnr.nextInt();
  }

  public static void askForDrink(){

    Scanner scnr = new Scanner (System.in);
    System.out.println("===========================================");
    System.out.println("Any drinks?");
    System.out.println("0. No Drink");
    System.out.println("1. Water");
    System.out.println("2. Soda");
    System.out.println("3. Strawberry Smoothie");
    System.out.println("4. Ice Tea");
   }

  public static void getTheDrink(){
    Scanner scnr = new Scanner (System.in);
    int DrinkNum;
    System.out.println("-------------------------------------------");
    DrinkNum = scnr.nextInt();

    if (DrinkNum == 0){
    }
  
    if (DrinkNum == 1){
    System.out.println("We are preparing your Water!!!");
    }

    if (DrinkNum == 2){
    System.out.println("We are prepareing your Soda...");
    System.out.println("-------------------------------------------");
    }

    if (DrinkNum == 3){
    System.out.println("We are preparing your Strawberry Smoothie...");
    System.out.println("-------------------------------------------");
    }

    if (DrinkNum == 4){
    System.out.println("We are preparing your Ice Tea...");
    System.out.println("-------------------------------------------");
    }
    
   }

    public static void textMessage (int message){
      Scanner scnr = new Scanner (System.in);
      System.out.println("Enter your phone number to get notifications when your order is ready");
      System.out.println("Without area number");
      
      message = scnr.nextInt();
      System.out.println("===========================================");
      
      System.out.println("your order will take approximatly 10 minutes!!!");
      System.out.println("-------------------------------------------");
      
      System.out.println("Enjoy!!!");
      System.out.println("===========================================");

      System.out.println("-------------------------------------------");  
    }  

    public static void again(){
       foods();
       askForFood();
       getTheFood();
       askIfUserWantDrinks();
       askForDrink();
       getTheDrink();
       getAddress();
       price();
       paymentMethod();
       creditOrDebit(1987334331);
       textMessage(1987334331);
       again();
  }
}