package hello;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Teams {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long team_id;
    @Column
    private String names;


    @ManyToOne
   @JoinColumn(name = "capitan_id")
   private Players capitan;



    @OneToMany(mappedBy = "teams")
    private List<Players> players;

    public List<Players> getPlayers() {
        return players;
    }
    public Players getCapitan() {
        return capitan;
    }

    public void setCapitan(Players capitan) {
        this.capitan = capitan;
    }

    public Long getTeam_id() {
        return team_id;
    }

    public String getNames() {
        return names;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public void setNames(String names) {
        this.names = names;
    }



    public Teams(String names, Players id_capitans) {
        this.names = names;
    }

    @Override
    public String toString() {
        String format = String.format(
                "Team[ names ='%s']");
        return format;
    }

}
