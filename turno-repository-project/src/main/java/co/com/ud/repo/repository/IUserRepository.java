package co.com.ud.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.ud.repo.entity.UserEntity;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long>, CrudRepository<UserEntity, Long> {
}
