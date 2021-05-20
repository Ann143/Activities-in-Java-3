
package Product;

import java.util.Scanner;


public class ProductTest {
    public static void main(String[] args) {
        ProductList myList = new ProductList();
        Scanner input = new Scanner(System.in);
        String[] options = {"Show", "Add", "Remove", "Search", "Check-Out", "Check-In", "Exit"};
        int choice;
        Product p;
        do {
            System.out.println("*****INVENTORY MENU******");
            for (int i = 0; i < options.length; ++i) {
                System.out.printf("[%d.] %s\n", i + 1, options[i]);
            }
            do {
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("*****PRODUCT LIST*****");
                        myList.displayProducts();
                        break;
                    case 2:
                        System.out.println("****Add Product****");
                        p = new Product();
                        System.out.print("Enter product id: ");
                        p.setProductID(input.nextInt());
                        System.out.print("Enter product name: ");
                        input.nextLine();
                        p.setProductName(input.nextLine());
                        System.out.print("Enter product type: ");
                        p.setProductType(input.nextLine());
                        System.out.print("Enter product price: ");
                        p.setPrice(input.nextDouble());
                        System.out.print("Enter product quantity: ");
                        p.setQuantity(input.nextDouble());
                        System.out.print("Enter product unit: ");
                        input.nextLine();
                        p.setUnit(input.nextLine());
                        if (myList.addProduct(p)) {
                            System.out.println("********************************");
                            System.out.printf("Product %s sucesfully added.\n", p.getProductName());
                        } else {
                            System.out.println("Product not added in the inventory");
                        }
                        break;
                    case 3:
                        System.out.println("*******************************");
                        System.out.println("****REMOVE PRODUCT****");
                        System.out.print("Enter product id: ");
                        p = myList.removeProduct(input.nextInt());
                        p.displayProduct();
                        System.out.printf("%s was removed from the inventory list.\n", p.getProductName());
                        System.out.println("*********************************");
                        break;
                    case 4:
                        System.out.println("***************************");
                        System.out.println("****SEARCH****");
                        System.out.println("Enter Product name: ");
                        if(!myList.searchProductName(input.next())){
                            System.out.println("***********************");
                            System.out.println("No item Found!");
                        }
                        System.out.println("**************************");
                        break;
                    case 5:
                        System.out.println("***************************");
                        System.out.println("****CHECK OUT****");
                        System.out.println("Enter product name:");
                        String name = input.next();
                        if(myList.searchProductName(name)){
                           
                            System.out.println("Enter the id: ");
                            int ids = input.nextInt();
                            System.out.println("Enter a quantity:");
                            int out = input.nextInt();
                             myList.out(ids, out);
                             System.out.println("***************************");
                             System.out.println("The quantity of the product" +" "+ "has been deducted! \n");
                             myList.displayProducts();
                             
                        }else{
                            System.out.println(".***************************");
                            System.out.println("Item not found!");
                            ProductList prod = new ProductList();
                            
                        }
                        System.out.println("******************************");
                        break;
   
                    case 6:
                        System.out.println("*******************************");
                        System.out.println("****CHECK IN****");
                        System.out.println("Enter product name:");
                        String check = input.next();
                        if( myList.searchProductName(check)){
                            System.out.println("Enter an id: ");
                            int id = input.nextInt();
                            System.out.println("Enter a quantity:");
                            int in = input.nextInt();
                            myList.in(id, in);
                            System.out.println("******************************");
                            System.out.println("The quantity of the product" +" "+ "has been added!\n");
                            myList.displayProducts();
                        }else{
                            System.out.println("Item not found");
                        }
                        System.out.println("********************************");
                        break;
                    case 7:
                        System.out.println("Thank you for using the program.");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (!(choice >= 1 && choice <= 7));
        } while (choice != 7);
    }
}
