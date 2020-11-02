package com.company;

public interface Player {

    void run();
    void jump();
    String getName();
    double getMaxRunDistance();
    double getMaxJumpHeight();

    boolean isAvailableAction(double required, double expected );

}
