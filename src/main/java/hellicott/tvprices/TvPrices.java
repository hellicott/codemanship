package hellicott.tvprices;

import java.util.ArrayList;
import java.util.Collections;

class TvPrices{
    Retailer[] retailers;
    TvPrices(Retailer[] retailers){
        this.retailers = retailers;
    }
    
    String findCheapest(String make, String model){
        ArrayList<Double> prices = new ArrayList<Double>();
        for(Retailer retailer:this.retailers){
            prices.add(retailer.getPrice(make, model));
        }
        int index = prices.indexOf(Collections.min(prices));
        return this.retailers[index].getName();
    }
}
