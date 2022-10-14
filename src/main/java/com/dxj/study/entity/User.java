package com.dxj.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@DynamicUpdate
@Getter
public class User {
    @Id
    @GeneratedValue(generator = "jpa-uuid")
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @Column(nullable = false, unique = true, columnDefinition = "VARCHAR(50)")
    private String uuid;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Date accountCreated;
    private Date accountUpdated;

    public User assignPassword(String password) {
        this.password = password;
        return this;
    }

    public User assignFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User assignLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User assignAccountCreated(Date accountCreated) {
        this.accountCreated = accountCreated;
        return this;
    }

    public User assignAccountUpdated(Date accountUpdated) {
        this.accountUpdated = accountUpdated;
        return this;
    }
}
