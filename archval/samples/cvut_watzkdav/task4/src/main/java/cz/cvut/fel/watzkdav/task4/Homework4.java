package cz.cvut.fel.watzkdav.task4;

interface Stack {
	void push(int value); /** vlozi prvek na vrchol **/
	int pop();		/** vyjme prvek z vrcholu **/
	/** postupne vlozi prvky pole na zasobnik **/
	void multiPush(int[] values);
}

abstract class CStack implements Stack {
	abstract public void push(int value);
	abstract public int pop();

	public void multiPush(int[] values) {
		for (int i: values) {
			push(i);
		}
	}
}

class ListStack extends CStack {
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
 
class ArrayStack extends CStack {
	int[] content = new int[10000];
	int top = 0;
 
	public void push(int value) {
		content[top++] = value;
	}
 
	public int pop() {
		return content[--top];
	}
}
