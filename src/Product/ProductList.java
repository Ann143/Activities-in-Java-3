
package Product;

public class ProductList {
    private Product[] list;
    private int count;
    private int max;

    public ProductList() {
        this(10);
    }

    public ProductList(int max) {
        this.max = max;
        list = new Product[this.max];
    }

    public Product[] getList() {
        return list;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }
    //add a product in the productlist
    public boolean addProduct(Product p) {
        if (!isFull()) {
            this.list[this.count++] = p;
            return true;
        }
        return false;
    }

    public Product removeProduct(int prodID) {
        Product p = null;
        int index = searchProductID(prodID);

        if (index >= 0) {
            p = list[index];
            for (int i = index; i < count - 1; ++i) {
                list[i] = list[i + 1];
            }
            count--;
        }
        return p;
    }

    private boolean isFull() {
        return count == max;
    }

    public boolean searchProductName(String prodName){
        int i;
        boolean yes = false;
        for(i=0; i < count; i++){
            if(list[i].getProductName().contains(prodName)){
                System.out.printf(" %-10d | %-15s | %-15s | Php%12.2f | %.2f %s \n", 
                    list[i].getProductID(), list[i].getProductName(), 
                    list[i].getProductType(), list[i].getPrice(), list[i].getQuantity(),
                    list[i].getUnit());
                
                 yes = true;
                    
            } 
        }
        return yes;
    }
    
    
    
    public int searchProductID(int prodID) {
        int i;

       for (i = 0; i < count; ++i) {
           if (prodID == list[i].getProductID()) {
               
               break;            }
           
       }
        return i == count ? -1 : i;
   }
    
    
    
    //this will deduct the quantity of the product
    public Product out(int prodID,double quant) {
        Product p = null;
        int index = searchProductID(prodID);

        if (index >= 0) {
            p = list[index];
            for (int i = index; i < count ; ++i) {
                list[i].setQuantity(list[i].getQuantity()-quant);
            }
        }
        return p;
    }
    
    //this will add the quantity of the product
    public Product in(int prodID,double quant) {
        Product p = null;
        int index = searchProductID(prodID);

        if (index >= 0) {
            p = list[index];
            for (int i = index; i < count ; ++i) {
                list[i].setQuantity(list[i].getQuantity()+quant);
            }

        }
        return p;
    }
   //displays the products
    public void displayProducts() {
        System.out.printf(" %-10s | %-15s | %-15s | %-15s | %-15s \n", "ID", "NAME", "TYPE", "PRICE", "QTY");
        for(int i=0; i<count; ++i) {
            System.out.printf(" %-10d | %-15s | %-15s | Php%12.2f | %.2f %s \n", 
                    list[i].getProductID(), list[i].getProductName(), 
                    list[i].getProductType(), list[i].getPrice(), list[i].getQuantity(),
                    list[i].getUnit());
        }
    }

    @Override
    public String toString() {
        return "ProductList{" + "list=" + list + ", count=" + count + ", max=" + max + '}';
    }
    
}

