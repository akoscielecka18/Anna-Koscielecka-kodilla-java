package challenges;
import java.time.LocalDateTime;

//zapisywanie informacji do bazy danych
public interface OrderRepository {
    boolean createOrder(User user, LocalDateTime from, LocalDateTime to);
}
