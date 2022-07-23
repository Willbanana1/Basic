class User{

    private int id;
    private String First;
    private String Last;
    private int amount; 
    private String purchased;

    public User(int id, String First, String Last, int amount, String purchased) {
        this.id = id;
        this.First = First;
        this.Last = Last;
        this.amount = amount;
        this.purchased = purchased;

    }

    public void getInfo() {
        System.out.println("\n id: " + id + "\n First name: " + First + "\n Last name: " + Last + "\n Amount of money: " + amount + "\n Purchased: " + purchased);
    }
    public int getAmount(){
        return amount;
    }
    public int getId(){
        return id;
    }
    public void changeAmount(int amount){
        this.amount = amount;
    }
    public void addpurchased(String temp){
        this.purchased = purchased.concat(temp);
    }
    public void getPurchased(){
        System.out.println(purchased);
    }
    public boolean check(String n){
        if (purchased.indexOf(n) != -1){
            return true;
        }
        else {
            return false;
        }

    }
}