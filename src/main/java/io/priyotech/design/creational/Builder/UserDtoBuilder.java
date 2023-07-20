package io.priyotech.design.creational.Builder;

import java.time.LocalDate;

public interface UserDtoBuilder {

    UserDtoBuilder withFirstName(String fName);
    UserDtoBuilder withLastName(String lName);
    UserDtoBuilder withBirthDay(LocalDate date);
    UserDtoBuilder withAddress(Address address);
    /**Methods to "assemble final product*/
    UserDto build();
    /**optional Method to fetch already build product*/
    UserDto getUserDto();
}
