package gg.ovome.backend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rule")
@Data
public class Rule {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String name;
    private boolean verifable;
}
