/**
 * Created by RAMYA P S on 26-11-2015.
 */
public class UniqueCharacters {
    public boolean isUnique(String input) {
        if (input.length() > 256) return false;
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }
}
