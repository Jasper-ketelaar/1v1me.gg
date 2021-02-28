package gg.ovome.backend.repositories;

import gg.ovome.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Repository
    public interface GuestRepository extends JpaRepository<User, Long> {
    }
}
