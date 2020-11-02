package com.company;

public class Wall implements Mission{
    private double height;
    private boolean success = true;

    public Wall(double height){
        this.height = height;
    }

    @Override
    public double getDistance() {
        return 0;
    }

    public double getHeight(){
        return height;
    }

    public boolean getSuccess(){
        return success;
    }

    public void mission(Player player){
        if (player.isAvailableAction(player.getMaxJumpHeight(),height)){
            success = true;
            System.out.println(player.getName() + " перепрыгнул(а) высоту: " + height + " м.");
        } else {
           success = false;
            System.out.println(player.getName() + " неперепрыгнул(а) высоту: " + height + " м.");
        }
    }
}
