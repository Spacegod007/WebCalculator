package webService;

import service.NegativeNumberException;
import javax.jws.WebService;
import service.*;

@WebService
public class WebCalculator {
    
    private PositiveCalculatorService positiveCalculatorService = new PositiveCalculatorService();

    public int add(int x, int y) throws NegativeNumberException {
        return positiveCalculatorService.add(x, y);
    }

    public int minus(int x, int y) throws NegativeNumberException {
        return positiveCalculatorService.minus(x, y);
    }

    public int times(int x, int y) throws NegativeNumberException {
        return positiveCalculatorService.times(x, y);
    }
}