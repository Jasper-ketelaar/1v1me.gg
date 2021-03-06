package gg.ovome.backend.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.tuple.ValueGenerator;

import javax.persistence.*;
import java.util.HashMap;
import java.util.HashSet;


@Entity
@Table(name="user_entity")
@Setter
@Getter
@Accessors (chain = true)

public class User {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    private String id;

    private String name;
    private boolean verified;
    private String email;



}
