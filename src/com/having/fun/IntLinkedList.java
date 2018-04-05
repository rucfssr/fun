package com.having.fun;

public class IntLinkedList implements List<Integer> {

	private Node tail;

	/**
	 * Add new integer value
	 */
	@Override
	public void add(Integer t) {
		if (t == null) {
			throw new IllegalArgumentException("value can not be null");
		}
		if (tail == null) {
			tail = new Node(t);
		} else {
			Node node = new Node(t);
			node.previous = tail;
			tail = node;
		}

	}

	/**
	 * Remove value from tail
	 */
	@Override
	public void remove() {
		Node node = tail;
		tail = node.previous;
		node.previous = null;
	}

	@Override
	public void print() {
		System.out.println("Integer linked list");
		Node node = tail;
		while (node != null) {
			System.out.println(node.value);
			node = node.previous;
		}
	}

	/**
	 * Remove all elements greater than input integer
	 * 
	 * @param t
	 */
	public void removeAll(Integer t) {
		if (t == null) {
			throw new IllegalArgumentException("value can not be null");
		}
		Node node = tail;
		Node tempNode = null;

		while (node != null) {
			if (node.value > t) {
				if (tempNode == null) {
					node = node.previous;
					tail.previous = null;
					tail = node;
				} else {
					tempNode.previous = node.previous;
					node.previous = null;
					node = tempNode.previous;
				}
			} else {
				tempNode = node;
				node = node.previous;
			}
		}
	}

	private class Node {

		public Integer value;
		public Node previous;

		public Node(Integer value) {
			this.value = value;
			previous = null;
		}
	}

}
