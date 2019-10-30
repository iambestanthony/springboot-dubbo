package com.jay.algorithm.stackAndQueue.tesMain.testMain;

import com.jay.algorithm.stackAndQueue.DogCatQueue;
import com.jay.algorithm.stackAndQueue.entity.Cat;
import com.jay.algorithm.stackAndQueue.entity.Dog;
import com.jay.algorithm.stackAndQueue.entity.Pet;
import org.xml.sax.ext.Locator2;

import java.util.Stack;
import java.util.stream.Stream;

/**
 * Created by JayJ on 2019/10/28.
 **/
public class TEST111 {
    public static void main(String[] args) {
//        DogCatQueue dogCatQueue = new DogCatQueue();
//        Dog dog1 = new Dog("dog");
//        Cat cat1 = new Cat("cat");
//        Dog dog2 = new Dog("dog");
//        Cat cat2 = new Cat("cat");
//        dogCatQueue.add(dog1);
//        dogCatQueue.add(dog2);
//        dogCatQueue.add(cat1);
//        dogCatQueue.add(cat2);
//        //Pet pet = dogCatQueue.pollAll();
//        while (!dogCatQueue.isEmpty()) {
//            System.out.println(dogCatQueue.pollAll().getType());
//        }
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        sortStackBystack(stack);
        while (!stack.isEmpty()) {

        }
        Stream.of(stack).forEach(i -> System.out.print(i));
    }

    public static void sortStackBystack(Stack<Integer> stack) {
        Stack<Integer> sortStack = new Stack<>();
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            if (pop <= sortStack.peek()) {
                sortStack.push(pop);
            } else {
                while (!sortStack.isEmpty() && sortStack.peek() < pop) {
                    stack.push(sortStack.pop());
                }
            }
        }
    }

}
