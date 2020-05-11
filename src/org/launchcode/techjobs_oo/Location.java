package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField{




    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

public Location(String valueIn){
      super(valueIn);

}
    // Custom toString, equals, and hashCode methods:


    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

}
