package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order{

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> item = new ArrayList<>();

    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItem() {
        return item;
    }

    public void addItem(OrderItem item){
        this.item.add(item);
    }
    public void removeItem(OrderItem item){
        this.item.remove(item);
    }
    public Double total(){
        double total = 0;
        for(OrderItem ot : item){
            total += ot.getPrice()*ot.getQuantity();
        }
        return total;
    }

    public void printAll(){
        for(OrderItem ot : item){
            System.out.println(ot.toString());
        }
    }

    @Override
    public String toString() {
        String currentDate = sdf2.format(moment.getTime());
        return "Order " +
                String.format("%nOrder Moment= ") + currentDate +
                String.format("%nOrder Status= ") + status +
                '.';
    }
}