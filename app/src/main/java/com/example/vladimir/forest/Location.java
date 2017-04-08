package com.example.vladimir.forest;
import java.util.ArrayList;

enum TypeLocations{
    Forest,
    Lake,
    Field,
    Swamp,
    Stream
}

public class Location {

    String LocationName = "";
    TypeLocations typeLocation ;


    public Location(String name, String type){
        LocationName = name;
        typeLocation = TypeLocations.valueOf(type);

    }

    public TypeItems getFor(){
        int i;
        TypeItems item = TypeItems.Ingrid;




        return item;
    }


}
