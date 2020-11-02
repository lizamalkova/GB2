package com.company;

public class RunningTrack implements Mission{
    private double distance;

    public RunningTrack(double distance){
        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }

    @Override
        public double getHeight() {
        return 0;
    }

    public void mission(Player player){
        if (player.isAvailableAction(player.getMaxRunDistance(),distance)){
            System.out.println(player.getName() + " пробежал(а) дистанцию: " + distance + " м.");
        } else {
            System.out.println(player.getName() + " непробежал(а) дистанцию: " + distance + " м.");
        }
    }
}
