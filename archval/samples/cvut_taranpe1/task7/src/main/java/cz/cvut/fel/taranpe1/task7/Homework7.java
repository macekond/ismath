package cz.cvut.fel.taranpe1.task7;

public class Homework7{

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
 
class StackAdapter implements Stack {
    private Stack s;
    private int size = 0;
 
    public StackAdapter(Stack s) {
        this.s = s;
    }
 
    public void push(int i){
    	s.push(i);
	size++;
    }

    public int pop(){
	size--;
	return s.pop();
    }
 
    public int getSize() {
	return size;
    }
}