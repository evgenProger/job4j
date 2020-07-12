package ru.job4j.streamApi.touristCompany;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    public String getCity() {
        return city;
    }
}

