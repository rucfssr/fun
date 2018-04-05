package com.having.fun;

/**
 * Should be a junit but its not mentioned.
 * 
 * Rest of implementation is meeting the requirement
 * 
 *
 */
public class Main {

	public static void main(String args[]) {
		IntLinkedList intLinkedList = new IntLinkedList();
		intLinkedList.add(1);
		intLinkedList.add(2);
		intLinkedList.add(3);
		intLinkedList.add(4);
		intLinkedList.add(5);
		intLinkedList.print();

		// removing tail
		intLinkedList.remove();
		intLinkedList.print();

		intLinkedList.removeAll(3);
		intLinkedList.print();
	}
}
