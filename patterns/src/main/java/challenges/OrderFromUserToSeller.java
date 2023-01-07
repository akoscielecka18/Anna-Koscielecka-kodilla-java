package challenges;

import java.time.LocalDateTime;

public class OrderFromUserToSeller {
    private User user;
    private LocalDateTime from;
    private LocalDateTime to;
    private Seller seller;
    private Product product;

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public Seller getSeller() {
        return seller;
    }

    public Product getProduct() {
        return product;
    }

    public OrderFromUserToSeller(User user, LocalDateTime from, LocalDateTime to, Seller seller, Product product) {
        this.user = user;
        this.from = from;
        this.to = to;
        this.seller = seller;
        this.product = product;
    }


}
