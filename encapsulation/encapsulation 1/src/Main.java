public class Main{
    public static void main(String [] args){
        Person person=new Person();

        person.setName("Dobby");
        person.setAge(23);
        person.setCountry("Deutschland");

        String name=person.getName();
        int age= person.getAge();
        String country=person.getCountry();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Country: "+country);
    }
}