public class Q4 {
        public static void main(String[] args) {
            SinglyLinkedList<String> list = new SinglyLinkedList<>();

            // إضافة عناصر إلى القائمة
            list.addLast("A");
            list.addLast("B");
            list.addLast("C");

            // عرض العناصر قبل التدوير
            System.out.println("List before rotation: " + list.getAll());

            // تدوير القائمة
            list.rotate();

            // عرض العناصر بعد التدوير
            System.out.println("List after rotation: " + list.getAll());
        }
    }
