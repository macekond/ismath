package cz.cvut.fel.taranpe1.task5;

public class Homework5{

}

class Node {
    Node previous, next;
    int contents;
}
 
class List {
    Node first;
 
    void add(int num) {
        Node newNode = new Node();
        newNode.contents = num;
 
        if (first == null) {
            first = newNode;
            return;
        }
 
        assert first != null;
        if (first.contents >= num) {
            first.previous = newNode;
            newNode.next = first;
            first = newNode;
            return;
        }
 
        assert first.contents < num;
        Node tmp = first;
        while (tmp.contents < num && tmp.next != null) tmp = tmp.next;
 
        assert tmp != null;
        if (tmp.contents < num && tmp.next == null) {
            tmp.next = newNode;
            newNode.previous = tmp;
        } else {
            assert tmp.contents >= num;
            assert tmp.previous.contents < num;
            newNode.previous = tmp.previous;
            newNode.previous.next = newNode;
            newNode.next = tmp;
            newNode.next.previous = newNode;
        }
 
    }
 
    void remove(int num) {
        if (first == null) return;
 
        assert first != null;
        if (first.contents == num) {
            first = first.next;
            if (first != null) first.previous = null;
        }
 
        assert (first != null) && (first.contents != num);
        Node tmp = first;
        while (tmp != null && tmp.contents < num) tmp = tmp.next;
 
        if (tmp == null) return;
 
        assert (tmp != null) && (tmp.contents >= num);
        if (tmp.contents > num) return;
 
        assert (tmp.contents == num) && (tmp != first);
        tmp.previous.next = tmp.next;
        if (tmp.next != null) tmp.next.previous = tmp.previous;
    }
 
    boolean contains(int num) {
        Node tmp = first;
        while (tmp != null) {
            if (tmp.contents == num) return true;
            tmp = tmp.next;
        }
        return false;
    }
}