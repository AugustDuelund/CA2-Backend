package dtos;

public class NationalizeDTO {
    private String Name;
    private String[] country;
    private String probability;

    public NationalizeDTO(){

    }

    public NationalizeDTO(String name, String[] country, String probability) {
        Name = name;
        this.country = country;
        this.probability = probability;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String[] getCountry() {
        return country;
    }

    public void setCountry(String[] country) {
        this.country = country;
    }

    public String getProbability() {
        return probability;
    }

    public void setProbability(String probability) {
        this.probability = probability;
    }
}
