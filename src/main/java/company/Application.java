package company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Configuration;


/**
 * Simple Company Rest API Application
 * @author Rinaldo Melo
 * 02/29/2016
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}