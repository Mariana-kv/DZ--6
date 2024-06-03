import java.util.ArrayList;
import java.util.HashSet;

public class Main {

        public static void main(String[] args) {

            ArrayList<String> cities = new ArrayList<String>();
            cities.add("London");
            cities.add("Lviv");
            cities.add("Lviv");

            HashSet<String> hashSet = new HashSet<>();
            hashSet.addAll(cities);

            for (String value : hashSet){
                System.out.println(value);
            }


            ArrayList<String> cities1 = new ArrayList<String>();
            cities1.add("London");
            cities1.add("Lviv");
            cities1.add("New York");

            for (String a : cities1){
                if(cities1.contains("Lviv"))
                    System.out.println(true);
                else System.out.println(false); break;

            }
        }
    




}
