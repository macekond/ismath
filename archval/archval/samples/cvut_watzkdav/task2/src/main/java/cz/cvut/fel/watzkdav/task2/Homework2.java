package cz.cvut.fel.watzkdav.task2;
 
class Node {
	Node previous, next;
	int contents;
}
 
class List {
	Node first;

	// pro testovani (vypis z obou stran)
	/*void write() {
		Node n = first;
		Node p = first;
		
		System.out.print("write(): { ");
		
		while(n != null) {
			System.out.print(n.contents+", ");
			p = n;
			n = n.next;
		}
		
		System.out.println("}");
		
		System.out.print("write2(): { ");
		
		while(p != null) {
			System.out.print(p.contents+", ");
			p = p.previous;
		}
		
		System.out.println("}");
	}*/
 
	void add(int num) {
		// List jiz obsahuje tuto polozku
		if(contains(num)) {
			return;
		}

		// List je prazdny, pridavame na zacatek
		if(first == null) {
			first = new Node();
			first.contents = num;
			return;
		}
		
		// List ma jednu polozku, nova je mensi, pridavame na zacatek
		if(num < first.contents) {
			Node t = first;
			first = new Node();
			first.contents = num;
			first.next = t;
			first.next.previous = first;
			return;
		}

		Node n = first;

		// List neni prazdny
		while(n.next != null) {
			n = n.next;
			
			if(num > n.contents)
				continue;

			// pridavame doprostred listu, musime seznam prekopat odprostredka k zacatku
			Node t = n.previous;

			n.previous = new Node();
			n.previous.contents = num;
			n.previous.next = n;
			n.previous.previous = t;
			if(t != null)
				t.next = n.previous;
			
			return;
		}
		
		// pridavame na konec
		n.next = new Node();
		n.next.contents = num;
		n.next.previous = n;
	}
	
	void remove(int num) {
		Node p = null;
		Node n = first;

		// pokud je list prazdny, koncime
		while(n != null) {
			// pokud jsme narazili na polozku ke smazani
			if(n.contents == num) {
				// pokud je to prvni polozka
				if(p == null) {
					first = n.next;
					if(first != null)
						first.previous = null;
				} else {
					p.next = n.next;
					if(n.next != null)
						n.next.previous = p;
				}
				return;
			} else { // jdeme dal
				p = n;
				n = n.next;
			}
		}
	}

	boolean contains(int num) {
		Node n = first;
		
		while(n != null) {
			if(n.contents == num) {
				return true;
			}

			n = n.next;
		}
		
		return false;
	}
}
