package com.fooddel.Services;

import com.fooddel.beans.Orderitems;
import com.fooddel.exceptions.ResourceNotFoundException;
import com.fooddel.repository.OrdersItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdersItemsService {

    private final OrdersItemRepository ordersitemsRepository;

    @Autowired
    public OrdersItemsService(OrdersItemRepository ordersitemsRepository) {
        this.ordersitemsRepository = ordersitemsRepository;
    }



    public Orderitems updateOrderItems(Integer id, Orderitems orderitemsDeatials )
    {
        Orderitems orderitem = ordersitemsRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("dish not exists with id:"+id));

        orderitemsDeatials.setOrderIteamName(orderitemsDeatials.getOrderIteamName());
        orderitemsDeatials.setOrderItemPrice(orderitemsDeatials.getOrderItemPrice());



        Orderitems updatedordersitem = ordersitemsRepository.save(orderitemsDeatials);
        return updatedordersitem;
    }

}
