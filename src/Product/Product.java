
package Product;

public class Product {
    private int productID;
    private String productName;
    private String productType;
    private double price;
    private String unit;
    private double quantity;

    public Product() {
    }

    public Product(int productID, String productName, String productType) {
        this.productID = productID;
        this.productName = productName;
        this.productType = productType;
    }
    
    public Product(int productID, String productName, String productType, double price) {
        this(productID, productName, productType);
        this.price = price;
    }

    public Product(int productID, String productName, String productType, double price, String unit, double quantity) {
        this(productID, productName, productType, price);
        this.unit = unit;
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    public void displayProduct() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("%-20s: %-20d\n", "Product ID", this.productID));
        sb.append(String.format("%-20s: %-20s\n", "Product Name", this.productName));
        sb.append(String.format("%-20s: %-20s\n", "Product Type", this.productType));
        sb.append(String.format("%-20s: Php %.2f\n", "Product Price", this.price));
        sb.append(String.format("%-20s: %.2f %s\n", "Quantity", this.quantity, this.unit==null? "": this.unit));
        
        return sb.toString();
    }
    
    
}

    

