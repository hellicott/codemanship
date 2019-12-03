package hellicott.problemgenerator;

import java.util.ArrayList;

class ProblemGenerator{
    ProblemGenerator(ProblemAI ai){
    
    }
    
    Problem generateProblem(ArrayList<String> tags){
        return new Problem(tags);
    }
}
