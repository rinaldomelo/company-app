package company.models;

import javax.persistence.*;

/**
 * @author Rinaldo Melo
 * 02/29/2016
 *
 */

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	 
	private Integer id;
	
	@Column
	private String name;

	@Column
	private String address;

	@Column
	private String city;

	@Column
	private String country;
	
	@Column
	private String email;
	
	@Column
	private String phoneNumber;
	
	@Column
	private String[] owners;
	
	
	/**
	 * @return Company Id
	 */
	public Integer getId() {
		return id;
	}

	/** Set Company Id
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/** Set Company Name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/** Set Company address
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return city
	 */
	public String getCity() {
		return city;
	}

	/** Set Company City
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**Return Company Country
	 * @return country
	 */
	public String getCountry() {
		return country;
	}

	/** Set Company Country
	 * @param country
	 */
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/** Set Company Email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**Set Company Phone Number
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return Company owners
	 */
	public String[] getOwners() {
		return owners;
	}

	/** Set Company Owners
	 * @param owners
	 */
	public void setOwners(String[] owners) {
		this.owners = owners;
	}

}
