package examproject.test;

import java.util.LinkedList;
import static junit.framework.Assert.assertTrue;

public class LinkedListTest {

    @org.junit.Test
    public void AddElementToSet() throws Exception {
        LinkedList ll = new LinkedList();

        ll.add("test");

        assertTrue(ll.get(0).equals("test"));
    }
    
    @org.junit.Test
    public void AddMoreElements() throws Exception
    {
        LinkedList ll = new LinkedList();
        //LinkedList ls = new StringSet();

        ll.add("test 1");

        ll.add("test 2"); //Changed to ls
        
        //ll.append(ls) //append method returns ll list

        assertTrue(ll.size() == 1);
    }
}
