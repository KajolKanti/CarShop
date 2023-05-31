import java.util.Scanner;

public class Admin extends Carinfo{
    Scanner scanner = new Scanner(System.in);
    void adminLogin(){
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        if(username.equals(info.getAdmin_username())){
            System.out.println("Enter Password: ");
            String pass = scanner.nextLine();
            if(pass.equals(info.getAdmin_password())){
                while (true) {
                    System.out.println("1.View Car");
                    System.out.println("2.Add Car");
                    System.out.println("3.Remove Car");
                    System.out.println("4.Exit");
                    System.out.println("Enter Your Choice");
                    Carinfo c1 = new Carinfo();
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            c1.add();
                            c1.view();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 2:
                            adminAdd();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 3:
                            adminRemove();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 4:
                            return;
                    }
                }
            }else System.out.println("Invalid Password");
        }else System.out.println("Invalid Username");
    }
    void adminAdd(){
        System.out.println("How Many Car To Add: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<size; i++){
            System.out.println("Enter Car Name: ");
            car_list.add(scanner.nextLine());
            System.out.println("Enter Car Price: ");
            car_price.add(scanner.nextInt());
        }
        System.out.println("Car Saved");
    }
    void adminRemove(){
        scanner.nextLine();
        System.out.println("Enter The name of the Car You want to remove: ");
        String name = scanner.nextLine();
        if(car_list.contains(name)){
            int index=car_list.indexOf(name);
            System.out.println("Car Removed "+name);
            car_list.remove(name);
            car_price.remove(index);
        }
    }
}
