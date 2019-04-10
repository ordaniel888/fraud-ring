package Model.RequestPOJOS;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PotentialFraudRequest {

    @JsonProperty(value = "browser_ip", required = true)
    private BrowserIP browser_ip;

    @JsonProperty(value = "city", required = true)
    private City city;

    @JsonProperty(value = "country", required = true)
    private Country country;

    @JsonProperty(value = "email", required = true)
    private Email email;

    @JsonProperty(value = "first_name", required = true)
    private String first_name;

    @JsonProperty(value = "id", required = true)
    private int id;

    @JsonProperty(value = "products", required = true)
    private List<Product> products;

    @JsonProperty(value = "total_price", required = true)
    private double total_price;

    @JsonCreator
    public PotentialFraudRequest(@JsonProperty(value = "browser_ip", required = true) String browser_ip,
                                 @JsonProperty(value = "city", required = true) String city,
                                 @JsonProperty(value = "country", required = true) String country,
                                 @JsonProperty(value = "email", required = true) String email,
                                 @JsonProperty(value = "first_name", required = true) String first_name,
                                 @JsonProperty(value = "id", required = true) int id,
                                 @JsonProperty(value = "products", required = true) List<Product> products,
                                 @JsonProperty(value = "total_price", required = true) double total_price) {
        this.browser_ip = new BrowserIP(browser_ip);
        this.city = new City(city);
        this.country = new Country(country);
        this.email = new Email(email);
        this.first_name = first_name;
        this.id = id;
        this.products = products;
        this.total_price = total_price;
    }

    public static PotentialFraudRequest fromFile(String path) throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(new File("").getAbsolutePath() + path));
        String strJson = new String(encoded, Charset.defaultCharset());
        return new ObjectMapper().readValue(strJson, PotentialFraudRequest.class);
    }

    public BrowserIP getBrowser_ip() {
        return browser_ip;
    }

    public void setBrowser_ip(BrowserIP browser_ip) {
        this.browser_ip = browser_ip;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
}
