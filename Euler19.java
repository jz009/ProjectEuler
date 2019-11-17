public class CountingSundays {
    public int day = 3;
    public int doy = 0;
    public int count = 0;
    int[] months = {31, 30, 31, 30, 31, 31, 30, 31, 30};

    public CountingSundays() {
        int day = 2;
        int doy = 0;
        int count = 0;
    }
    public void check() {
        if (doy % 7 == 0) {
            count++;
        }
    }
    public int count() {
        for (int i = 1901; i < 2001; i++) {
            doy = day;
            check();
            doy += 31;
            check();
            if (i % 4 == 0) {
                doy+= 29;
            }
            else doy += 28;
            check();
            for (int j = 0; j < 9; j++) {
                doy += months[j];
                check();
            }
            doy += 31;
            day = doy % 7;
        }
        return count;
    }

    public static void main(String[] args) {
        CountingSundays test = new CountingSundays();
        System.out.println(test.count());
    }
}
