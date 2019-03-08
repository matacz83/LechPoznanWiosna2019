        package models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kadra {

    @SerializedName("imie")
    @Expose
    private String imie;
    @SerializedName("nazwisko")
    @Expose
    private String nazwisko;
    @SerializedName("kraj")
    @Expose
    private String kraj;
    @SerializedName("rok")
    @Expose
    private Integer rok;
    @SerializedName("exclub")
    @Expose
    private String exclub;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public Integer getRok() {
        return rok;
    }

    public void setRok(Integer rok) {
        this.rok = rok;
    }

    public String getExclub() {
        return exclub;
    }

    public void setExclub(String exclub) {
        this.exclub = exclub;
    }

}