package at.technikumwien.backendSystem.controller;

import at.technikumwien.backendSystem.entity.Order;
import at.technikumwien.backendSystem.entity.Orders;
import at.technikumwien.backendSystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping("/test")
    public String test(){
        return "Test succeed";
    }

    @GetMapping(value = "/all", produces= MediaType.APPLICATION_XML_VALUE)
    public Orders findAllOrders() {
        List<Order> orders = orderRepository.findAll();
        Orders xmlOrders = new Orders();
        xmlOrders.setOrders(orders);
        return xmlOrders;
    }

    @GetMapping(value = "/query", produces= MediaType.APPLICATION_XML_VALUE)
    public Orders findOrdersByOrderNo(@RequestParam(value = "orderNo") long orderNo) {
        List<Order> orders = orderRepository.findByOrderNo(orderNo);
        Orders xmlOrders = new Orders();
        xmlOrders.setOrders(orders);
        return xmlOrders;
    }

    @PostMapping(value = "/save", produces= MediaType.APPLICATION_XML_VALUE)
    public Orders saveOrders(@Validated @RequestBody Orders orders) {
        for(Order order : orders.getOrders()) {
            orderRepository.save(order);
        }
        return orders;
    }
}
