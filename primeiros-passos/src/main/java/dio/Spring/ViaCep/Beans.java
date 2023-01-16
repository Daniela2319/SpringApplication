package dio.Spring.ViaCep;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // garantir não tenha erro na sua aplicação
public class Beans {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
