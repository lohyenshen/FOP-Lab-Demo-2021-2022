package L8.Q7;


public class Money {
    private int amount;
    private String[] names = {"RM100", "RM50", "RM10", "RM5", "RM1", "50cent", "20cent", "10cent", "5cent", "1cent"};
    private int[]   values = { 100_00,  50_00,  10_00,  5_00,  1_00,      50,        20,       10,       5,        1};
    private int[] quantities = new int[values.length];

    // assume total amount is in CENT
    public Money( int amount) { //15000
        this.amount = amount;
        calculate();
    }

    private void calculate() {
        int a = amount;

        for (int i = 0; i < values.length; i++) {
            quantities[i] = a / values[i];              // how many notes/coins can you extract
            a             -= quantities[i] * values[i]; // decrease the amount after extracting
        }


        /**
         * let a = 15320
         *
         * 15320/100_00 = 1
         * a = 15320-(1*100_00)
         *   = 5320
         *
         * 5320/50_00 = 1
         * a = 5320-(1*50_00)
         *   = 320
         *
         * 320/10_00 = 0
         * a = 320-(0*10_00)
         *   = 320
         *
         * 320/5_00 = 0
         * a = 320-(0*5_00)
         *   = 320
         *
         * 320/1_00 = 3
         * a = 320-(3*1_00)
         *   = 20
         *
         * 20/50 = 0
         * a = 20-(0*50)
         *   = 20
         *
         * 20/20 = 1
         * a = 20-(1*20)
         *   = 0
         *
         * 0/10 = 0
         * a = 0-(0*10)
         *   = 0
         *
         * 0/5 = 0
         * a = 0-(0*5)
         *   = 0
         */

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( String.format("RM%d.%d\n", amount/100, amount%100) );

        for (int i = 0; i < names.length; i++)
            sb.append(   String.format("%-10s%-10d\n", names[i], quantities[i])   );


        return sb.toString();
    }


    public Money add( Money other) {
        return new Money( this.amount + other.amount);
    }

    public Money minus(Money other) {
        if (this.amount < other.amount)
            throw new IllegalArgumentException("Insufficient amount, cannot minus");

        return new Money( this.amount - other.amount);
    }

    /**
     * 1011
     * temp = 1
     *
     * 1011 / 10
     * = 101 * 10
     * = 1010
     */
    public void roundUp(){
        int temp = amount%10; // 0-9
        amount = (amount/10) * 10;

        if (temp <= 2)
            amount += 0;   // useless

        else if (temp <= 7)
            amount += 5;

        else // temp >= 8
            amount += 10;
    }

    public String getRM(){
        return String.format("RM%d.%d", amount/100, amount%100);
    }
}
