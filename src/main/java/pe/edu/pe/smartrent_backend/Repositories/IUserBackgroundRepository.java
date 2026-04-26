package pe.edu.pe.smartrent_backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pe.smartrent_backend.Entities.UsersBackground;

@Repository
public interface IUserBackgroundRepository extends JpaRepository<UsersBackground,Integer> {


}
