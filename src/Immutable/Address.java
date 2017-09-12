package Immutable;

public class Address implements Cloneable{

    private String city;
    private String Country;
    private String airport;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public Object clone()
    {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            //This should not happen, since this class is Cloneable.
            throw new InternalError();
        }
    }
}
