package challenges;

public class User {
    private String userName;
    private int userID;
    private String userAddress;

    public User(String userName, int userID, String userAddress) {
        this.userName = userName;
        this.userID = userID;
        this.userAddress = userAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
