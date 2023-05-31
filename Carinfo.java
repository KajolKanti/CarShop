import java.util.ArrayList;
import java.util.Scanner;

public class Carinfo {
    Scanner scanner = new Scanner(System.in);
    Logininfo info = new Logininfo();
    static ArrayList<String> car_list = new ArrayList<>();
    static ArrayList<Integer> car_price = new ArrayList<>();

    static ArrayList<String> car_model = new ArrayList<>();
    void add(){
        car_list.add("BMW");
        car_list.add("Toyota");
        car_list.add("Honda Motor");
        car_list.add("Mercedes");
        car_price.add(3000000);
        car_price.add(4000000);
        car_price.add(200000);
        car_price.add(5000000);
        car_model.add("B55bn");
        car_model.add("gh5bn");
        car_model.add("hi5bn");
        car_model.add("ki5bn");
        car_model.add("FG5bn");

    }

    static void view(){
        for(int i=0; i<car_list.size(); i++){
            System.out.printf("%d.Name: %s   Price: %d    Model: %s\n",i+1,car_list.get(i),car_price.get(i),car_model.get(i));
        }
    }
}
