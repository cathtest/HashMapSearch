import java.util.*;

class Mapping {

    public static void main(String[] args) {


        Map<Passport, Person> hmap = new HashMap <Passport,Person >();
        hmap.put(new Passport("MP", 123456), new Person("Mark", "Green", "qwaszx@gmail.com"));
        hmap.put(new Passport("FM", 654321), new Person("Ted", "Smith", "wsaxz@gmail.com"));
        hmap.put(new Passport("RT", 321654), new Person("John", "Doe", "rfvedc@gmail.com"));





        Passport p = new Passport("MP", 123456);
        Passport a = new Passport("sdfsdfs", 232323);




        try {
            System.out.println(toString(hmap.get(p)));

        } catch(NullPointerException e){
            System.out.println("The value is not found");
        }

    }

    private static String toString(Person ps) {
        return ps.name +" " + ps.surname + " "+ ps.email;
    }

}