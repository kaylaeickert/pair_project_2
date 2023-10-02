package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List<Pet> pets = new ArrayList<>();
    private double balanceDue = 0;

    public Customer(String firstName, String lastName, String phoneNumber){
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, "");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        for (Map.Entry<String, Double> service : servicesRendered.entrySet()){
            balanceDue = balanceDue + service.getValue();
        }
        return balanceDue;
    }
}
