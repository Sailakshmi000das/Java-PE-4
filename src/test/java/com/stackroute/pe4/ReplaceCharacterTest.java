import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {

    ReplaceCharacter rc=new ReplaceCharacter();

    @Test
   public void replace(){
        String s="daily dry";
        String res=rc.replaceChar(s);
        assertEquals("faity fry",res);
    }
}