package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teams {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String names;
    private Long id_capitans;
    private Long id_players;



    protected Teams() {}

    public Teams(String names, Long id_capitans, Long id_players) {
        this.names = names;
        this.id_capitans = id_capitans;
        this.id_players = id_players;
    }

    @Override
    public String toString() {
        String format = String.format(
                "Team[ names ='%s', capitan='%l', players='%l']",
                names, id_capitans, id_players);
        return format;
    }

}
