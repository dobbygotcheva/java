public class Main{
    public static void main(String[]args){
        Flyable[] flyingobjects={new Spacecraft(), new Airplane(), new Helikopter()};
        for(Flyable object: flyingobjects){
            object.fly_obj();
        }
    }
}