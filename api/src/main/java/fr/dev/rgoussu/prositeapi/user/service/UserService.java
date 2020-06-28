package fr.dev.rgoussu.prositeapi.user.service;

import fr.dev.rgoussu.prositeapi.user.model.dto.UserDto;

public interface UserService {
    public UserDto getUserById(Long id);
}