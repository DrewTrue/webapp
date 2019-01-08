package data.entities;

public class Item {
    private int id;
    private String name;
    private String discription;
    private double cost;

    public Item() {
        //???!!!
    }

    public Item(String name, String discription, double cost) {
        this.name = name;
        this.discription = discription;
        this.cost = cost;
    }

    protected Item(String name, String discription, double cost, int id) {
        this.name = name;
        this.discription = discription;
        this.cost = cost;
        this.id = id;
    }

    private boolean isIdValid(int id){
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getDiscription() {
        return discription;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected void setId() {
        //???!!!
    }

    public int getId() {
        return id;
    }
}
