package challenges;

public class ProductOrderService {
    private InformacionService informacionService;
    private OrderDelivery orderDelivery;
    private OrderRepository orderRepository;

    public ProductOrderService(InformacionService informacionService, OrderDelivery orderDelivery, OrderRepository orderRepository) {
        this.informacionService = informacionService;
        this.orderDelivery = orderDelivery;
        this.orderRepository = orderRepository;
    }

    public UserDto process(final OrderFromUserToSeller orderFromUserToSeller){
        boolean isSell = orderDelivery.order(orderFromUserToSeller.getUser(), orderFromUserToSeller.getFrom(),
                orderFromUserToSeller.getTo(), orderFromUserToSeller.getSeller(), orderFromUserToSeller.getProduct());
        if(isSell) {
            informacionService.inform(orderFromUserToSeller.getUser(), orderFromUserToSeller.getSeller());
            orderRepository.createOrder(orderFromUserToSeller.getUser(), orderFromUserToSeller.getFrom(), orderFromUserToSeller.getTo());
            return new UserDto(true, "Warsaw", orderFromUserToSeller.getTo());
        }else{
            return new UserDto(false, "Warsaw", orderFromUserToSeller.getTo());
        }
    }
}
