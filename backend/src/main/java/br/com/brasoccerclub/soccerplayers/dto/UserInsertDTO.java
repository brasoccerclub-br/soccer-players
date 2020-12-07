package br.com.brasoccerclub.soccerplayers.dto;

import javax.validation.constraints.NotBlank;

import br.com.brasoccerclub.soccerplayers.services.validation.UserInsertValid;

@UserInsertValid
public class UserInsertDTO extends UserDTO {
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message = "O campo [password] é obrigatório")
	private String password;
	
	public UserInsertDTO() {
		super();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
