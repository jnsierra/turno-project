package co.com.ud.bussines.user;

import co.com.ud.repo.entity.RoleUserEntity;

public interface IRoleUserService {
	/**
	 * Metodo con el cual inserto un role
	 * @param role
	 * @return
	 */
	RoleUserEntity save(RoleUserEntity role);

}
