import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main (String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("ABC's", "abcdefghijklmnop...");
        trackList.put("Twinkle Twinkle Little Star", "How i wonder what you are...");
        trackList.put("Ol Mcdonald", " E I E I O");
        trackList.put("Itsy Bitsy Spider", "Went up the water spout...");

        String first = trackList.get("ABC's");
        String second = trackList.get("Twinkle Twinkle Little Star");
        String third = trackList.get("Ol Mcdonald");
        String fourth = trackList.get("Itsy Bitsy Spider");
        System.out.println("The song name is: " + first);

        Set<String> tracks = trackList.keySet();
        for(String track : tracks){
            System.out.println(track + " : " + trackList.get(track));
        }
    }
}
