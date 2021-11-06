package org.Argos.utils;

import java.util.Random;

public class NumberGenerator {
    public int randomNumber(int size){
        Random random=new Random();
        int randomN= random.nextInt(size-1);
        return randomN;
    }
}
