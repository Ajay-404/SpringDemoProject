package co.pragra.learning.springlearning.business;

import co.pragra.learning.springlearning.domain.IInsurance;
import lombok.var;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class QuoteGenerator {
    private List<IInsurance> insurances;

    public QuoteGenerator(List<IInsurance> insurances){
        this.insurances = insurances;
    }

    public Map<Double, List<String>>  getQuote(){
        Map<Double, List<String>> quoteMap = new HashMap<>();
        double price = insurances.stream().map(i->i.getPrice()).reduce(0.0,(a,b)->a+b);
        var insuarence = insurances.stream().map(i -> i.getType()).collect(Collectors.toList());
        quoteMap.put(price,insuarence);
        return quoteMap;
    }
}
