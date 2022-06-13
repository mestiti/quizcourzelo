package com.courzelo.quiz_skills.quiz.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

@Document
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 65981149772133526L;

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private Long id;

    private String providerUserId;

    private String email;

    private String displayName;

    public User(Long id, String providerUserId, String email, String displayName) {
        super();
        this.id = id;
        this.providerUserId = providerUserId;
        this.email = email;
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", providerUserId='" + providerUserId + '\'' +
                ", email='" + email + '\'' +
                ", displayName='" + displayName + '\'' +
                '}';
    }

    public User() {
        super();
    }


}
