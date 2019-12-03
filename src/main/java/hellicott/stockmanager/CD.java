package hellicott.stockmanager;

interface CdInfo{
    public String[] getInfo();
}

class CD{
    private int stock;
    
    CD(int stock){
        this.stock = stock;
    }
    
    void buy(PaymentThing pt){
        if((pt.paymentAccepted())&& (this.inStock())){
            this.stock--;
        }
    }
    
    int getStock(){
        return this.stock;
    }
    
    boolean inStock(){
        return getStock() > 0;
    }
}
