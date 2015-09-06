package model;

/**
 * Project: hobbyapp
 * Created by simamuec on 06.09.2015.
 */
public class Address {

    private String street;
    private String city;
    private String postcode;
    private Country country;

    protected Address(){

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
