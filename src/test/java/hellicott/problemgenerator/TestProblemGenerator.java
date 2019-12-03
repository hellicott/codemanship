package hellicott.problemgenerator;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class TestProblemGenerator{
    @Test
    public void testReturnProblemWhenNoTagsInRequest(){
        // arrange
        ProblemGenerator generator = new ProblemGenerator(Mockito.mock(ProblemAI.class));
        // act
        Problem problem = generator.generateProblem(new ArrayList<String>());
        // assert
        Assert.assertEquals(0, problem.getTags().size());
    }
    
    @Test
    public void testReturnProblemWithTagWhenTagInRequest(){
        // arrange
        final ProblemGenerator generator = new ProblemGenerator((Mockito.mock(ProblemAI.class)));
        String tag = "pirates";
        ArrayList<String> tags = new ArrayList<String>();
        tags.add(tag);
        // act
        Problem problem = generator.generateProblem(tags);
        // assert
        Assert.assertTrue(problem.getTags().contains(tag));
    }
}
