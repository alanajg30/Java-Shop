import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import ShoppingPageLists.item;

public class AddItemPage implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel WelcomeAddingItem = new JLabel("Add Item");
    private JLabel nameLabel = new JLabel("Enter Name: ");
    private JLabel quantityLabel = new JLabel("Enter Quantity: ");
    private JLabel priceLabel = new JLabel("Enter Price: $");
    private JTextField nameTextField = new JTextField();
    private JTextField quantityTextField = new JTextField();
    private JTextField priceTextField = new JTextField();
    private JButton SaveButton = new JButton("Save");
    public ArrayList<item> LocalShoppingList = new ArrayList<>();
    //create textfields for all of these and scve button
    private int quantity;
    private double price;
    private String name;

    public AddItemPage(ArrayList<item> ShoppingList) {
        LocalShoppingList = ShoppingList;
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(null);
        SaveButton.addActionListener(this);

        WelcomeAddingItem.setBounds(210, 50, 200, 25);
        WelcomeAddingItem.setFont(new Font(null,Font.PLAIN,25));
        nameTextField.setBounds(125,100,200,25);
        quantityTextField.setBounds(125,150,200,25);
        priceTextField.setBounds(125,200,200,25);
        nameLabel.setBounds(50,100,200,25);
        quantityLabel.setBounds(50,150,200,25);
        priceLabel.setBounds(50,200,200,25);
        SaveButton.setBounds(210, 250, 100,25);

        //quantity = scan
        //name = scan
        //price = scan
        //save button creates a new item(name, quantity, price) and adds it to the shoppinglist
        panel.add(WelcomeAddingItem);
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(quantityLabel);
        panel.add(quantityTextField);
        panel.add(priceLabel);
        panel.add(priceTextField);
        panel.add(SaveButton);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setTitle("Add New Item");
        //frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SaveButton) {
            name = nameTextField.getText();
            quantity = Integer.parseInt(quantityTextField.getText());
            price = Double.parseDouble(priceTextField.getText());
            item newItem = new item(name, quantity, price);
            LocalShoppingList.add(newItem);
            frame.dispose();
            ShoppingPage openShoppingPage = new ShoppingPage(LocalShoppingList);
        }
    }
}
//Once button is pressed, it returns the Arraylist and updates it