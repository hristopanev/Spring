package residentevil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import residentevil.domain.entities.Capital;

import java.util.List;

@Repository
public interface CapitalRepository extends JpaRepository<Capital, String> {

    @Query("select c from Capital c order by c.name")
    List<Capital> findAllOrderByName();
}
