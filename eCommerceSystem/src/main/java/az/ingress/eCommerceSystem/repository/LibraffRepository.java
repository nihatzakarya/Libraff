package az.ingress.eCommerceSystem.repository;

import az.ingress.eCommerceSystem.entity.Libraff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraffRepository extends JpaRepository<Libraff,Long> {

}
