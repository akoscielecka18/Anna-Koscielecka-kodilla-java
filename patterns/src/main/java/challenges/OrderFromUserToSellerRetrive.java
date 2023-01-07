package challenges;

import java.time.LocalDateTime;

public class OrderFromUserToSellerRetrive {

    public OrderFromUserToSeller retrive(){
        User user = new User("Sam", 123, "sam@o2.pl");
        LocalDateTime from = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime to = LocalDateTime.of(2017, 8, 10, 12, 0);
        Seller seller = new Seller("Ann", "AA", 234, "a44@gmail.com");
        Product product = new Product("iron", "classic", 123456);

        return new OrderFromUserToSeller(user, from, to, seller, product);
    }

}
