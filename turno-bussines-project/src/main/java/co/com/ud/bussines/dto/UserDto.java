package co.com.ud.bussines.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	@Column(name = "username")
	private String username;
}
