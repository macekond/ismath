package cz.cvut.fel.jezdirad.task2;


class Node {

	Node previous, next;

	int contents;

}


class List {

	Node first;


	void add(int num) {
		Node add = new Node();
		add.contents = num;

		if(first == null) {
			first = add;
			return;
		}

		if(num < first.contents) {
			add.next = first;
			first.previous = add;
			first = add;
			return;
		}

		Node node = first;
		while(node != null) {
			if(node.next == null || (node.contents <= num && num < node.next.contents)) {
				if(node.contents == num) {
					return;
				}

				if(node.next != null) {
					node.next.previous = add;
				}
				add.next = node.next;
				node.next = add;
				add.previous = node;
				return;
			}
			node = node.next;
		}
	}


	void remove(int num) {
		Node node = first;
		while(node != null) {
			if(node.contents > num) {
				return;
			}
			if(node.contents == num) {
				if(node.previous != null) {
					node.previous.next = node.next;
				}
				if(node.next != null) {
					node.next.previous = node.previous;
				}
				if(node == first) {
					first = node.next;
				}
				return;
			}
			node = node.next;
		}
	}


	boolean contains(int num) {
		Node node = first;
		while(node != null) {
			if(node.contents > num) {
				return false;
			}
			if(node.contents == num) {
				return true;
			}
			node = node.next;
		}
		return false;
	}

}
