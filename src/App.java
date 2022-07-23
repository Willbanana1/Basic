
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception
    {
        Product[] products = {
            new  Product(01,"Product_1 ", 10000),
            new  Product(02,"Product_2 ", 1000),
            new  Product(03,"Product_3 ", 100)
        };

        User[] users = {
            new  User(01, "First_1", "Last_1",10000, ""),
            new  User(02, "First_2", "Last_2",1000, ""),
            new  User(03, "First_3", "Last_3",100, "")
        };



        System.out.println("\nChoose one of the numbers");
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        while (true){
            System.out.println("\n1. Display list of all users" + "\n 2. Display list of all products" +
            "\n 3. Buy product" + "\n 4. Display list of user products by user id" + "\n 5. Display list of users that bought product by product id"); 
            int num = in.nextInt();
            switch (num) {
                case  (1):
                for (User user : users){
                    user.getInfo();
                }
                continue;
                case (2):
                    for (Product product : products){
                        product.getInfo();
                    }
                    continue;
                case (3):
                System.out.println("Id of user: ");
                int user_id = in.nextInt();
                System.out.println("Id of product: ");
                int product_id = in.nextInt();

                int product_price = 0;
                int user_amount = 0;

                for (User user : users){
                    if (user_id == user.getId()){
                        user_amount = user.getAmount();
                        for (Product product : products){
                            if (product_id == product.getId()){
                                product_price = product.getPrice();
                                int k = user_amount - product_price;
                                if (k < 0 ){
                                    throw new Exception("User havent money to buy it");
                                } 
                                else {           
                                    user.changeAmount(k);
                                    user.addpurchased(product.getName());
                                    System.out.println("Success!");
                                }
                            }
                        }
                    }
                }

                    continue;
                case (4):
                System.out.println("Input user id: ");
                user_id = in.nextInt();
                for (User user : users){
                    if (user_id == user.getId()){
                        user.getPurchased();
                    }
                }
                    continue;
                case (5):
                System.out.println("Input product id: ");
                String prod_id = st.nextLine();
                for (User user : users){
                    if (user.check(prod_id) == true ){
                        System.out.println("Id: "  + user.getId());
                    }
                }
                    continue;
        
            }

            in.close();
            st.close();
        }

    }
}