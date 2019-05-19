import org.junit.Test;

import static org.junit.Assert.*;

public class OccurenceStringTest {

    OccurenceString os=new OccurenceString();

    @Test
    public void occurence(){
        String s="Java is java again java again";
        int result=os.countOccurences(s);
        assertEquals(10,result);


    }

}