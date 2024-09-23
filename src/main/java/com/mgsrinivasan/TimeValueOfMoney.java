package com.mgsrinivasan;

public class TimeValueOfMoney {

    float pmt = 0;
    double rate = 0;
    int n = 0;

    public TimeValueOfMoney(float pmt, double rate, int n){
        this.pmt = pmt;
        this.rate = rate;
        this.n = n;
    }

    float PVofOne(float pmt, double rate, int n){
        float factor = (float) Math.pow(((float)(1.0) + rate), n);
        float PVO = pmt / factor;
        return PVO;
    }

    float PVofAnnuity(float pmt, double rate, int n){
        float factor = (float) ((1-(Math.pow(((float)(1.0) + rate),-n)))/rate);
        float PVA = pmt * factor;
        return PVA;
    }

/*
future value of one
    C = cash flow at period 0
    r = rate of return
    n = nbr of periods
    FV = C * (1 + r)^n
*/
    float FVofOne(float pmt, float rate, int n){
        float factor = (float)(((Math.pow(((float)(1.0) + rate),n))));
        float FVO = pmt * factor;
        return FVO;
    }

/*
    future value of annuity
        P = periodic payment
        r = rate per period
        n = nbr of periods
        FV of annuity = P * ( ( ((1 + r)^n) - 1 ) / r )
*/
    float FVOfAnnuity(float pmt, float rate, int n){
        float factor = (float)(((Math.pow(((float)(1.0) + rate),n)-1))/rate);
        float FVA = pmt * factor;
        return FVA;
    }

/*
 the values are higher
    payments made at The Beginning of the period
        have more time to earn interest

    future value of annuity Due
        P = periodic payment
        r = rate per period
        n = nbr of periods
        FV of annuity = P * ( ( ((1 + r)^n) - 1 ) / r ) * (1 + r)
*/
    float FVOfAnnuityDue(float pmt, float rate, int n){
        float factor = (float)(((Math.pow(((float)(1.0) + rate),n)-1))/rate * (1 + rate));
        float FVAD = pmt * factor;
        return FVAD;
    }

    /*
    PV of an annuity due
        takes into account the fact that
        payments are made at
                The Beginning
                    rather than
                the end of
             each period.

        present value of annuity Due
            P = periodic payment
            r = rate per period
            n = nbr of periods
            FV of annuity due = P * ( (1 - ((1 + r)^-n)) / r) ) * (1 + r) )
    */
    float PVOfAnnuityDue(float pmt, float rate, int n){

        float fact = (float)(1.0) + rate;
        float fact0 = (float) (Math.pow(fact,(-n)));
        float fact1 = (1 - fact0) / rate;
        float fact2 = (1 + rate);
        float factor = fact1 * fact2;

//        System.out.println("fact = " + fact);
//        System.out.println("factor0 = " + factor0);
//        System.out.println("factor1 = " + factor1);
//        System.out.println("factor2 = " + factor2);
//        System.out.println("factor3 = " + factor3);

        float PVAD = pmt * factor;
        return PVAD;
    }



    /*
    compound interest

    C = P * ( ((1 + r)^n) - 1)
        C = compound interest
        P = principal or original balance
        r = rate per period
        n = nbr of periods

    an original balance of $1000 is earning 12% per year
    compounded monthly.
    Due to being compounded monthly,
        the number of periods for one year = 12
        the rate = 1% (per month)

    C = $1000 x ( ((1 + .01)^12 - 1) )
        $1000 x    ( 1.12683 - 1)
        $126.83
    */
    float CompoundInterest(float principal, float rate, int n){
        float factor = ((float) Math.pow(((float)(1.0) + rate), n)-1);
        float ci = principal * factor;
        return ci;
    }

/*
    simple interest
        S = P * r * t

        S  simple interest
        P  principal
        r  rate
        t  time

     a simple interest calculation
        a 3 year saving account
        at a 10% rate with
        an original balance of $1000.

        $1000 x 10% x 3 years = $300
     */
float SimpleInterest(float principal, float rate, int time){
    float factor = (rate * time);
    float si = principal * factor;
    return si;
    }

}
