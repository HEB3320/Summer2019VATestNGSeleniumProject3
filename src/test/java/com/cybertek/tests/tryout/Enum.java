package com.cybertek.tests.tryout;

public class Enum {

    public enum Directions {
        EAST,
        WEST,
        NORTH,
        SOUTH
    }

    public static void main(String[] args) {


        Directions dir = Directions.NORTH;

        if(dir == Directions.EAST) {
            System.out.println("Direction: East");
        }  if(dir == Directions.WEST) {
            System.out.println("Direction: West");
        }  if(dir == Directions.NORTH) {
            System.out.println("Direction: North");
        } else {
            System.out.println("Direction: South");
        }


/*
You should always use enums when a variable (especially a method parameter)
can only take one out of a small set of possible values.
Examples would be things like type constants (contract status: “permanent”, “temp”, “apprentice”),
or flags (“execute now”, “defer execution”).

If you use enums instead of integers (or String codes),
you increase compile-time checking and avoid errors from passing in invalid constants,
and you document which values are legal to use.
 */




    }
}