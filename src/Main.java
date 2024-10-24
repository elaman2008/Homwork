import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Country country = new Country("Kyrgyzstan", 8, 1970, "Kyrgyz");
        Country country1 = new Country("Russia", 154000, 456000, "Russian");
        Country country2 = new Country("Kazakhstan", 23, 235, "Kazakh");

        System.out.println(country + "\n" + country1 + "\n" + country2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Country[] countries = {country, country1,country2};
//        Country[] countries1 = new Country[]{country,country1,country2};
//        Country[] countries3 = new Country[3];
//        countries3[0] = country;
//        countries3[1] = country1;
//        countries3[2] = country2;
        System.out.println("Country with max square : " + Country.countryWithMaxSquare(countries));


    }
}



