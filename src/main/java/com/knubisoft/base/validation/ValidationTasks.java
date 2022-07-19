package com.knubisoft.base.validation;

import com.knubisoft.base.validation.annotation.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Your task is validate the user with a custom annotation.
 * Image that you have been invited on a spaceship on the popular position near capitan.
 * You have several annotations which have some constraints under the classes/fields.
 * You have to write a business logic to validate your user on the correct value.
 * Also write several tests to check if you business logic works properly.
 * 1. @PrimaryKey - You can store only unique id in your database.
 * 2. @MaxLength - Max length of a string have constraint. YOu have to validate by that number.
 * 3. @ReferClass - It's a pointer on another instance which have already created.
 *      Example: User.fkUserLocationDetails with value 6 have to refer on existed UserLocationDetails.id with value 6.
 * 4. @NotNull - The field can't be null.
 * 5. @Entity - Validate you instance only if the class marked by the @Entity annotation
 * */
public interface ValidationTasks {
    /**
     * Validate your instance (p.1 - p.5)
     * */
    void validate(Object instance);
    /**
     * Builder to create User
     * */
    User buildUser();

    /**
     * Builder to create UserGeneralDetails
     * */
    UserGeneralDetails buildUserGeneralDetails();

    /**
     * Builder to create UserGeneralDetails
     * */
    UserAddressDetails buildUserAddressDetails();

    @Entity
    @Setter
    @Getter
    @EqualsAndHashCode
    class User {
        @PrimaryKey(isPrimary = true)
        private Long id;
        @MaxLength(maxLength = 7)
        @NotNull
        private String name;
        @MaxLength(maxLength = 10)
        @NotNull
        private String surname;
        private boolean isMarried;
        private Integer countOfChildren;
        private Integer countOfPets;
        @ReferClass(referClass = UserGeneralDetails.class)
        @NotNull
        private Long fkUserGeneralDetails;
    }

    @Entity
    @Setter
    @Getter
    @EqualsAndHashCode
    class UserGeneralDetails {
        @PrimaryKey(isPrimary = true)
        private Long id;
        @MaxLength(maxLength = 13)
        private String previousProfession;
        @MaxLength(maxLength = 14)
        @NotNull
        private String country;
        @MaxLength(maxLength = 15)
        private String oblast;
        @MaxLength(maxLength = 15)
        private String city;
        @ReferClass(referClass = UserAddressDetails.class)
        @NotNull
        private Long fkUserAddressDetails;
    }

    @Entity
    @Setter
    @Getter
    @EqualsAndHashCode
    class UserAddressDetails {
        @PrimaryKey(isPrimary = true)
        private Long id;
        @MaxLength(maxLength = 6)
        private String zipCode;
        @MaxLength(maxLength = 20)
        private String street;
        @MaxLength(maxLength = 7)
        private String numberOfHouse;
    }
}
