// fichero UserRepository.java

package mii.cc.example.api.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {

	// ya temdriamos los prinicpales métodos CRUD
	// y más adelante podemos crear nuestros propios métodos

}