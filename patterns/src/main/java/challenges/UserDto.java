package challenges;

import java.time.LocalDateTime;

public class UserDto {
    private boolean isOrdered;
    private String deliveryPlace;
    private LocalDateTime orderDateTime;


    public UserDto (final boolean isOrdered, final String deliveryPlace, final LocalDateTime orderDateTime) {
        this.isOrdered = isOrdered;
        this.deliveryPlace = deliveryPlace;
        this.orderDateTime = orderDateTime;
    }
}
