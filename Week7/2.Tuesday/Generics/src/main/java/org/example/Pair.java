package org.example;

public class Pair<T> {
    private T leftThing;
    private T rightThing;

    public Pair(T rightThing, T leftThing){
        this.rightThing = rightThing;
        this.leftThing = leftThing;
    }

    public T getLeftThing(){
        return this.leftThing;
    }

    public T getRightThing(){
        return this.rightThing;
    }

    public void swap(){
        T temp = leftThing;
        leftThing = rightThing;
        rightThing = temp;
    }
}
