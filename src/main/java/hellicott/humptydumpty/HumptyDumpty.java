package hellicott.humptydumpty;

class HumptyDumpty{
//    Humpty Dumpty sat on a wall,
//    Humpty Dumpty had a great fall.
//    All the king's horses and all the king's men
//    Couldn't put Humpty together again.
    
    public static void main(String[] args){
        HumptyDumpty humptyDumpty = new HumptyDumpty();
        Wall wall = new Wall();
        King king = new King();
        humptyDumpty.sing(humptyDumpty, wall, king);
    }
    
    private void sing(HumptyDumpty humptyDumpty, Wall wall, King king){
        humptyDumpty.sit(wall);
        humptyDumpty.fall("Great");
        try{
            putTogetherAgain(king.allHorses(), king.allMen());
            
        }catch(Exception e){
            System.err.println(e);
        }
        
        
    }
    
    private void sit(Object thing){
        System.out.println("Sitting on "+thing.toString());
    }
    
    private void fall(String size){
        System.out.println("Falling, with size: "+size);
    }
    
    private void putTogetherAgain(boolean kingsHorses, boolean kingsMen) throws Exception{
        if(kingsHorses && kingsMen){
            System.out.println("Putting Humpty Dumpty back together again");
        }else{
            throw new Exception("Couldn't put humpty together again");
        }
    }
}

class King{
    boolean allHorses(){
        System.out.println("Getting all king's horses");
        return false;
    }
    
    boolean allMen(){
        System.out.println("Getting all king's men");
        return false;
    }
    
    
}

class Wall{
    @Override
    public String toString(){
        return "Wall";
    }
}
