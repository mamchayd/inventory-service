package ma.enset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import ma.enset.entity.Prodect;

@RepositoryRestResource
public interface ProdectRepository extends JpaRepository<Prodect,Long> {

}