public class Item {
    private final String name;
    private int amount;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void printItem() {
        System.out.println(name);
    }
}
