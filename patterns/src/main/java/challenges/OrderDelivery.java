package challenges;
import java.time.LocalDateTime;


public interface OrderDelivery {
    boolean order(User user, LocalDateTime from, LocalDateTime to, Seller seller, Product product);
}
