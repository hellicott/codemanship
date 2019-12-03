package hellicott.tvprices;

class TvPrices{
    Retailer[] retailers;
    TvPrices(Retailer[] retailers){
        this.retailers = retailers;
    }
    
    String findCheapest(String make, String model){
        
        return this.retailers[0].getName();
    }
}
