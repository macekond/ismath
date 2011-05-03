package cz.cvut.fel.malekji3.task7;

public class Homework7
{
    public static void main(String[] args)
    {
        Stack s = new StackImpl();
        StackAdapter a = new StackAdapter(s);
        a.push(5);
        a.push(1);
        a.pop();
        a.push(5);
        System.out.println(a.getSize());
    }
}

interface Stack {
    void push(int i);
    int pop();
}

class StackImpl implements Stack {
    int[] contents = new int[10000];
    int size = 0;

    public void push(int i) {
        contents[size++] = i;
    }

    public int pop() {
        return contents[--size];
    }

}

class StackAdapter implements Stack
{
    private Stack s;
    private int size; // já bych atribut size ve třídě StackImpl udělal privátní,
                      // proto vytvářím novou proměnnou
                      // jinak by se to mohlo řešit tak, že se zavolá s.size a nemuseli
                      // bychom zavádět novou proměnnou.

    public StackAdapter(Stack s)
    {
        this.s = s;
    }

    public int getSize()
    {
        return size;
    }

    public void push(int i)
    {
        s.push(i);
        this.size++;
    }

    public int pop()
    {
        this.size--;
        return s.pop();
    }
}