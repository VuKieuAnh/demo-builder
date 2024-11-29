package director;

import builder.FastFoodOrderBuilder;
import model.BreadType;
import model.Order;
import model.OrderType;
import model.SauceType;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
        Order order1 = new FastFoodOrderBuilder()
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order1);
    }
}
