package io.priyotech.design.creational.Builder;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        UserDtoBuilder userDtoBuilder=new UserDtoBuilderImpl();
        Address address=new Address();
        address.setHomeNumber("#1");
        address.setStreetName("ABC Road");
        address.setCity("Kolkata");
        address.setPinCode("717272");

        userDtoBuilder.withFirstName("priyo")
                .withLastName("das")
                .withAddress(address)
                .withBirthDay(LocalDate.of(1991,06,06)).build();

        UserWebDto userDto= (UserWebDto) userDtoBuilder.getUserDto();
        System.out.println(userDto);
    }
}
