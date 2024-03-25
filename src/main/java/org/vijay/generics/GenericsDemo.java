package org.vijay.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GenericClass <T extends Number> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void tryArray (List<? super Integer> tArrayList) {
        tArrayList.stream().forEach(System.out::println);
    }
}

public class GenericsDemo {

    public static void main(String[] args) {

        GenericClass<Integer> gc = new GenericClass<>();
        gc.setValue(10);

//        List<Integer> intList = new ArrayList<>();
        List<Integer> intList = Arrays.asList(1, 2, 3);

        gc.tryArray(intList);
    }
}
