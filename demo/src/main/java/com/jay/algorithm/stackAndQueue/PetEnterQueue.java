package com.jay.algorithm.stackAndQueue;

import com.jay.algorithm.stackAndQueue.entity.Pet;

/**
 * Created by JayJ on 2019/10/28.
 **/
public class PetEnterQueue {
    private Pet pet;
    private long count ;

    public PetEnterQueue(Pet pet,long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public long getCount() {
        return count;
    }

    public String getPetType() {
        return this.pet.getType();
    }
}
