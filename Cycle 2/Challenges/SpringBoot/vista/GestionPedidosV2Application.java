package vista;

import Repositories.RepositorioCustomers;
import Repositories.RepositorioDirecciones;
import Repositories.RepositorioProductos;
import controlador.*;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;
import modelo.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;


@SpringBootApplication
@ComponentScan("model") 
@EnableJdbcRepositories("Repositories")

public class GestionPedidosV2Application {
        
        @Autowired
        RepositorioCustomers repositorioCustomers;
        @Autowired
        RepositorioDirecciones repositoriodirecciones;    
        @Autowired
        RepositorioProductos repositorioProductos; 
	public static void main(String[] args) {
		//SpringApplication.run(MuseoApplication.class, args);
                SpringApplicationBuilder builder = new SpringApplicationBuilder(GestionPedidosV2Application.class);
                builder.headless(false);
                ConfigurableApplicationContext context = builder.run(args);
	}
        
        @Bean
        ApplicationRunner applicationRunner (){
            return args -> {
            
            StoreManager vista = new StoreManager();

            ControladorDirecciones direcciones = new ControladorDirecciones(repositoriodirecciones, vista);
            ControladorCustomer customers = new ControladorCustomer(repositorioCustomers, vista);
            ControladorProductos products = new ControladorProductos(repositorioProductos, vista);
            };

}
        
}
