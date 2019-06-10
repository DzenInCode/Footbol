package hello;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayersRepository extends JpaRepository<Players,Long> {

    List<Players> findByTeam_Names(String name);


}
