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
<<<<<<< HEAD
        Assert.assertEquals(vaccinations, result);
=======
        Assert.assertEquals(("Rabies, Distemper, Parvo"), result);
    }
    @Test
    public void list_no_vaccination_should_return_empty_string(){
        List<String> vaccinations = new ArrayList<>();
        String result = pet.listVaccinations(vaccinations);
        Assert.assertEquals("",result);
>>>>>>> b86f6e13bdc944389fea57c46c51d025f9828826
    }
}

