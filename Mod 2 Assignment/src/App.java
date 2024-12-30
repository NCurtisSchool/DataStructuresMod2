/*
Name: Nathan Curtis
Date: 12/22/2024
Class: Data Structures and Algorithms 24WB-CSC400-1
Teacher: Herbert Pensado
Assignment: Mod 2 Assignment
GitHub: https://github.com/NCurtisSchool/DataStructuresMod2.git
*/

public class App {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Creates object
        Bag listOne = new Bag<>();
        Bag listTwo = new Bag<>();

        // Add items into listOne
        listOne.add("Apple");
        listOne.add("Grapes");
        listOne.add("Garlic");
        listOne.add("Chocolate");
        listOne.add("Milk");
        listOne.add("Ginger");
        listOne.add("Ginger");
        listOne.add("Chocolate");
        listOne.add("Apple");
        listOne.add("Apple");

        // Add items into listTwo
        listTwo.add("Cherry");
        listTwo.add("Sugar");
        listTwo.add("Garlic");
        listTwo.add("Chocolate");
        listTwo.add("Sugar");
        listTwo.add("Ginger");
        listTwo.add("Ginger");
        listTwo.add("Chocolate");
        listTwo.add("Cherry");
        listTwo.add("Apple");
        listTwo.add("Garlic");
        listTwo.add("Chocolate");
        listTwo.add("Sugar");

        // Print Size of bag one and two
        System.out.println("The size of bag one: " + listOne.size());
        System.out.println("The size of bag two: " + listTwo.size());

        // Merge bag 1 and 2
        listOne.merge(listTwo);

        // Print merged bag (1)
        System.out.println();
        System.out.println("Merged Bag: ");
        listOne.outputString();

        // Create distinct bag using bag 1
        Bag listDistinct = listOne.distinct();

        // print distinct bag
        System.out.println();
        System.out.println("Distinct Bag: ");
        listDistinct.outputString();
    }
}
