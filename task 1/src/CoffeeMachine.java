import java.util.Scanner;
public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private float money;

    public CoffeeMachine(){
        this.water=350;
        this.milk=200;
        this.coffeeBeans=300;
        this.disposableCups=1000;
        this.money= 5000.00F;
    }

    public void buyCoffee(String choice){
        switch (choice){
            case "1":
                makeCoffee(20,10,5,1,2.50f);
                break;
            case "2":
                makeCoffee(15, 0, 4,1, 2.00f);
                break;
            case "3":
                makeCoffee(10,20,6,1,3.00f);
                break;
            default:
                System.out.println("The input is invalid.");

        }
    }

    private void makeCoffee(int waterNeeded, int milkNeeded, int coffeeBeansNeeded, int disposableCupsNeeded, float moneyNeeded){
        if(water>waterNeeded && milk>milkNeeded && coffeeBeans>coffeeBeansNeeded && disposableCups>disposableCupsNeeded && money>moneyNeeded){
            System.out.println("Making coffee.");
            water-=waterNeeded;
            milk-=milkNeeded;
            coffeeBeans-=coffeeBeansNeeded;
            disposableCups-=disposableCupsNeeded;
            money-=moneyNeeded;
            System.out.println("Coffee is ready!");
        }
        else{
            System.out.println("Not enough resources!");
        }
    }

    public void fillResources(int addedWater, int addedMilk, int addedCoffee, int addedCups, float addedMoney){
        water+=addedWater;
        milk+=addedMilk;
        coffeeBeans+=addedCoffee;
        disposableCups+=addedCups;
        money+=addedMoney;
        System.out.println("System refilled!");
    }

    public void takeMoney(){
        System.out.println("I give you $ "+money);
        money=0;
    }

    public void displayResources(){
        System.out.println("In the coffee machine there are: ");
        System.out.println("Milk: "+ milk);
        System.out.println("Water: "+ water);
        System.out.println("Coffee: "+ coffeeBeans);
        System.out.println("Cups: "+disposableCups);
        System.out.println("Money: "+money);
    }

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        CoffeeMachine coffeeMachine=new CoffeeMachine();

        while(true){
            System.out.println("Enter option: buy, fill, take, display, exit");
            String action=scanner.nextLine();

            switch(action){
                case "buy":
                    coffeeMachine.buyCoffee(action);
                    break;
                case "fill":
                    coffeeMachine.fillResources(200,300,200,5, 500.00f);
                    break;
                case "take":
                    coffeeMachine.takeMoney();
                    break;
                case "display":
                    coffeeMachine.displayResources();
                    break;
                case "exit":
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Enter an existing option: ");
                    break;
            }
        }
    }
}