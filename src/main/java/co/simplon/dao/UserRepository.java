package co.simplon.dao;

import co.simplon.entites.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser,Long> {
    public AppUser findByUserName(String userName);

}
