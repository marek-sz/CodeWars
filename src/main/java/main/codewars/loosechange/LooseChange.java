package main.codewars.loosechange;

import java.util.HashMap;

public class LooseChange {
    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        int quarters = 0, dimes = 0, nickles = 0, pennies = 0;
        if (cent >= 25) {
            quarters = cent / 25;
            cent = cent % 25;
        }
        if (cent >= 10) {
            dimes = cent / 10;
            cent = cent % 10;
        }
        if (cent >= 5) {
            nickles = cent / 5;
            cent = cent % 5;
        }
        if (cent >= 1) {
            pennies = cent / 1;
        }

        map.put("Pennies", pennies);
        map.put("Nickels", nickles);
        map.put("Dimes", dimes);
        map.put("Quarters", quarters);
        return map;
    }
}
