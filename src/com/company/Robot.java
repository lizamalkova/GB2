package com.company;

public class Robot implements Player{
    private String name;
    private double maxRunDistance;
    private double maxJumpHeight;

    public Robot(String name,double maxRunDistance, double maxJumpHeight){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(){
        System.out.println(name + " бежит!");
    }

    public void jump(){
        System.out.println(name + " прыгает!");
    }

    public String getName(){
        return name;
    }

    public double getMaxRunDistance() {
        return maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public boolean isAvailableAction(double required, double expected)
    {
        return required >= expected;
    }


}
