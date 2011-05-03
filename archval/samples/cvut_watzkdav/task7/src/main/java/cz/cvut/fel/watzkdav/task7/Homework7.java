package cz.cvut.fel.watzkdav.task7;

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
	private final Stack stack;
	private int size;
 
	public StackAdapter(Stack s) {
		this.stack = s;
	}
 
	public void push(int i) {
		size++;
		stack.push(i);
	}

	public int pop() {
		size--;
		return stack.pop();
	}
 
	public int getSize() {
		return size;	
	}
}
