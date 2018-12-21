package co.com.ud.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.ud.repo.entity.RoleUserEntity;

@Repository
public interface IRoleUserRepository extends JpaRepository<RoleUserEntity, Long>, CrudRepository<RoleUserEntity, Long> {

}
