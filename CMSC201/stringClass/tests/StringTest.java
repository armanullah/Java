import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {

    @org.junit.Test
    public void length() {
        String s = new String("rocky");
        assertEquals(5, s.length());

    }

    @Test
    public void charAt() {
        String s = new String("rocky");
        assertEquals('o', s.charAt(1));
    }

    @Test
    public void substring() {
        String s = new String("rocky");
        assertEquals("ocky", s.substring(1));
    }

    @Test
    public void indexOf() {
        String s = new String("rocky");
        assertEquals(2, s.indexOf("c"));
    }

}
