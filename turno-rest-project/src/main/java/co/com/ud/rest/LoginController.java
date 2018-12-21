package co.com.ud.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v.1/login")
public class LoginController {
	
	@GetMapping("/")
	public ResponseEntity<String> sinAutenticacion(){
		return new ResponseEntity<>("Sin Seguridad", HttpStatus.OK);
	}
	
	@GetMapping("/nico")
	public ResponseEntity<String> sinAutenticacionNico(){
		return new ResponseEntity<>("Sin Seguridad Nico", HttpStatus.OK);
	}
}
