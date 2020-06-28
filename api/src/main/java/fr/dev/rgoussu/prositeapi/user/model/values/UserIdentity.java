package fr.dev.rgoussu.prositeapi.user.model.values;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Embeddable
public class UserIdentity {
    private String firstName;
    private String lastName;
    @Email
    @Column(name = "login")
    private String email;
}