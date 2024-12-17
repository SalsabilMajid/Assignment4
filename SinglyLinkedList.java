public class SinglyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }


    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }
    public void addLast(E e)
    {
        Node<E>newest= new Node<>(e,null);
        if (size==0)
            head=newest;
        else
            tail.setNext(newest);
        tail = newest;
        //tail= tail.next;
        size++;
    }

    public E removeFirst()
    {
        if (isEmpty())return null;
        E deleted = head.element;
        head=head.next;
        size--;
        if (size==0)
            tail=null;
        return deleted;
    }
    public String getAll()
    {
        String all="";
        Node<E>p=head;
        while (p!=null)
        {
            all=all+p.element+"   ";
            p=p.next;
        }
        return all;
    }
    //Q1
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // نفس الكائن
        if (obj == null || getClass() != obj.getClass()) return false; // تحقق من النوع

        SinglyLinkedList<?> other = (SinglyLinkedList<?>) obj; // تحويل إلى نوع القائمة المرتبطة

        if (this.size != other.size) return false; // تحقق من الحجم

        Node<E> current1 = this.head;
        Node<?> current2 = other.head;

        while (current1 != null) {
            if (!current1.getElement().equals(current2.getElement())) {
                return false; // إذا كان هناك عنصر لا يتطابق
            }
            current1 = current1.getNext(); // الانتقال إلى العنصر التالي
            current2 = current2.getNext();
        }

        return true; // كل العناصر متطابقة
    }
    //Q4
    public void rotate() {
        if (isEmpty() || head.getNext() == null) {
            return; // لا تفعل شيئًا إذا كانت القائمة فارغة أو تحتوي على عنصر واحد
        }

        E firstElement = removeFirst(); // إزالة العنصر الأول
        addLast(firstElement); // إضافة العنصر الأول إلى النهاية
    }
    //Q5
    public void concatenate(SinglyLinkedList<E> M) {
        if (this.isEmpty()) {
            // إذا كانت L فارغة، اجعلها تشير إلى M
            this.head = M.head;
            this.tail = M.tail;
        } else if (!M.isEmpty()) {
            // إذا كانت L غير فارغة و M غير فارغة
            this.tail.setNext(M.head); // ربط العقدة الأخيرة في L مع الرأس في M
            this.tail = M.tail; // تحديث tail لـ L ليشير إلى tail لـ M
        }
    }
    //Q6
    public void reverse() {
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next = null;

        while (current != null) {
            next = current.next;  // تخزين العقدة التالية
            current.next = prev;  // عكس المؤشر
            prev = current;       // نقل prev إلى current
            current = next;       // نقل current إلى next
        }

        head = prev;            // تحديث الرأس
    }

}



