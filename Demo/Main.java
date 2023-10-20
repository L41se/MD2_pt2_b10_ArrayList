package Demo;

public class Main {
    public static void main(String[] args) {
        Demo<Integer> myList = new Demo<Integer>();
        myList.insertFirstNode(5);
        myList.insertFirstNode(4);
        myList.insertFirstNode(3);
        myList.insertFirstNode(2);
        myList.insertFirstNode(10);
        myList.insertLastNode(20);
        myList.readList();
        System.out.println("\n");
        System.out.println(myList.size);

    }
}
