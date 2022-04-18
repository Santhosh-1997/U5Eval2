package com.masai.problem4;

//factory class (also open for extension)
public class Currency {

    public static Size getSize(int denom){

        if(denom == 10)
            return new Ten();

        if(denom == 100)
            return new Hundred();

        if(denom == 1000)
            return new Thousand();

        return null;

    }

}
