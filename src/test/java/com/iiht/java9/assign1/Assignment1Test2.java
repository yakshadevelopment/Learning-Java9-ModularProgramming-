package com.iiht.java9.assign1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.iiht.java9.assign2.Person;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Assignment1Test2 {

    @DisplayName("Test Assignment2Test")
    @Test
    void testGet() {

    	Person person = new Person();
        long salary = person.getSalary();
		
		 assertEquals(salary, 1000L);
		
		
       
    }

}