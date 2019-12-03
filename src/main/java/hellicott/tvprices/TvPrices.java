package hellicott.tvprices;

import java.util.ArrayList;
import java.util.Collections;

class TvPrices{
    private Retailer[] retailers;
    TvPrices(Retailer[] retailers){
        this.retailers = retailers;
    }
    
    ArrayList<Retailer> findCheapest(String make, String model){
        ArrayList<Retailer> cheapestRetailers = new ArrayList<Retailer>();
        for(Retailer retailer:this.retailers){
            if((cheapestRetailers.size() == 0)
                    || (retailer.getPrice(make, model) == cheapestRetailers.get(0).getPrice(make, model))){
                cheapestRetailers.add(retailer);
            }else if (retailer.getPrice(make, model) < cheapestRetailers.get(0).getPrice(make, model)){
                cheapestRetailers.clear();
                cheapestRetailers.add(retailer);
            }
        }
        return cheapestRetailers;
    }
}
