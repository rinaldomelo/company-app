package company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import company.models.Company;

/**
 * @author Rinaldo Melo
 * 02/29/2016
 *
 */
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
