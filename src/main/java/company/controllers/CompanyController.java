package company.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import company.models.Company;
import company.repository.CompanyRepository;

/**
 * @author Rinaldo Melo
 * 02/29/2016
 *
 */
@RestController
@RequestMapping("/companies")
public class CompanyController {
	
	@Autowired
	private CompanyRepository companies;

	@RequestMapping(method = RequestMethod.GET)
	public List<Company> listCompanies() {
	    
		return companies.findAll();
	}

	/**
	 * Add New Company
	 * @param company
	 * @return Updated Company with new the Company
	 */
	
	@RequestMapping(method = RequestMethod.POST)
	public Company addCompany(@RequestBody Company company) {
	    
		company.setId(null);
	    return companies.saveAndFlush(company);
	  }
	  
	  /**
	 * @param updatedCompany
	 * @param id
	 * @return Updated Company
	 */
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public Company updateCompany(@RequestBody Company updatedCompany, @PathVariable Integer id) {
	    
		updatedCompany.setId(id);
	    return companies.saveAndFlush(updatedCompany);
	  }
	  
	  /**
	   * Delete company by Id
	 * @param id
	 */
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	  public void deleteCompany(@PathVariable Integer id) {
	    
		  companies.delete(id);
	  }


}
