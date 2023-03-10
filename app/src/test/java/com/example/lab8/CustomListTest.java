package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList mockCityList(){
        CustomList customList = new CustomList(null, new ArrayList<City>());
        customList.addCity(mockCity());
        return customList;
    }
    private City mockCity(){
        City city = new City("Toronto", "Ontario");
        return city;
    }
    @Test
    public void testGetCount(){
        CustomList customList = mockCityList();
        assertEquals(1, customList.getCount());
    }

}
