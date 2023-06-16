package exercice;

import java.util.ArrayList;
import java.util.List;
public class Exercicesimplicitemeilleur {
    public static List<String> solution(String str, List<Character> ordre) {

        List<String> motsTries = new ArrayList<>();
        String[] motsNonTries = str.split("[^a-zA-Z0-9]+");

        if(str==""){
            return motsTries;
        }
        
        for(int i = 0; i<ordre.size() && !str.isEmpty();i++){
            for (int j = 0; j<motsNonTries.length; j++){
                String mot = motsNonTries[j];
                if (mot.charAt(0) == ordre.get(i)) {
                   motsTries.add(mot);
                }
            }
        }
        for (int i = 0; i < motsNonTries.length;i++){
            String mot = motsNonTries[i];
            if(!motsTries.contains(mot)){
                motsTries.add(mot);
            }
        }
        return motsTries;
    }
}
