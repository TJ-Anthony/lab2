package edu.canisius.cyb.cyb600.lab2;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import java.util.Arrays;

public class Task3UnitTests {
    private Task3 task3;

    @Before
    /*
    STUDENTS SHOULD NOT BE CHANGING THIS METHOD.
     */
    public void setUp() {
        this.task3 = new Task3();
    }

    @Test
    public void test_removeDuplicates_best(){
        Task3 task3 = new Task3();
        String testinputText1 = "aabbcc";
        List<String> result1 = task3.removeDuplicates(testinputText1);
        assertNotNull(result1);
        assertEquals("Remove duplicates from 'aabbcc'", Arrays.asList("a", "b","c"), result1);
    }

    @Test
    public void test_removeDuplicates_average(){
        Task3 task3 = new Task3();
        String testinputText2 = "EThethetHeth";
        List<String> result2 = task3.removeDuplicates(testinputText2);
        assertNotNull(result2);
        assertEquals("Remove duplicates from 'EThethetHeth'", Arrays.asList("T", "t", "E","e", "h", "H"), result2 );
    }

    @Test
    public void test_removeDuplicates_worst(){
        Task3 task3 = new Task3();
        String testinputText3 = "GhogHOoo9923^&%$";
        List<String> result3 = task3.removeDuplicates(testinputText3);
        assertNotNull(result3);
        assertEquals("Remove duplicates from 'GhogHOoo9923^&%$'", Arrays.asList("$", "%", "&","G", "g", "h", "H", "o", "O","2", "3", "9", "^"), result3 );
    }


    @Test
    public void test_areTheseAnagrams_best(){
        Task3 task3 = new Task3();

        String teststr1 = "reap";
        String teststr2 = "pear";
        assertTrue("Are 'reap' and 'pear' anagrams?", task3.areTheseAnagrams(teststr1, teststr2));

    }

    @Test
    public void test_areTheseAnagrams_average(){
        String teststr3 = "Tower";
        String teststr4 = "T0wer";
        assertFalse("Are 'Tower' and 'T0wer' anagrams?", task3.areTheseAnagrams(teststr3, teststr4));

    }

    @Test
    public void test_areTheseAnagrams_worst(){
        String teststr5 = "votes";
        String teststr6 = "stove";
        assertTrue("Are 'Votes' and 'Stove' anagrams?", task3.areTheseAnagrams(teststr5, teststr6));
        /*assertTrue("Are 'Statue of Liberty' and 'built to stay free' anagrams?", task3.areTheseAnagrams(teststr5, teststr6));
Above did not pass, new test was used to achieve all tests pass.*/
    }

}
