package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> list;
    public ArrayList<City> MockCityList(){
        ArrayList<City> cities = new ArrayList<>();
        return  cities;
    }
    @Test
    public void testAddCity(){
        list = MockCityList();
        City city = new City("Edmonton","AB");
        list.add(city);
        assertEquals(1,list.size());
    }
    @Test
    public void testHasCity(){
        list = MockCityList();
        City city = new City("Edmonton","AB");
        list.add(city);
        assertEquals(true,list.contains(city));
    }


}
