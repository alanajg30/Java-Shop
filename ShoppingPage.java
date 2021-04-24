import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import ShoppingPageLists.item;

import javax.swing.*;

public class ShoppingPage implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JButton editItem = new JButton("Edit Item");
    private JButton addItem = new JButton("Add New Item");
    private JPanel modificationPanel = new JPanel();
    protected ArrayList<item> ShoppingList = new ArrayList<>();
    public ShoppingPage(){
        editItem.addActionListener(this);
        addItem.addActionListener(this);
        /* Example
        item First = new item("Nike Shoes", 4, 10);
        item Second = new item("Adidas Shoes", 8, 15);
        item Third = new item("Reeboks Shoes", 13, 12);
        ShoppingList.add(First);
        ShoppingList.add(Second);
        ShoppingList.add(Third);
         */
        //Format: ShoppingList.add(new item(name, quantity, price));

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new FlowLayout());
        modificationPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        modificationPanel.setLayout(new FlowLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(modificationPanel, BorderLayout.SOUTH);

        modificationPanel.add(editItem);
        modificationPanel.add(addItem);
        for (int i = 0; i< ShoppingList.size(); i++){
            item currentItem = ShoppingList.get(i); //creates a copy of item at index[i] and adds a JButton from the method
            panel.add(currentItem.getItemButton());
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setTitle("Shopping Page");
        //frame.pack();
        frame.setVisible(true);
    }
    public ShoppingPage(ArrayList<item> ShoppingListInput){
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new FlowLayout());
        modificationPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        modificationPanel.setLayout(new FlowLayout());
        editItem.addActionListener(this);
        addItem.addActionListener(this);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(modificationPanel, BorderLayout.SOUTH);

        modificationPanel.add(editItem);
        modificationPanel.add(addItem);
        ShoppingList = ShoppingListInput;
        for (int i = 0; i< ShoppingList.size(); i++){
            //panel.add(ShoppingList.get(i.getItemButton()));
            item currentItem = ShoppingList.get(i);
            panel.add(currentItem.getItemButton());
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setTitle("Shopping Page");
        //frame.pack();
        frame.setVisible(true);
    }
    //
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == editItem){

        } else if (e.getSource() == addItem){
            frame.dispose();
            AddItemPage openItemPage = new AddItemPage(ShoppingList);
        }
        JButton logoutButton = new JButton("Logout");
        logoutButton.setBounds(90, 90, 10, 30);
        frame.add(logoutButton);
        
        public void actionPerformed(ActionEvent e) {
         if(e.getSource() == logoutButton) {
           LoginScreen loginScreen = new LoginScreen();  
         }
        }
    }
}
