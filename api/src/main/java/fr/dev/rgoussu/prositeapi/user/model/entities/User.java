package fr.dev.rgoussu.prositeapi.user.model.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.usertype.UserType;

import fr.dev.rgoussu.prositeapi.user.model.values.UserContact;
import fr.dev.rgoussu.prositeapi.user.model.values.UserIdentity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type", discriminatorType = DiscriminatorType.STRING)
public class User {
    @Id
    @Column(name = "usr_id", nullable = false)
    private Long id;
    @Column(name="user_type")
    private UserType type;
    @Embedded
    private UserIdentity identity;
    @Embedded
    private UserContact contact;

}