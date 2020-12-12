package ma.enset;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import ma.enset.entity.Prodect;
import ma.enset.repository.ProdectRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
	   @Bean
	    CommandLineRunner start(ProdectRepository productRepository,RepositoryRestConfiguration repositoryRestConfiguration){
		   repositoryRestConfiguration.exposeIdsFor(Prodect.class);
	        return args -> {
	            productRepository.save(new Prodect(null,"Computer Desk Top HP",900,2));
	            productRepository.save(new Prodect(null,"Printer Epson",80,2));
	            productRepository.save(new Prodect(null,"MacBook Pro Lap Top",1800,1));
	            productRepository.findAll().forEach(p->{
	            	
	            	System.out.println(p.getName());
	            });
	        };
	    }

}
