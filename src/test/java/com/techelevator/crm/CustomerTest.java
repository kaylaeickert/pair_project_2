package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest {
    private Customer customer;

    @Before
    public void setup(){
        customer = new Customer("Becki", "Johnson", "");
    }

    @Test
    public void customer_balance_due(){
        Map<String, Double> services = new HashMap<>();
        services.put("Groom", 50.00);
        services.put("Walk", 20.00);

        double balance = customer.getBalanceDue(services);
        Assert.assertEquals(70.00, balance, .00009);

    }
}
