package co.com.ud.repo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "role")
public class RoleEntity {
	@Id
	@GeneratedValue
	private Long id;
	@NotNull(message="El nombre del role no puede ser nulo")
	@Column(name="role")
	private String role;
	@ManyToMany(mappedBy = "roles")
    private List<UserEntity> users= new ArrayList<>();
}
