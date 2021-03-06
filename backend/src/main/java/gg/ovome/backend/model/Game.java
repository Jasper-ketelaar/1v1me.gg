package gg.ovome.backend.model;


import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Table(name="game")
@Entity(name="game")
@Data
public class Game {

    @Id
    @GeneratedValue
    private int id;
    //private static final long serialVersionUID = 1L;


//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;

    private String name;

}