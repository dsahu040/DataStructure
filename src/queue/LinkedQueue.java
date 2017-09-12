package queue;

import java.util.NoSuchElementException;

/**
 * Implementation of Queue data structure using Linked List
 * @author DEEP
 *
 */
public class LinkedQueue {

	protected Node front;
	protected Node rear;
	public int size;
	
	public LinkedQueue() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void insert(int data) {
		Node n = new Node(data, null);
		if(rear==null){
			front = n;
			rear = n;
		} else {
			rear.setLink(n);
			rear = rear.getLink();
		}
		size++;
	}
	
	public int remove() {
		if(isEmpty()) {
			throw new NoSuchElementException("UnderFlow Exception");
		}
		Node ptr = front;
		front = ptr.getLink();
		if(front == null) {
			rear = null;
		}
		size--;
		return ptr.getData();
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException("UnderFlow Exception");
		}
		return front.getData();	
	}
	
	public void display() {
		System.out.println("\nQueue = ");
		if(size==0) {
			System.out.print("Empty \n");
			return;
		}
		Node ptr = front;
		while (ptr != rear.getLink()) {
			System.out.println(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
		System.out.println();
	}
}


	/*
	 * Class Node
	 */
	class Node {
		protected int data;
		protected Node link;
	
	public Node() {
		link = null;
		data = 0;
	}
	
	public Node(int d, Node n) {
		data = d;
		link = n;
	}
	
	public void setLink(Node n) {
		link = n;
	}
	
	public void setData(int d) {
		data = d;
	}
	
	public Node getLink(){
		return link;
	}
	
	public int getData() {
		return data;
	}
}
	
	
