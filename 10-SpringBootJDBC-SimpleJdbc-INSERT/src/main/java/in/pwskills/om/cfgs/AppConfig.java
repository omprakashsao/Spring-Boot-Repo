package in.pwskills.om.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersistanceConfig.class)
@ComponentScan(basePackages = "in.pwskills.om")
public class AppConfig {

}
