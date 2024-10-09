package ConsitiGroup.weather.repository;

import ConsitiGroup.weather.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByEmail(String email);

}
