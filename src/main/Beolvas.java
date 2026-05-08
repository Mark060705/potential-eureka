package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Beolvas {
    public static List<Fuvar> beolvasas() throws IOException{
        Path path = Path.of("fuvarok.csv");
        List<String> sorok = Files.readAllLines(path);
        List<Fuvar> fuvarok = new ArrayList<>();    
        
        for (String string : sorok) {
            var adat = string.split(";");
            String a1 = adat[0];
            int a2 = Integer.parseInt(adat[1]);
            int a3 = Integer.parseInt(adat[2]);
            String a4 = adat[3];
            Fuvar fuvar = new Fuvar(a1, a2, a3, a4);
            fuvarok.add(fuvar);
        }
        
        return fuvarok;
    }
}
