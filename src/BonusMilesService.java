public class BonusMilesService {
    public int calculate(int price) {
        int milesPerRub = 20;
        int miles = price / milesPerRub;
        return miles;
    }
}

