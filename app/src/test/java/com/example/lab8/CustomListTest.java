package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    public CustomList MockCityList(){
        ArrayList<City> cities = new ArrayList<>();
        return list;
    }
    @Test
    public void addCityTest(){
        list=MockCityList();
        int size = list.getCount();
        list.addCity(new City("Edmonton","AB"));
        assertEquals(size+1,list.getCount());
    }
<<<<<<< Updated upstream

=======
    @Test
    public void getCountTest(){
        list=MockCityList();
        assertEquals(0,list.getCount());
        list.addCity(new City("Edmonton","AB"));
        assertEquals(1,list.getCount());
    }
    @Test
    public void hasCityTest(){
        list=MockCityList();
        list.addCity(new City("Edmonton","AB"));
        assertEquals(true,list.hasCity(new City("Calgary","AB")));
    }
>>>>>>> Stashed changes
}
