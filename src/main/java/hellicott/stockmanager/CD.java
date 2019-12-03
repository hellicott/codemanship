package hellicott.stockmanager;

interface CdInfo{
    public String[] getInfo();
}

class CD implements CdInfo{
    private int stock;
    
    CD(int stock, String name, String artist){
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
    
    public String[] getInfo(){
        return new String[0];
    }
}
