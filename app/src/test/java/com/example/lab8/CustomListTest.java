package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityDataList= new ArrayList<>();
    @Test
    public void addCityTest(){
        CustomList customList = new CustomList(null,cityDataList);
        City city = new City("Edmonton","AB");
        customList.addCity(city);
        assertEquals(1,customList.getCount());
    }
    @Test
    public void getCountTest(){
        CustomList customList = new CustomList(null,cityDataList);
        City city = new City("Edmonton","AB");
        customList.addCity(city);
        assertEquals(1,customList.getCount());
    }

}
