import java.util.HashMap;

class Programmers_lv2_UnfinishedRacer {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> racerHash = new HashMap<>();

        
        for(String racer : participant)
            racerHash.put(racer, racerHash.getOrDefault(racer, 0) + 1);

        for(String racer : completion)
        {
            Integer number = racerHash.get(racer);
            number--;

            if(number == 0) racerHash.remove(racer);
            else racerHash.put(racer, number);
        }


        return racerHash.keySet().toArray(new String[0])[0];
    }
}