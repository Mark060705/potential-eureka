package javaapplication4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Beolvas {
    void beolvasas(){
        Path path = Path.of("fuvarok.csv");
        List<String> sorok = Files.readAllLines(path);
        List<Fuvar> fuvarok = new ArrayList<>();    
        
        for (String string : sorok) {
            var adat = string.split(",");
            String a1 = adat[0];
            int a2 = Integer.parseInt(adat[1]);
            Fuvar auto = new Fuvar(a1, a2);
            fuvarok.add(auto);
        }
        
  
    }
}
