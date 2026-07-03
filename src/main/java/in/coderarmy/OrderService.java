package in.coderarmy;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService paymentService = new PaymentService();

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){

        payementService.pay();

        System.out.println("Order placed");
    }
}
