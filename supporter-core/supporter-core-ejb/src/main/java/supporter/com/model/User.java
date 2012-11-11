package supporter.com.model;

import javax.persistence.Entity;

public class User {
	private Long id;
	private String name;
	private String email;
	private String password;
	private Company company;
}
