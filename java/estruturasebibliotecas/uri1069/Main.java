/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasebibliotecas.uri1069;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kyoo
 */
class EmptyStackException extends RuntimeException {
    public EmptyStackException(String err) {
        super(err);
    }
}

class FullStackException extends RuntimeException {
    public FullStackException(String err) {
        super(err);
    }
}

interface Stack<E> {
    public int size();

    public boolean isEmpty();

    public E top() throws EmptyStackException;

    public void push(E element);

    public E pop() throws EmptyStackException;
}

class Node<E> {
    private E element;
    private Node<E> next;

    public Node() {
        this(null, null);
    }

    public Node(E e, Node<E> n) {
        element = e;
        next = n;
    }

    public E getElement() {
        return element;
    }

    Node<E> getNext() {
        return next;
    }

    public void setElement(E newElem) {
        element = newElem;
    }

    public void setNext(Node<E> newNext) {
        next = newNext;
    }
}

class NodeStack<E> implements Stack<E> {
    protected Node<E> top;
    protected int size;

    public NodeStack() {
        top = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (top == null)
            return true;
        return false;
    }

    @Override
    public void push(E elem) {
        Node<E> v = new Node<>(elem, top);
        top = v;
        size++;
    }

    @Override
    public E top() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException("Stack is empty.");
        return top.getElement();
    }

    @Override
    public E pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException("Stack is empty.");
        E temp = top.getElement();
        top = top.getNext();
        size--;
        return temp;
    }
}

public class Main {
    public static String stripEnds(String t) {
        if (t.length() <= 2)
            return null;
        return t.substring(1, t.length() - 1);
    }

    public static boolean isOpeningTag(String tag) {
        return (tag.length() == 0) || (tag.charAt(0) != '/');
    }

    public static boolean areMatchingTags(String tag1, String tag2) {
        return tag1.equals(tag2.substring(1));
    }

    public static boolean isHTMLMatched(String[] tag) {
        Stack<String> S = new NodeStack<>();
        for (int i = 0; (i < tag.length) && (tag[i] != null); i++) {
            if (isOpeningTag(tag[i]))
                S.push(tag[i]);
            else {
                if (S.isEmpty())
                    return false;
                if (!areMatchingTags(S.pop(), tag[i]))
                    return false;
            }
        }
        if (S.isEmpty())
            return true;
        return false;
    }

    public static int CAPACITY = 1000;

    public static String[] parseHTML(Scanner s) {
        String[] tag = new String[CAPACITY];
        int count = 0;
        String token;
        while (s.hasNextLine()) {
            while ((token = s.findInLine("<[^>]*>")) != null)
                tag[count++] = stripEnds(token);
            s.nextLine();
        }
        return tag;
    }

    public static void main(String[] args) throws IOException {
        if (isHTMLMatched(parseHTML(new Scanner(System.in))))
            System.out.println("The input file is a matched HTML document.");
        else
            System.out.println("The input file is not a matched HTML document.");
    }
}
