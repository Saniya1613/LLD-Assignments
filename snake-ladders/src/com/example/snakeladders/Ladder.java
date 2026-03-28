package com.example.snakeladders;

public class Ladder{
    int startPosition;
    int endPosition;

    public Ladder ( int startPosition, int endPosition){
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStart(){
        return startPosition;
    }

    public  int getEnd(){
        return endPosition;
    }
}