public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addItem("Burger", 8.99);
        restaurant.addItem("Pizza", 10.99);
        restaurant.addItem("Salad", 6.00);

        System.out.println("Menu:Item & Price");
        restaurant.displayMenu();

        restaurant.addRating("Burger", 4);
        restaurant.addRating("Burger", 5);
        restaurant.addRating("Pizza", 3);
        restaurant.addRating("Pizza", 4);
        restaurant.addRating("Salad", 2);

        double averageRating = restaurant.getAverageRating("Burger");
        System.out.println("\nAverage rating for Burger: " + averageRating);
        averageRating = restaurant.getAverageRating("Pizza");
        System.out.println("Average rating for Pizza: " + averageRating);
        averageRating = restaurant.getAverageRating("Salad");
        System.out.println("Average rating for Salad: " + averageRating);
        System.out.println("Average rating: " + restaurant.calculateAverageRating());
        System.out.println("\nRemove 'Pizza' from the above menu.");
        restaurant.removeItem("Pizza");
        System.out.println("\nUpdated menu:");
        restaurant.displayMenu();
    }
}