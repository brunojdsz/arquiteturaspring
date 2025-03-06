package com.project.brunojdsz.arquiteturaspring.automaker.configiration;

import com.project.brunojdsz.arquiteturaspring.automaker.Engine;
import com.project.brunojdsz.arquiteturaspring.automaker.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AutomakerConfiguration {

    @Bean(name = "aspirateEngine")
    public Engine aspirateEngine(){
        var engine = new Engine();
        engine.setHorse(120);
        engine.setCylinders(6);
        engine.setModel("XPTO-0");
        engine.setLiterage(2.0);
        engine.setType(EngineType.ASPIRADO);
        return engine;
    }

    @Bean(name = "electricEngine")
    public Engine electricEngine(){
        var engine = new Engine();
        engine.setHorse(100);
        engine.setCylinders(3);
        engine.setModel("TH-10");
        engine.setLiterage(1.4);
        engine.setType(EngineType.ELETRICO);
        return engine;
    }

    @Bean(name = "turboEngine")
    @Primary
    public Engine turboEngine(){
        var engine = new Engine();
        engine.setHorse(180);
        engine.setCylinders(8);
        engine.setModel("XPTO-1");
        engine.setLiterage(4.0);
        engine.setType(EngineType.TURBO);
        return engine;
    }
}
