package com.shrestha.calculator.action;



import com.shrestha.calculator.MainActivity;
import com.shrestha.calculator.model.Numbers;

public class MathCal implements Cal {
    MainActivity ma = new MainActivity();
    @Override
    public String add(Numbers n) {
//        Toast.makeText(ma, (String.valueOf((n.getFirstNumber())+(n.getSecondNumber()))), Toast.LENGTH_SHORT).show();
        return (String.valueOf((n.getFirstNumber())+(n.getSecondNumber())));
    }

    @Override
    public String sub(Numbers n) {
        return (String.valueOf((n.getFirstNumber())-(n.getSecondNumber())));
    }

    @Override
    public String divide(Numbers n) {
        return (String.valueOf((n.getFirstNumber())/(n.getSecondNumber())));
    }

    @Override
    public String mul(Numbers n) {
        return (String.valueOf((n.getFirstNumber())*(n.getSecondNumber())));
    }
}
