package hellicott.problemgenerator;

import java.util.ArrayList;

class Problem{
    private ArrayList<String> tags;
    
    Problem(ArrayList<String> tags){
        this.tags = tags;
    }
    ArrayList<String> getTags(){
        return this.tags;
    }
}
