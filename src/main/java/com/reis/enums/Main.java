package com.reis.enums;

import com.reis.enums.entities.OrderStatus;
import com.reis.enums.entities.Pedido;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(100, new Date(), OrderStatus.AGURDANDO_PAGAMENTO);
        System.out.println(pedido);

        // conversao de string para enum
        OrderStatus orderStatus = OrderStatus.ENTREGUE;
        OrderStatus orderStatus2 = OrderStatus.valueOf("ENTREGUE");
        System.out.println(orderStatus);
        System.out.println(orderStatus2);

    }
}
