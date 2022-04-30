// Single-responsibility principle
// responsible only for the content of the issuance of items

import java.util.List;

public class Inventory {
    private int size;
    private List<Item> items;

    public Inventory(int size, List<Item> items) {
        this.size = size;
        this.items = items;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "\n\tInventory{" +
                "size=" + size +
                ", items=" + items +
                '}';
    }
}