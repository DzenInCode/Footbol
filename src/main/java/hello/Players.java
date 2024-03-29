package hello;
import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
public class Players {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long player;
    @Column
    private  String name;
    @Column
    private  String last_name;
    @Column
    private Date birthday;
    @Column
    private  String position;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private  Teams team;


    public Players(String name, String last_name, Date birthday, String position, Teams team) {
        this.name = name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.position = position;
        this.team = team;
    }

    public Long getPlayer() {
        return player;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Teams getTeam() {
        return team;
    }

    public void setPlayer(Long player) {
        this.player = player;
    }

    public void setNames(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setTeam(Teams team) {
        this.team = team;
    }
}
