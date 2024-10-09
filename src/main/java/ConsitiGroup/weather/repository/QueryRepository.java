package ConsitiGroup.weather.repository;

import ConsitiGroup.weather.models.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryRepository extends JpaRepository<Query, Long> {
}
