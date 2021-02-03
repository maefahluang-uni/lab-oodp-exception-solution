package lab.servlet.parolee.domain;

import java.time.LocalDate;

/**
 * Class to represent a Parolee.
 * <p>
 * A Parolee is simply represented by a unique id, a name, gender and date of birth.
 */
public class Parolee {
    private long id;
    private String lastName;
    private String firstName;
    private Gender gender;
    private LocalDate dateOfBirth;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}