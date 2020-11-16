package lesson09.customerProject;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Vodka", 40, 40, 1.00);
        Ingredient rom = new Ingredient("Rum", 40, 40, 1.00);
        Ingredient tequi = new Ingredient("Tequila", 40, 40, 1.00);
        Ingredient martini = new Ingredient("Martini", 40, 15, 0.5);
        Ingredient cola = new Ingredient("Cola", 200, 0, 0.5);
        Ingredient energiser = new Ingredient("RedBull", 200, 0, 1.00);
        Ingredient gin = new Ingredient("Gin", 40, 40, 1.00);
        Ingredient bitter = new Ingredient("Campari", 40, 25, 0.5);
        Ingredient tripleSec = new Ingredient("Cointreau", 40, 25, 1.00);
        Ingredient orange = new Ingredient("Orange Juice", 150, 0, 0.4);
        Ingredient passion = new Ingredient("Passionfruit Juice", 150, 0, 0.4);
        Ingredient ananas = new Ingredient("Pineapple Juice", 150, 0, 0.4);
        Ingredient grenadine = new Ingredient("Grenadine", 30, 0, 0.1);
        Ingredient orgeat = new Ingredient("Orgeat", 30, 0, 0.1);
        Ingredient lJuice = new Ingredient("Lime Juice", 30, 0, 0.2);


        Cocktail disko = new Cocktail("Disko", cola, energiser);
        Cocktail negroni = new Cocktail("Negroni", gin, martini, bitter);
        Cocktail lIsland = new Cocktail("LongIsland IceTea", gin, rom, vodka, tripleSec, lJuice, tequi, cola);
        Cocktail tSunrise = new Cocktail("TequilaSunrise", tequi, grenadine, orange);
        Cocktail cLibre = new Cocktail("Cuba Libre", rom, cola);
        Cocktail vEnergy = new Cocktail("Vodka RedBull", vodka, energiser);
        Cocktail fPunch = new Cocktail("Fruit Punch", orange, passion, ananas, grenadine);
        Cocktail vMaiTai = new Cocktail("Virgin MaiTai", orange, ananas, orgeat, lJuice);
        Cocktail tropic = new Cocktail("Tropic Thunder", vodka, tripleSec, passion, grenadine, lJuice);

        Drinks[] menu = new Drinks[]{cola, energiser, orange, passion, ananas, disko, negroni,
                lIsland, tSunrise, cLibre, vEnergy, fPunch, vMaiTai, tropic};
        System.out.println(Arrays.toString(menu));
    }
}
