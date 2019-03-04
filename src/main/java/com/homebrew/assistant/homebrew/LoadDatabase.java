package com.homebrew.assistant.homebrew;

import com.homebrew.assistant.homebrew.brewer.Brewer;
import com.homebrew.assistant.homebrew.brewer.BrewerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(BrewerRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Brewer("dudu", "Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save(new Brewer("dodo", "Frodo Baggins", "thief")));
        };
    }
}
