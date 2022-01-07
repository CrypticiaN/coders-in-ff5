import org.factoriaf5.codersinff5.repository.Coder;
import org.factoriaf5.codersinff5.repository.CoderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
    public class SampleDataLoader {

    private CoderRepository coderRepository;

    @Autowired
    public SampleDataLoader(CoderRepository coderRepository) {
        this.coderRepository = coderRepository;
    }

    @PostConstruct
    public void loadSampleData() {
        coderRepository.saveAll(List.of(
                new Coder("Ana", "Casas", "28", "España", "Grado Medio", "Mina de Ciutat 5", "Femtech P2"),
                new Coder("Laura", "Mayas", "34", "España", "Grado Superior", "Calle x 23", "Femtech P2")
        ));
    }
    }

