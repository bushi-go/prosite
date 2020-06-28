package fr.dev.rgoussu.prositeapi.user.model.values;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;

import fr.dev.rgoussu.prositeapi.core.constraints.annotations.PhoneNumber;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Embeddable
public class UserContact {
    @Email
    @Column(name = "contact_email")
    private String email;
    @PhoneNumber
    private String phoneNumber;
}