package com.company;

public class int findHorseSpace(String name) {
    for (int i = 0; i < this.spaces.length; i++)
    {
        if (this.spaces[i] != null && name.equals(this.spaces[i].getName()))
        {
            return i;
        }
    }
}
