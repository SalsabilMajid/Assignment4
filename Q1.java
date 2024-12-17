public class Q1 {
        public static void main(String[] args) {
            SinglyLinkedList<String> list1 = new SinglyLinkedList<>();
            SinglyLinkedList<String> list2 = new SinglyLinkedList<>();

            // إضافة عناصر إلى القائمة الأولى
            list1.addLast("A");
            list1.addLast("B");
            list1.addLast("C");

            // إضافة عناصر إلى القائمة الثانية
            list2.addLast("A");
            list2.addLast("B");
            list2.addLast("C");

            // اختبار المساواة
            System.out.println("Are list1 and list2 equal? " + list1.equals(list2));

            // إضافة عنصر مختلف إلى القائمة الثانية
            list2.addLast("D");

            // اختبار المساواة مرة أخرى
            System.out.println("Are list1 and list2 equal after adding an element to list2? " + list1.equals(list2));
        }
    }

