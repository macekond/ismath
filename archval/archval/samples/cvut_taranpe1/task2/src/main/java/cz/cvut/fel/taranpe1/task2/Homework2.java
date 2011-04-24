package cz.cvut.fel.taranpe1.task2;

class Node {

    int contents;
    Node previous, next;

    public Node() {
    }
}

class List {

    Node first;

    public List() {
    }

    private boolean isEmpty() {
        return first == null ? true : false;
    }

    void add(int num) {
        Node tmp = new Node();
        tmp.contents = num;
        if (isEmpty()) {
            first = tmp;
        } else {
            if (contains(num)) {
                return;
            } else {
                Node node = first;
                for (; node != null;) {
                    if (num >= node.contents) {
                        if (node.next == null) {
                            node.next = tmp;
                            tmp.previous = node;
                            return;
                        } else {
                            node = node.next;
                        }
                    } else {
                        Node iterator = node.previous;
                        if (iterator == null) {
                            first = tmp;
                            tmp.next = node;
                            node.previous = tmp;
                            return;
                        } else {
                            iterator.next = tmp;
                            tmp.previous = iterator;
                            tmp.next = node;
                            node.previous = tmp;
                            return;
                        }
                    }
                }
            }
        }
    }

    void remove(int num) {
        if (isEmpty()) {
            return;
        }
        for (Node node = first; node != null; node = node.next) {
            if (node.contents == num) {
                if (first.next == null) {
                    first = null;
                } else {
                    if (first.contents == num) {
                        first = first.next;
                        first.previous = null;
                    } else {
                        if (node.next == null) {
                            Node tmp = node.previous;
                            tmp.next = null;
                        } else {
                            Node tmp = node.previous;
                            node.next.previous = tmp;
                            tmp.next = tmp.next.next;
                        }
                    }
                }
            }
        }
    }

    boolean contains(int num) {
        for (Node node = first; node != null; node = node.next) {
            if (node.contents == num) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String s = "[ ";
        for (Node node = first; node != null; node = node.next) {
            s = s + " " + node.contents + " ";

        }
        return s + " ]";
    }

//    public static void main(String[] args) {
//        List list = new List();
//        System.out.println("Test add");
//        list.add(1); // vkladani do prazdna
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(8); // testovani sort metody
//        list.add(6);
//        list.add(7); // vkladani posledniho
//        list.add(5);
//        list.add(10);
//        list.add(0);
//        list.add(5);
//        System.out.println(list);
//        System.out.println("Test contains");
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(4));
//        System.out.println(list.contains(7));
//        System.out.println(list.contains(8));
//        System.out.println("Test remove");
//        list.remove(10);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);
//        list.remove(5);
//        System.out.println(list);
//        list.add(5);
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//
//        List list2 = new List();
//        list2.remove(1);
//        list2.add(3);
//        System.out.println(list2);
//        list2.remove(4);
//        list2.remove(3);
//        System.out.println(list2);
//    }
}

public class Homework2 {

    public Homework2() {
    }
}
