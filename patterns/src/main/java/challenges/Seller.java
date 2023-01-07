package challenges;

public class Seller {
    private String sellerName;
    private String sellerType;
    private int sellerID;
    private String sellerAddress;

    public Seller(String sellerName, String sellerType, int sellerID, String sellerAddress) {
        this.sellerName = sellerName;
        this.sellerType = sellerType;
        this.sellerID = sellerID;
        this.sellerAddress = sellerAddress;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }
}

