class Product{

    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void getInfo() {
        System.out.println("\n id: " + id + "\n name: " + name + "\n price: " + price);
}
    public int getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }
    public String getName (){
        return name;
    }
}
    