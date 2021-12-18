import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody
        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody
        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów
        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        //stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        Student s1 = new Student();
        Student s2 = new Student();
        //stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        Pracownik p1 = new Pracownik();
        Pracownik p2 = new Pracownik();
        // stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        Kierownik k1 = new Kierownik();
        Kierownik k2 = new Kierownik();
        //objekty student
        s1.setName("Matusz Mydlarz");
        s1.setYear(25);
        s1.setCountry("Polska");
        s1.setCity("Elbąg");
        s1.setUniver("WSB");

        s2.setName("Jan Nowak");
        s2.setYear(33);
        s2.setCountry("Kanada");
        s2.setCity("Toronto");
        s2.setUniver(" University of Toronto");

        //objekty pracownik
        p1.setCountry("Hiszpania");
        p1.setCity("Madrid");
        p1.setExpireance(2.5);
        p1.setRank("Senior");
        p1.setSalary(35000);

        p2.setCountry("Białoruś");
        p2.setCity("Minsk");
        p2.setExpireance(4.5);
        p2.setRank("Senior");
        p2.setSalary(39000);

        // stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        k1.setCountry("Anglia");
        k1.setCity("Londyn");
        k1.setExpireance(7);
        k1.setRank("Manager");
        k1.setSalary(40000);

        k2.setCountry("Wegry");
        k2.setCity("Budapeszt");
        k2.setExpireance(10);
        k2.setRank("Manager");
        k2.setSalary(50000);
        // d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        //e) dodać do niej objekty typu Kierownik i Pracownik
        List<PracownikI> listaPracownikow = new ArrayList<>();
        listaPracownikow.add(k1);
        listaPracownikow.add(k2);
        listaPracownikow.add(p1);
        listaPracownikow.add(p2);
        //wypisać pętlą metody toString() wszystkich elementów listy
        for (Object people : listaPracownikow) {
            System.out.println(people.toString());
        }

        //wypisać metody toString() wszystkich objektów
        System.out.println();

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println();

        System.out.println(p1.toString());
        System.out.println(p2.toString());


    }
}