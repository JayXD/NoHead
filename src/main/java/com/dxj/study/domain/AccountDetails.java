package com.dxj.study.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class AccountDetails implements Serializable {
    @Email
    @NotNull(message = "can not be empty")
    private String email;
    @NotNull(message = "can not be empty")
   @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;
    @NotNull(message = "can not be empty")
    private String firstName;
    @NotNull(message = "can not be empty")
    private String lastName;
}
