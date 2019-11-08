package proj3.newsletter.Models;

import javax.persistence.*;

@Entity
@Table(name = "newsletter")
public class Newsletter {
    // unique email
    @Id
    @Column(unique = true)
    private String email;

    // first name
    @Column
    private String firstName;

    // last name
    @Column
    private String lastName;

    // getters and setters

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
