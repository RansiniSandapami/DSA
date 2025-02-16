/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USER
 */
public class ArrayListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList list = new ArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        
        list.display(); // Output: 10 20 30

        list.insert(1, 15);
        list.display(); // Output: 10 15 20 30

        list.delete(2);
        list.display(); // Output: 10 15 30

        System.out.println("Element at index 1: " + list.get(1)); // Output: 15

        list.update(1, 25);
        list.display(); // Output: 10 25 30

        System.out.println("Index of 30: " + list.find(30)); // Output: 2

        System.out.println("Is list empty? " + list.isEmpty()); // Output: false
        System.out.println("Size of list: " + list.size()); // Output: 3
    }
    }
    

