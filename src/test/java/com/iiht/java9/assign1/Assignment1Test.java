package com.iiht.java9.assign1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Assignment1Test {

    @DisplayName("Test Assignment1Test")
    @Test
    void testGet() {

		Dog myDog = new Dog();
		
		myDog.setName("Pyro");
		
		 assertEquals("Pyro", myDog.getName());
		
		myDog.beFriendly();
		myDog.play();
       
    }

}