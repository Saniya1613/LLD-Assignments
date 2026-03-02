import java.util.*;

class PricingService {
    double calculateSubtotal(Map<String, MenuItem> menu, List<OrderLine> lines) {
         double subtotal = 0.0;
        for (OrderLine l : lines) {
            MenuItem item = menu.get(l.itemId);
            subtotal += item.price * l.qty;
            
        }
        return subtotal;
    }

    double calculateLineTotal(MenuItem item, int qty) {
        return item.price * qty;
    }

}