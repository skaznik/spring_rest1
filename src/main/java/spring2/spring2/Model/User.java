package spring2.spring2.Model;

import java.util.ArrayList;
import java.util.List;

public class User {
  //do użytku w czwartym kontrolerze
    private String name;
    private String nazwisko;
    private int wiek;
    private List<String> uprawnienia;


    public List<String> getUprawnienia() {
        return uprawnienia;
    }

    public void addUprawnienia(String uprawnienia) {
        this.uprawnienia.add(uprawnienia);
    }

    public void removeUprawnienia(String uprawnienia) {
        this.uprawnienia.remove(uprawnienia);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public User(String name, String nazwisko, int wiek) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.uprawnienia = new ArrayList<>();
    }
}
