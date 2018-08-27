package entity;

public class Mobile {

    private int id;             //id
    private String name;        //名称
    private String storage;     //储存
    private double in;          //尺寸
    private float money;        //价格
    private String color;       //颜色


    public Mobile() {

    }

    public Mobile(String name, String storage, double in, float money, String color) {
        this.name = name;
        this.storage = storage;
        this.in = in;
        this.money = money;
        this.color = color;
    }

    public Mobile(int id, String name, String storage, double in, float money, String color) {
        this.id = id;
        this.name = name;
        this.storage = storage;
        this.in = in;
        this.money = money;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public double getIn() {
        return in;
    }

    public void setIn(double in) {
        this.in = in;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
