package data.entities;

import java.util.HashSet;
import java.util.Set;

public class Officiant {
    private int id;
    private String firstName;
    private String secondName;
    private Set<Order> orders;

    public Officiant() {
        this.orders = new HashSet<>();
    }

    public Officiant(String firstName, String secondName, Set<Order> orders) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.orders = orders;
    }

    protected Officiant(String firstName, String secondName, Set<Order> orders, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.orders = orders;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    protected void setId(){
        //???!!!
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void add(Order order) {

    }

    public Order remove(Order order) {
        return null;
    }

    public boolean contains(Order order){
        return false;
    }
}
