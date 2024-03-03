public class Toy {
    private int id;
    private String name;
    private int amount;
    private double weight;


    public Toy(int id, String name, int amount, double weight) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.weight = weight;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    /**
     * Изменение веса игрушки
     * @param weight Новый вес игрушки
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void reduceQuantity() {
        if (amount > 0) {
            amount--;
        }
    }

}
