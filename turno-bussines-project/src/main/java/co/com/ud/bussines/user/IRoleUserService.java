package co.com.ud.bussines.user;

import co.com.ud.repo.entity.RoleEntity;

public interface IRoleUserService {
	/**
	 * Metodo con el cual inserto un role
	 * @param role
	 * @return
	 */
	RoleEntity save(RoleEntity role);

}
