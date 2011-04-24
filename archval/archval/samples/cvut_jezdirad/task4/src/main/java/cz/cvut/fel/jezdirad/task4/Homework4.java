package cz.cvut.fel.jezdirad.task4;


interface Stack {

	/** vlozi prvek na vrchol **/
	void push(int value);


	/** vyjme prvek z vrcholu **/
	int pop();


	/** postupne vlozi prvky pole na zasobnik **/
	void multiPush(int[] values);

}


abstract class AbstractStack implements Stack {

	public void multiPush(int[] values) {
		for(int i : values) {
			push(i);
		}
	}

}


class ListStack extends AbstractStack {

	static class StackNode {

		StackNode next;

		int value;

	};

	StackNode top;


	public void push(int value) {
		StackNode tmp = new StackNode();
		tmp.value = value;
		tmp.next = top;
		top = tmp;
	}


	public int pop() {
		int tmp = top.value;
		top = top.next;
		return tmp;
	}

}


class ArrayStack extends AbstractStack {

	int[] content = new int[10000];

	int top = 0;


	public void push(int value) {
		content[top++] = value;
	}


	public int pop() {
		return content[--top];
	}

}
