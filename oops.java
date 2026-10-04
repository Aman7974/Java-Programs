class Mobile{
    private String name;
    private String brand;
    static private int price;

    //static block to initialize the static variable
    static {
        price = 999; // Initialize the static variable
        System.out.println("Static block executed. Price initialized to: " + price);
    }

     public Mobile(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        // this.price = price;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    public String setBrand(String brand) {
        this.brand = brand;
        return brand;
    }

    public String getBrand() {
        return brand;
    }

    public int setPrice(int price) {
        // this.price = price;
        return price;
    }

    public int getPrice() {
        return price;
    }

    void displayDetails() {
        System.out.println("Mobile Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
    }

} 



public class oops {
    public static void main(String a[]){
        Mobile mobile1 = new Mobile("iPhone", "Apple", 999);
        // mobile.setName("iPhone 13");
        // mobile.setBrand("Apple");
        // mobile.setPrice(1099);
        Mobile mobile2 = new Mobile("Galaxy S21", "Samsung", 799);

        
        mobile1.displayDetails();
        mobile2.displayDetails();


        
         

}    
}
