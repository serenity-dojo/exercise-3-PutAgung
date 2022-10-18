package com.serenitydojo;

public class Dog {
    public String Name ="";
    public String FavoriteToy = "";
    public int Age;

    public Dog(String Name, String FavoriteToy, int Age) {
        this.Name = Name;
        this.FavoriteToy = FavoriteToy;
        this.Age = Age;
    }

    public void setName(){
        this.Name = Name;
    }
    public void setFavoriteToy(){
        this.FavoriteToy = FavoriteToy;
    }
    public void setAge(){
        this.Age = Age;
    }

    public String getName(){
        return this.Name;
    }
    public String getFavoriteToy(){
        return this.FavoriteToy;
    }
    public int getAge(){
        return this.Age;
    }
}
