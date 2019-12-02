package hellicott.fibonacci;

class Fibonacci{
    int fibonacciAt(int index){
        if(index<2){
            return index;
        }else{
            return (fibonacciAt(index - 1) + fibonacciAt(index - 2));
        }
    }
}
