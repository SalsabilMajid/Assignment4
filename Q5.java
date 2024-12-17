public class Q5 {
        public static void main(String[] args) {
            // إنشاء قائمتين L و M
            SinglyLinkedList<String> L = new SinglyLinkedList<>();
            SinglyLinkedList<String> M = new SinglyLinkedList<>();

            // إضافة عناصر إلى القائمة L
            L.addLast("A");
            L.addLast("B");
            L.addLast("C");

            // إضافة عناصر إلى القائمة M
            M.addLast("D");
            M.addLast("E");

            // عرض العناصر قبل الدمج
            System.out.println("List L before concatenation: " + L.getAll());
            System.out.println("List M before concatenation: " + M.getAll());

            // دمج القائمتين
            L.concatenate(M);

            // عرض العناصر بعد الدمج
            System.out.println("List L after concatenation: " + L.getAll());
        }
    }
