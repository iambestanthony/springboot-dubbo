package com.jay.algorithm.stackAndQueue;

import com.jay.algorithm.stackAndQueue.entity.Pet;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by JayJ on 2019/10/28.
 用户可以调用add方法将cat类或者dog类的实例放入队列中；
 用户可以调用pollAll方法，将队列中所有的实例按照队列的先后顺序依次弹出；
 用户可以调用pollDog方法，将队列中dog类的实例按照队列的先后顺序依次弹出；
 用户可以调用pollCat方法，将队列中cat类的实例按照队列的先后顺序依次弹出；
 用户可以调用isEmpty方法，检查队列中是否还有dog和cat的实例；
 用户可以调用isDogEmpty方法，检查队列中是否还有do的实例；
 用户可以调用isCatEmpty方法，检查队列中是否还有cat的实例。
 **/
public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;

    public DogCatQueue() {
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.catQ = new LinkedList<PetEnterQueue>();
    }

    public void add(Pet pet) {
        if ("dog".equalsIgnoreCase(pet.getType())) {
            dogQ.add(new PetEnterQueue(pet,System.currentTimeMillis()));
        } else if ("cat".equalsIgnoreCase(pet.getType())) {
            catQ.add(new PetEnterQueue(pet, System.currentTimeMillis()));
        } else {
            throw new RuntimeException("err, there is not this type");
        }

    }

    public Pet pollAll() {
        if(!catQ.isEmpty() && !dogQ.isEmpty()) {
            if(catQ.peek().getCount() < dogQ.peek().getCount()) {
                return catQ.poll().getPet();
            }
            else {
                return dogQ.poll().getPet();
            }
        }
        else if(!catQ.isEmpty()) {
            return catQ.poll().getPet();
        }
        else if(!dogQ.isEmpty()) {
            return dogQ.poll().getPet();
        }
        else {
            throw new RuntimeException("Queue is Empty!");
        }
    }

    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

}
