package com.raptors.dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.net.URI;

import static org.apache.commons.lang3.Validate.notBlank;
import static org.apache.commons.lang3.Validate.notNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class InstanceRequest implements Validated {

    private String name;

    private URI uri;

    private String login;

    private String password;

    @Override
    public void validate() {
        notBlank(name, "Invalid name format");
        notNull(uri, "Invalid uri format");
        notBlank(login, "Invalid login format");
        notBlank(password, "Invalid password format");
    }
}