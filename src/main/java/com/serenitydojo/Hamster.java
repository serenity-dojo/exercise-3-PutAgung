package com.serenitydojo;

public class Hamster extends Pets {
    private String favoriteGame ="";
    public Hamster(String name, String favoriteGame, int age){
        super(name,age);
        this.favoriteGame = favoriteGame;
    }
    public String getFavoriteGame(){
        this.favoriteGame = favoriteGame;
        return this.favoriteGame;
    }
}
