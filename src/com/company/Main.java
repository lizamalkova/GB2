package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Player human1 = new Human("Лена", 50, 1.5);
        Player human2 = new Human("Денис", 120, 2);
        Player cat1 = new Cat("Барсик", 20, 2);
        Player cat2 = new Cat("Мася", 10, 1);
        Player robot1 = new Robot("R123543", 50, 0.5);

        Player[] players = {human1, human2, cat1, cat2, robot1};

        Mission runningTrack1 = new RunningTrack(5);
        Mission runningTrack2 = new RunningTrack(40);
        Mission wall1 = new Wall(1);
        Mission wall2 = new Wall(1.5);

        Mission[] missions = {runningTrack1, wall1, runningTrack2,   wall2};

        for (Player player : players){
            for (int i = 0; i < missions.length; i++) {

                if (player.isAvailableAction(player.getMaxRunDistance(), missions[i].getDistance()) &&
                        player.isAvailableAction(player.getMaxJumpHeight(), missions[i].getHeight()))
                {
                    missions[i].mission(player);
                }
                else {
                    System.out.println(player.getName() + " сошёл(а) с дистанции!");
                    break;
                }
            }
        }

    }
}


