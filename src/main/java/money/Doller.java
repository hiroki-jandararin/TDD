package money;

public class Doller {
    private int amount;

    Doller(int amount) {
        this.amount = amount;
    }
    Doller times(int multiplier) {
        return new Doller(this.amount * multiplier);
    }

    public boolean equals(Object object) {
        Doller doller = (Doller) object;
        return this.amount == doller.amount;
    }
}
