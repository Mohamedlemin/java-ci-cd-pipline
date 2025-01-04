package com.msservice.cicdtest.users;

import java.io.Serializable;

/**
 * DTO for {@link Job}
 */
public record UserDto(Long id, String username, String password) implements Serializable {
}