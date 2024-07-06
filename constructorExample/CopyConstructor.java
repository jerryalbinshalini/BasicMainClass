package com.constructorExample;

public class CopyConstructor {
    public static void main(String[] args) {
        Player orginalPlayer=new Player("messi",10,789);
        orginalPlayer.display();
        Player duplicatePlayer=new Player(orginalPlayer);
        duplicatePlayer.display();

    }
}
class Player{
    private String name;
    private int jerseyNo;
    private int goals;

    Player(String name,int jerseyNo,int goals){

        this.name=name;
        this.jerseyNo=jerseyNo;
        this.goals=goals;
    }
    Player(Player player){
        name=player.name;
        jerseyNo=player.jerseyNo;
        goals=player.goals;

    }
    public void display(){
        System.out.println("Name of the player: " +name+ "," +
                "Jersey Number: " +jerseyNo+ "," +
                "Career Goals: " +goals);
    }
}