package co.pragra.learning.springlearning.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AutoInsurance implements IInsurance{
    private final String type;
    private final double price;

    @Override
    public String getType(){
        return type;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
