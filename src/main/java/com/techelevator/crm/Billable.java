package com.techelevator.crm;

import java.util.HashMap;
import java.util.Map;

public interface Billable {
    int balanceDue = 0;
    double getBalanceDue(Map<String,Double> servicesRendered);
}
