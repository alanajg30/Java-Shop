package ShoppingPageLists;

import javax.swing.*;
import java.awt.*;

public class item {
    //anexisting item, quantity and price. e used to store theitems), as well as delete items.
    private int quantity;
    private double price;
    private String name;
    protected JButton itemButton;
    public item(String name, int quantity, double price){
        setItemButton(name, quantity, price);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setItemButton(String name, int Quantity, double price){
        itemButton = new JButton(name + " Q: " + Quantity + " P: $" + price);
        itemButton.setBackground(Color.white);
        itemButton.setVerticalAlignment(SwingConstants.TOP);
        itemButton.setPreferredSize((new Dimension(220,220)));
    }

    public JButton getItemButton() {
        return itemButton;
    }
}
