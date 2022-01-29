package L7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * product.txt
 *      ProductID, ProductName, ProductPrice
 *
 * order.txt
 *      OrderID, ProductID, OrderQuantiy
 *
 *
 * output
 *                              *************
 *      ProductID, ProductName, OrderQuantity, PricePerUnit, TotalPrice for each order.
 *                                             ProductPrice
 *
 */
public class Q6 {
    public static void main(String[] args)  {
        int num_product = getNumberOfProducts();
        
        try {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","ProductID","ProductName","Quantity","PricePerUnit","Total");
            Scanner orderIS   = new Scanner(new FileInputStream("order.txt"));
            Scanner productIS = new Scanner(new FileInputStream("product.txt"));



            /** scan through product file */
            String[][] products = new String[num_product][];
            for (int i = 0; i < num_product; i++) {

                // ProductID, ProductName, ProductPrice
                //     SK020, Enfagrow A+, 36.79
                //       0  ,      1     ,   2
                products[i] = productIS.nextLine().split(",");
            }



            /** scan through order file */
            while (orderIS.hasNextLine()){

                // OrderID, ProductID, OrderQuantiy
                //  ORD001,     SK079,     20
                //     0  ,         1,     2
                String[] order = orderIS.nextLine().split(",");


                // scan through all products to find matching order
                for (String[] product : products){

                    // found matching productID
                    if (product[0].equals(order[1])){
                        //                          quantity                 *     price
                        double totalPrice =  Double.parseDouble(order[2])    * Double.parseDouble(product[2]);
                        System.out.printf("%-20s%-20s%-20s%-20s%-20.2f\n",product[0],product[1], order[2], product[2], totalPrice);

                        break;// 1 order will only match 1 one the products
                    }
                }
            }


            orderIS.close();
            productIS.close();
        }
        catch (FileNotFoundException e){

        }
    }

    private static int getNumberOfProducts() {
        int numberOfProducts = 0;

        try{
            Scanner in = new Scanner( new FileInputStream("product.txt") );

            while (in.hasNextLine()){
                numberOfProducts++;
                in.nextLine();
            }

            in.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return numberOfProducts;
    }
}
