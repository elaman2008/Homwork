import java.lang.reflect.Method;




public class Country {
    private String name;
    private int population;
    private int square;
    private String language;

    public Country() {
    }

    public Country(String name, int population, int square, String language) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
     this.   population = population;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
      this.  language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "Name ='" + name + '\'' +
                ", Population=" + population +
                ", Square=" + square +
                ", Language='" + language + '\'' +
                '}';
    }

    public static Country countryWithMaxSquare(Country[] countries ){
        Country countrySquare = countries[0];

        for (Country country : countries) {

            if(countrySquare.square < country.square){
                countrySquare = country;
            }
//        if(countries[1].square < countries[2].square){
//            countrySquare = countries[2];
//        }
        }
        return countrySquare;
    }


}





//Country деген класс тузунуз .
//
//Анын поляларын бериниз.
//
//        Аты , калкы, аянты , тили ушундай полялары болсун .
//
//Маанилерин конструктор аркылуу бериниз. 3 объект тузунуз . Ошондой эле 1 static метод кошунуз.
//
//Mетод параметирине Country-нин массивин алып бизге аянты боюнча эн чон олкону таап берсин.