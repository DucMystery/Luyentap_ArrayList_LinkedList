import java.util.*;

public class MainTest {

    public static void main(String[] args) {

        Product product1 = new Product(01,"hi",200);
        Product product2 = new Product(02,"hi",250);
        Product product3 = new Product(03,"hi",260);
        Product product4 = new Product(04,"hi",240);
        Product product5 = new Product(05,"hi",202);


        List<Product> lists = new ArrayList<Product>();
        lists.add(product1);
        lists.add(product2);
        lists.add(product3);
        lists.add(product4);
        lists.add(product5);
        
        Collections.sort(lists);
        for (Product product :lists){
            System.out.println(product.toString());
        }

        System.out.println("====================");
        Scanner sc  = new  Scanner(System.in);
        int id = sc.nextInt();
        System.out.println(lists.toString());
        editProduct(lists, sc, id);
        System.out.println(lists.toString());
        removeProduct(lists, id);
        System.out.println(lists.toString());
        String name = sc.next();
        displayName(lists, name);
        CostManager x = new CostManager();
        Collections.sort(lists,x);
        System.out.println(lists.toString());

    }

    public static void editProduct(List<Product> myProducts, Scanner sc, int id) {
        for(Product x : myProducts){
            if(x.getId()==id){
                String name = sc.next();
                x.setName(name);
                int cost = sc.nextInt();
                x.setCost(cost);
                break;
            }
        }
    }
    public static void removeProduct(List<Product> myProducts, int id) {
        for(Product x : myProducts){
            if(x.getId()==id){
                myProducts.remove(x);
                break;
            }
        }
    }

    public static void displayName(List<Product> myProducts, String name) {
        for(Product x : myProducts){
            if(x.getName().equals(name)){
                System.out.println(x.toString());
                break;
            }
        }
    }
}
