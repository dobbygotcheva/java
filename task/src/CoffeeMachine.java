import java.util.Scanner;
public class CoffeeMachine {
    public static Scanner scanner=new Scanner(System.in);

    public static void remaining(){
        System.out.println("There is "+InTheCoffeeMachine.water+" ml water left.");
        System.out.println("There is "+InTheCoffeeMachine.milk+" ml milk left.");
        System.out.println("There is "+InTheCoffeeMachine.coffeeBeans+" gr coffee beans left.");
        System.out.println("There is "+InTheCoffeeMachine.disposableCups+" cups in the machine.");
        System.out.println("There is $ "+InTheCoffeeMachine.money+" left in the machine.");
    }

    public static void buy(){
        System.out.println("Enter what you'd like: 1-espresso, 2-latte, 3- cappuccino, break-for exit");
        Input.kindOfCoffee=scanner.nextLine().toLowerCase();

        switch(Input.kindOfCoffee){
            case "break":
                return;
            case "1":
                if(InTheCoffeeMachine.water<Ingredients.ForEspresso.water)
                    System.out.println("Unmöglich!");
                else if(InTheCoffeeMachine.coffeeBeans<Ingredients.ForEspresso.coffeeBeans)
                    System.out.println("Unmöglich!");
                else if(InTheCoffeeMachine.disposableCups<1)
                    System.out.println("Unmöglich!");
                else{
                    System.out.println("I have enough resources to make you a coffee!");
                    InTheCoffeeMachine.water-=Ingredients.ForEspresso.water;
                    InTheCoffeeMachine.coffeeBeans-=Ingredients.ForEspresso.coffeeBeans;
                    InTheCoffeeMachine.disposableCups-=1;
                    InTheCoffeeMachine.money+=Ingredients.ForEspresso.money;
                }
                break;


            case "2":
                if(InTheCoffeeMachine.water<Ingredients.ForLatte.water)
                    System.out.println("Unmöglich!");
                else if(InTheCoffeeMachine.coffeeBeans<Ingredients.ForLatte.coffeeBeans)
                    System.out.println("Unmöglich!");
                else if(InTheCoffeeMachine.milk<Ingredients.ForLatte.milk)
                    System.out.println("Unmöglich!");
                else if(InTheCoffeeMachine.disposableCups<1)
                    System.out.println("Unmöglich!");
                else{
                    System.out.println("I have enough resources to make you a coffee!");
                    InTheCoffeeMachine.water-=Ingredients.ForLatte.water;
                    InTheCoffeeMachine.coffeeBeans-=Ingredients.ForLatte.coffeeBeans;
                    InTheCoffeeMachine.milk-=Ingredients.ForLatte.milk;
                    InTheCoffeeMachine.disposableCups-=1;
                    InTheCoffeeMachine.money+=Ingredients.ForLatte.money;
                }
                break;

            case "3":
                if(InTheCoffeeMachine.water<Ingredients.ForCappuccino.water)
                    System.out.println("Unmöglich!");
                else if(InTheCoffeeMachine.coffeeBeans<Ingredients.ForCappuccino.coffeeBeans)
                    System.out.println("Unmöglich!");
                else if(InTheCoffeeMachine.milk<Ingredients.ForCappuccino.milk)
                    System.out.println("Unmöglich!");
                else if(InTheCoffeeMachine.disposableCups<1)
                    System.out.println("Unmöglich!");
                else{
                    System.out.println("I have enough resources to make you a coffee!");
                    InTheCoffeeMachine.water-=Ingredients.ForCappuccino.water;
                    InTheCoffeeMachine.coffeeBeans-=Ingredients.ForCappuccino.coffeeBeans;
                    InTheCoffeeMachine.milk-=Ingredients.ForCappuccino.milk;
                    InTheCoffeeMachine.disposableCups-=1;
                    InTheCoffeeMachine.money+=Ingredients.ForCappuccino.money;
                }
                break;

        }
    }

    public static void fill(){
        System.out.println("How many ml of water would you like to add?");
        int addWater=scanner.nextInt();
        InTheCoffeeMachine.water+=addWater;
        System.out.println("How many ml of milk would you like to add?");
        int addMilk=scanner.nextInt();
        InTheCoffeeMachine.milk+=addMilk;
        System.out.println("How much coffee would you like to add?");
        int addCoffee=scanner.nextInt();
        InTheCoffeeMachine.coffeeBeans+=addCoffee;
        System.out.println("How many cups would you like to add?");
        int addCups=scanner.nextInt();
        InTheCoffeeMachine.disposableCups+=addCups;
    }

    public static void take(){
        System.out.println("I will give you $"+InTheCoffeeMachine.money);
        InTheCoffeeMachine.money=0;
    }

    public static void actions() {
        while (true) {
            System.out.println("What would you like to do: buy, fill, take, remaining, exit?");
            Input.action = scanner.nextLine().toLowerCase();
            switch (Input.action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Invalid input. Please enter a valid action.");
            }
        }
    }
}
