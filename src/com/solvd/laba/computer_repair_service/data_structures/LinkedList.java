package com.solvd.laba.computer_repair_service.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Node<T>{
    T data;
    Node<T> next;
    Node<T> previous;

    public Node(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

}

public class LinkedList<T> implements Iterable<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList(){
        head = null;
        tail = null;
    }

    private Node<T> getNode(int index){
        Node<T> currentNode = head;
        if (index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for(int i = 0; i < index; i++){
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public T get(int index){
        Node<T> currentNode = getNode(index);
        return currentNode.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void set(int index, T data){
        Node<T> node = getNode(index);
        node.data = data;
    }

    //Adds to last
    public void add(T data){
        Node<T> node = new Node<T>(data);
        if (tail == null){
            tail = node;
            head = node;
        } else{
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public void prepend(T data){
        Node<T> node = new Node<>(data);

        if (isEmpty()){
            head = node;
            tail = node;
        } else{
            //If not empty, there is always head
            head.previous = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    /**
     * Adds an element next to provided index
     *
     * @param index
     * @param data
     */
    public void add(int index, T data){
        // Needed data
        Node<T> node = new Node<T>(data);
        Node<T> previous;

        //if is head
        if(index == 0){
            prepend(data);
            return;
        }

        //if is tail
        if(index == size - 1){
            add(data);
            return;
        }

        //If is intermediate
        previous = getNode(index);
        Node<T> next = previous.next;

        //Intermediate elements have both previous and next defined
        //Link node navigation to previous and next
        node.previous = previous;
        node.next = next;
        //Set previous navigation to node
        previous.next = node;
        //Set next navigation to node
        next.previous = node;
        size++;
    }

    public void remove(int index){
        //If there are no elements, this will throw an exception
        Node<T> node = getNode(index);
        //There are elements.
        //If Size == 1, both previous and next are null

        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }

        // Size >= 2
        //Three cases
        // 1 - Element is head: previous is null, next is defined
        // 2 - Element is tail: previous is defined, next is null
        // 3 - Element is intermediate: both are defined
        Node<T> previous = node.previous;
        Node<T> next = node.next;

        //Element is head
        if (previous == null){
            head = head.next;
            head.previous = null;
            size--;
            return;
        }

        //Element is tail
        if (next == null){
            tail = tail.previous;
            tail.next = null;
            size--;
            return;
        }

        //Element is intermediate
        previous.next = next;
        next.previous = previous;
        size--;
    }

    public void remove(Object o){
        Node<T> node = head;
        int currentIndex = 0;

        while(node != null){
            if(node.data.equals(o)){
                remove(currentIndex);
                return;
            }
            node = node.next;
            currentIndex++;
        }

        throw new NoSuchElementException("Element not found");
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T data = current.data;
            current = current.next;
            return data;
        }
    }
}