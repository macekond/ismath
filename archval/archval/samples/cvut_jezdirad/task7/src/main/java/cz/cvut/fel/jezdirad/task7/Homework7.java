package cz.cvut.fel.jezdirad.task7;


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

	Stack stack;

	int size = 0;


	public StackAdapter(Stack s) {
		stack = s;
	}


	public int getSize() {
		return size;
	}


	public void push(int i) {
		stack.push(i);
		size++;
	}


	public int pop() {
		int r = stack.pop();	// kvuli pripadne vyjimce jsem dal size-- za pop()
		size--;
		return r;
	}

}
