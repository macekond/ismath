package cz.cvut.fel.malekji3.task4;

/*
public class Homework4
{
    public static void main(String[] args)
    {
        int[] values = {1, 2, 3};
        Stack a = new ListStack();
        Stack b = new ArrayStack();

        System.out.println("--- ListStack ---");
        a.push(0);
        System.out.println(a.pop());
        a.multiPush(values);
        System.out.println(a.pop());
        System.out.println("-----------------");

        System.out.println("\n--- ArrayStack ---");
        b.push(0);
        System.out.println(b.pop());
        b.multiPush(values);
        System.out.println(b.pop());
        System.out.println("------------------");
    }
}
*/

interface Stack
{
    void push(int value); /** vlozi prvek na vrchol **/
    int pop();            /** vyjme prvek z vrcholu **/
    void multiPush(int[] values); /** postupne vlozi prvky pole na zasobnik **/
}

abstract class tStack implements Stack
{
    public void multiPush(int[] values)
    {
        for (int i: values)
            push(i);
    }
}

class ListStack extends tStack
{
    static class StackNode
    {
        StackNode next;
        int value;
    }

    StackNode top;

    public void push(int value)
    {
        StackNode tmp = new StackNode();
        tmp.value = value;
        tmp.next = top;
        top = tmp;
    }

    public int pop()
    {
        int tmp = top.value;
        top = top.next;
        return tmp;
    }
}

class ArrayStack extends tStack
{
    int[] content = new int[10000];
    int top = 0;

    public void push(int value)
    {
        content[top++] = value;
    }

    public int pop()
    {
        return content[--top];
    }
}