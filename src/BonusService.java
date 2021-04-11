public class BonusService {
    public int calculate(int cost) {
        int bonusCost = 20;
        int bonus = 1;
        int miles = cost / bonusCost * bonus;
        return miles;
    }
}
