import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
public class TestPartition
{
    @Test
    public void partitiontest()
    {
        /* tester avec des entiers */
        Partition partition1 =new Partition();
        List<Integer> input = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<List<Integer>> expected=new ArrayList<>();
        List<Integer>sousliste=Arrays.asList(1,2,3);
        expected.add(sousliste);
        sousliste=Arrays.asList(4,5,6);
        expected.add(sousliste);
        sousliste=Arrays.asList(7,8,9);
        expected.add(sousliste);
        assertEquals(partition1.partition(input,3),expected);
        expected=new ArrayList<>();
        sousliste=Arrays.asList(1,2,3,4);
        expected.add(sousliste);
        sousliste=Arrays.asList(5,6,7,8);
        expected.add(sousliste);
        sousliste=Arrays.asList(9);
        expected.add(sousliste);
        assertEquals(partition1.partition(input,4),expected);
        expected=new ArrayList<>();
        sousliste=Arrays.asList(1,2,3,4,5,6,7,8,9);
        expected.add(sousliste);
        assertEquals(partition1.partition(input,40),expected);
        assertNull(partition1.partition(input,0));
        assertNull(partition1.partition(input,-1));

        /* tester  avec type string  */
        List<List<String>> expected2=new ArrayList<>();
        List<String> input2 = Arrays.asList("SUJET","MAISON","TEST","JAVA");
        List<String>sousliste2=Arrays.asList("SUJET","MAISON","TEST");
        expected2.add(sousliste2);
        sousliste2=Arrays.asList("JAVA");
        expected2.add(sousliste2);
        assertEquals(partition1.partition(input2,3),expected2);
        expected2=new ArrayList<>();
        sousliste2=Arrays.asList("SUJET");
        expected2.add(sousliste2);
        sousliste2=Arrays.asList("MAISON");
        expected2.add(sousliste2);
        sousliste2=Arrays.asList("TEST");
        expected2.add(sousliste2);
        sousliste2=Arrays.asList("JAVA");
        expected2.add(sousliste2);
        assertEquals(partition1.partition(input2,1),expected2);











    }
}
