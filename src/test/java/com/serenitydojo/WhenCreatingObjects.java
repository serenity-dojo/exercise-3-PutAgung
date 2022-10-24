package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);
        fido.makeNoise();
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }
    @Test
    public void creating_hamster(){
        Hamster squezze = new Hamster("squezze","wheels",2);
        Assert.assertEquals(squezze.getName(),"squezze");
        Assert.assertEquals(squezze.getFavoriteGame(),"wheels");
        Assert.assertEquals(squezze.getAge(),2);
    }
}
