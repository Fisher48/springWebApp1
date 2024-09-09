package ivan.springSwiftbook;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {


    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialisation");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSongs() {
        return "Mozart";
    }
}
