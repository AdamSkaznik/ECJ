package pl.com.adam.ECJ.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private int id;
    @Column(name = "userName")
    @Length(min = 5, message = "Nazwa użytkownika musi mieć co najmniej 5 znaków")
    @NotEmpty(message = "Proszę wprowadzić nazwę użytkownika")
    private String userName;
    @Column(name = "password")
    @Length(min = 5, message = "Hasło musi składać się z conajmniej 5 znaków")
    @NotEmpty(message = "Proszę wprowadzić hasło")
    private String password;
    @Column(name = "email")
    @Email(message = "Proszę wprowadzić poprawny adres e-mail")
    @NotEmpty(message = "Proszę wprowadzić adres e-mail")
    private String email;
    @Column(name = "firstName")
    @NotEmpty(message = "Proszę wprowadzić swoje imię")
    private String firstName;
    @Column(name = "lastName")
    @NotEmpty(message = "Proszę wprowadzić swoje nazwisko")
    private String lastName;
    @Column(name = "phoneNr")
    private String phoneNr;
    @Column(name = "isActive")
    private boolean isActive;

    private List<Role> roles;

}
