package cz.cvut.fel.taranpe1.task4;

/**
 *
 * @author Petr Tarant
 */
interface Stack {

    void push(int value);

    /** vlozi prvek na vrchol **/
    int pop();

    /** vyjme prvek z vrcholu **/
    /** postupne vlozi prvky pole na zasobnik **/
    void multiPush(int[] values);
}

abstract class AStack implements Stack{

    public abstract int pop();

    public abstract void push(int value);

    public void multiPush(int[] values) {
        for (int i : values) {
            push(i);
        }
    }
}

class ListStack extends AStack{

    static class StackNode {

        StackNode next;
        int value;

        StackNode(int value, StackNode n) {
            this.value = value;
            this.next = n;
        }
    };
    private StackNode top;

    public void push(int value) {
        top = new StackNode(value, top);
    }

    public int pop() {
        int tmp = top.value;
        top = top.next;
        return tmp;
    }
}

class ArrayStack extends AStack{

    private int[] content = new int[10000];
    private int top = 0;

    public void push(int value) {
        content[top++] = value;
    }

    public int pop() {
        return content[--top];
    }
}

public class Homework4 {

    public static void main(String[] args) {
    }
}
