package gg.ovome.backend.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Table(name="matchup")
@Entity(name="matchup")
@Data
public class Matchup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch= FetchType.EAGER)
    @JoinColumn
    private Game game;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="id", nullable = false)
    private User user1;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="id", nullable = false)
    private User user2;

    private Instant start;
    private long duration;

}
