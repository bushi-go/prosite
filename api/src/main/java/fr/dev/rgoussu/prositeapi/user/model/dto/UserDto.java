package fr.dev.rgoussu.prositeapi.user.model.dto;

import fr.dev.rgoussu.prositeapi.user.model.values.UserContact;
import fr.dev.rgoussu.prositeapi.user.model.values.UserIdentity;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
    private Long id;
    private UserIdentity identity;
    private UserContact contact;
}