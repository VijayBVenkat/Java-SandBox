package org.vijay.generics;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Stack;

@NoArgsConstructor
@AllArgsConstructor
class GenericStack <T> {
    T stackVal;
    Stack<T> valStack = new Stack<T>();
    public void push (T val) {
        valStack.push(val);
        System.out.println("Capacity after push: " + valStack.capacity());
    }
    public T pop () {
        T val = valStack.pop();
        System.out.println("Capacity after pop: " + valStack.capacity());
        return val;
    }
    public T peek() {
        T val = valStack.peek();
        System.out.println("Capacity after peek: " + valStack.capacity());
        return val;
    }
    public boolean isEmpty() {
        return valStack.isEmpty();
    }
}

public class Stacker<T> {

    public static void main(String[] args) {
        GenericStack<Integer> genericStack = new GenericStack<>();

        genericStack.push(10);

        // Accessing peek method
        Integer peekedValue = genericStack.peek();
        System.out.println("Peeked Val: " + peekedValue);

        // Accessing pop method
        Integer poppedValue = genericStack.pop();
        System.out.println("Popped Val: " + poppedValue);

        // Accessing isEmpty method
        boolean isEmpty = genericStack.isEmpty();
    }



}
