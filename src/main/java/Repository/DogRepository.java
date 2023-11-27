package Repository;

import Model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DogRepository extends JpaRepository<Dog, Integer> {
}
