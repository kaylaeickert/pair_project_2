package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTest {
    private Pet pet;

    @Before
    public void setup(){
        pet = new Pet();
    }

    @Test
    public void list_Vaccinations_should_return_string(){
        List<String> vaccinations = new ArrayList<>();
        vaccinations.add("Rabies");
        vaccinations.add("Distemper");
        vaccinations.add("Parvo");

        String result = pet.listVaccinations(vaccinations);
        Assert.assertEquals(("Rabies", "Distemper", "Parvo"), result);
    }
}
