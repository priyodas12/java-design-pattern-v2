package io.priyotech.design.creational.Builder;

import java.time.LocalDate;
import java.time.Period;

public class UserDtoBuilderImpl implements UserDtoBuilder{

    private String firstName;
    private String lastName;
    private Integer age;
    private String adrs;

    private UserWebDto userWebDto;

    @Override
    public UserDtoBuilder withFirstName(String fName) {
        firstName=fName;
        return this;
    }

    @Override
    public UserDtoBuilder withLastName(String lName) {
        lastName=lName;
        return this;
    }

    @Override
    public UserDtoBuilder withBirthDay(LocalDate date) {
        Period ageInYears=Period.between(date,LocalDate.now());
        age=ageInYears.getYears();
        return this;
    }

    @Override
    public UserDtoBuilder withAddress(Address address) {
        adrs=(new StringBuilder().append(address.getHomeNumber())
                .append(",")
                .append(address.getStreetName())
                .append(",")
                .append(address.getCity())
                .append(",")
                .append(address.getPinCode()))
                .toString();
        return this;
    }

    @Override
    public UserDto build() {
        userWebDto=new UserWebDto(firstName+"_"+lastName,adrs,age);
        return userWebDto;
    }

    @Override
    public UserDto getUserDto() {
        return userWebDto;
    }
}
