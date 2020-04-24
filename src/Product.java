public class Product implements Comparable<Product>{

    private String name;
    private int id;
    private double cost;

    public Product(int id,String name, double cost){
        this.id = id;
        this.name =name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public double getCost() {
        return cost;
    }

    public Product setCost(double cost) {
        this.cost = cost;
        return this;
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+" "+this.cost;
    }

}
