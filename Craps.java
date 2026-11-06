public class Craps {
    DiceRoll r;

    public Craps() {
        r = new DiceRoll();
    }

    // Returns 0 if lose, otherwise returm 1 if you win.
    public int play() {
        int num;
        int count = 1;
        num = r.total();
        int x = num;
        if(count == 1 && (num == 2 || num == 3 || num == 12))
            return 0;
        if(count == 1 && (num == 7 || num == 11))
            return 1;
        
            num = r.total();
            while(num != x){
            num = r.total();
            if(num == 7)
                return 0;
        }
        return 1;

    }


    // simulate play to see your odds of winning
    public void tester(int howMany) {
        int runs = 0;
        while(runs <= howMany){
            System.out.println(play());
        }
            

    }

    public static void main(String[] args) {
        new Craps();
    }
}
