package EnumClass;

public enum Laptop {
    Macbook(200000),
    XPS(190000),
    Vostro;

    private int price;

    private Laptop(){
        price = 5000;
    }

    private Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
