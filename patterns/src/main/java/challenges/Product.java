package challenges;

public class Product {
    private String productName;
    private String productType;
    private int productID;

    public Product(String productName, String productType, int productID) {
        this.productName = productName;
        this.productType = productType;
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

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }


}
