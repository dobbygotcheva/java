import java.util.ArrayList;
public class Restaurant {
    private ArrayList<String> menuItems;
    private ArrayList<Double> prices;
    private ArrayList<Integer> ratings;
    private ArrayList<Integer> itemCounts;

    public Restaurant(){
        this.menuItems=new ArrayList<>();
        this.prices=new ArrayList<>();
        this.ratings=new ArrayList<>();
        this.itemCounts=new ArrayList<>();
    }

    public void addItem(String item, double price){
        this.menuItems.add(item);
        this.prices.add(price);
        this.ratings.add(0);
        this.itemCounts.add(0);
    }

    public void removeItem(String item){
        int index=this.menuItems.indexOf(item);
        if(index>=0){
            this.menuItems.remove(index);
            this.prices.remove(index);
            this.ratings.remove(index);
            this.itemCounts.remove(index);
        }
    }

    public void addRating(String item, int rating){
        int index=this.menuItems.indexOf(item);
        if(index>=0){
            int currentRating=this.ratings.get(index);
            int totalCount=this.itemCounts.get(index);
            this.ratings.set(index, currentRating+rating);
            this.itemCounts.set(index, totalCount+1);
        }
    }

    public double getAverageRating(String item){
        int index=this.menuItems.indexOf(item);
        if(index>=0){
            int itemCount=this.itemCounts.get(index);
            int totalRating=this.ratings.get(index);
            return itemCount>0? totalRating/itemCount:0.0;
        } else {
            return 0.0;
        }
    }

    public void displayMenu(){
        for(int i=0; i<menuItems.size(); i++){
            System.out.println("Item: "+menuItems.get(i)+", $ "+ prices.get(i));
        }
    }

    public double calculateAverageRating(){
        int totalRating=0;
        int numRatings=0;
        for(int i=0; i<menuItems.size(); i++){
            totalRating+=this.ratings.get(i);
            numRatings++;
        }
        return numRatings>0? totalRating/numRatings: 0.0;
    }
}
