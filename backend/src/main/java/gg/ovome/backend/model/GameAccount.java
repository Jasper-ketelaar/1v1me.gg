package gg.ovome.backend.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="game_account")
@Entity(name="game_account")
@Setter
@Getter
public class GameAccount{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private Game game;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName= "id")
    private User user;

    private String name;


}
