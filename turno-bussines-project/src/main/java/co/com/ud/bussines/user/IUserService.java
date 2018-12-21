package co.com.ud.bussines.user;

import java.util.List;
import java.util.Optional;

import co.com.ud.repo.entity.UserEntity;

public interface IUserService { 
	/**
	 * Metodo con el cual busco todos los usuarios dentro de la base de datos
	 * @return
	 */
	List<UserEntity> findAll();
	/**
	 * Metodo con el cual obtengo los usuarios registrados en el sistema por medio de su id
	 * @param id
	 * @return
	 */
	Optional<UserEntity> findById(Long id);
	/**
	 * Metodo con el cual guardo un usuarioen la base de datos
	 * @return
	 */
	UserEntity saveUser(UserEntity user);
}
