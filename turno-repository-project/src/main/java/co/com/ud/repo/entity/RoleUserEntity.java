package co.com.ud.repo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "role_user")
public class RoleUserEntity {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="role")
	private String role;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private UserEntity user;

}
