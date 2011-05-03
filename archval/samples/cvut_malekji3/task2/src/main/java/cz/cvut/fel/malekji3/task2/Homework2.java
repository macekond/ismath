package cz.cvut.fel.malekji3.task2;

class Homework2
{
    public static void main(String[] args)
    {
        List MyList = new List();
        MyList.add(5);
        MyList.add(2);
        MyList.add(10);
        MyList.add(1);
        MyList.add(30);
        MyList.add(20);
        MyList.add(1);
        MyList.show();
        MyList.remove(20);
        MyList.show();
    }
}

class Node
{
    Node previous;
    Node next;
    int contents;

    public Node(int i)
    {
        this.contents = i;
    }
}

class List
{
    Node first;

    void add(int num)
    {
        Node tmp = this.first;
        Node newNode = new Node(num);

        if(tmp == null)
        {
            this.first = newNode;
            return;
        }

        while(tmp != null)
        {
            if(newNode.contents > tmp.contents)
            {
                if(tmp.next == null)
                {
                    tmp.next = newNode;
                    newNode.previous = tmp;
                    return;
                }
                else
                    tmp = tmp.next;
            }
            else
            {
                if(newNode.contents == tmp.contents)
                    return;

                Node prev = tmp.previous;

                if(prev == null)
                    this.first = newNode;
                else
                {
                    prev.next = newNode;
                    newNode.previous = prev;
                }
       
                newNode.next = tmp;
                tmp.previous = newNode;
                return;
            }
        }
    }

    void remove(int num)
    {
        Node tmp = this.first;

        while(tmp != null)
        {
            if(tmp.contents == num)
            {
                Node prev = tmp.previous;
                Node next = tmp.next;

                if(prev == null)
                    this.first = next;
                else
                    prev.next = next;
                
                if(next != null)
                    next.previous = prev;

                return;
            }
            else
            {
                if(num < tmp.contents)
                    return;
                tmp = tmp.next;
            }
        }
    }
    
    boolean contains(int num)
    {
        Node tmp = this.first;
        while(tmp != null)
        {
            if(tmp.contents == num)
                return true;
            tmp = tmp.next;
        }
        return false;
    }

    void show()
    {
        Node last = null;
        Node tmp = this.first;
        System.out.println("-----");
        System.out.print("--> ");
        while(tmp != null)
        {
            System.out.print(tmp.contents);
            if(tmp.next != null)
                System.out.print(", ");
            else
                System.out.println();
            last = tmp;
            tmp = tmp.next;
        }

        tmp = last;
        System.out.print("<-- ");
        while(tmp != null)
        {
            System.out.print(tmp.contents);
            if(tmp.previous != null)
                System.out.print(", ");
            else
                System.out.println();
            tmp = tmp.previous;
        }
        System.out.println("-----");
    }
}