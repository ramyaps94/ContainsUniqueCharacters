import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RAMYA P S on 26-11-2015.
 */
public class UniqueCharctersTest {
    @Test
    public void shouldReturnTrueIfContainsOnlyUniqueCharacters() {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();

        boolean actualResult = uniqueCharacters.isUnique("abcdef hij");

        assertEquals(true, actualResult);
    }

    @Test
    public void shouldReturnFalseIfContainsDuplicateCharacters() {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();

        boolean actualResult = uniqueCharacters.isUnique("hai hello");

        assertEquals(false, actualResult);
    }
}
