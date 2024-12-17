public class Q6 {
    public static void main(String[] args) {

        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");

        System.out.println("Before reversing: " + list.getAll());
        list.reverse();
        System.out.println("After reversing: " + list.getAll());
    }
}
