package com.driver;
import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    OrderRepository orderRepository = new OrderRepository();

    public OrderService(){}
    public OrderService(OrderRepository orderRepository){}

    public void addOrder(Order order) {
        orderRepository.addOrder(order);
    }

    public void addPartner(String partnerId) {
        orderRepository.addPartner(partnerId);
    }

    public void addOrderPartnerPair(String orderId, String partnerId) {
        orderRepository.addOrderPartnerPair(orderId, partnerId);
    }

    public Order getOrderById(String orderId) {
        return orderRepository.getOrderById(orderId);
    }
    public DeliveryPartner getPartnerById(String partnerId){
        return orderRepository.getPartnerById(partnerId);
    }
    public int getOrderCountByPartnerId(String partnerId){
        return orderRepository.getOrderCountByPartnerId(partnerId);
    }
    public List<String> getOrdersByPartnerId(String partnerId){
        return orderRepository.getOrdersByPartnerId(partnerId);
    }
    public List<String> getAllOrders(){
        return orderRepository.getAllOrders();
    }
    public int getCountOfUnassignedOrders(){
        return orderRepository.getCountOfUnassignedOrders();
    }
    public int getOrdersLeftAfterGivenTimeByPartnerId(String time, String partnerId){
        return orderRepository.getOrdersLeftAfterGivenTimeByPartnerId(time, partnerId);
    }
    public String getLastDeliveryTimeByPartnerId(String partnerId){
        return orderRepository.getLastDeliveryTimeByPartnerId(partnerId);
    }
    public void deletePartnerById(String partnerId){
        orderRepository.deletePartnerById(partnerId);
    }
    public void deleteOrderById(String orderId){
        orderRepository.deleteOrderById(orderId);
    }

}