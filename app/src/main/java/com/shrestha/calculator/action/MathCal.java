package com.shrestha.calculator.action;



import com.shrestha.calculator.model.Numbers;

public class MathCal implements Cal {

    @Override
    public String add(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())+(n.getSecondNumber())));

        return add;

    }

    @Override
    public String sub(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())-(n.getSecondNumber())));
        return add;
    }

    @Override
    public String divide(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())/(n.getSecondNumber())));

        return add;
    }

    @Override
    public String mul(Numbers n) {
        String add= (String.valueOf((n.getFirstNumber())*(n.getSecondNumber())));

        return add;
    }
}
