package src.solid.liskov;

public class InHouseProduct extends Product{
    @Override
    public double getDiscount() {
        this.applyExtraDiscount();
        return discount;
    }

    //tell don't ask.

    private void applyExtraDiscount(){
        discount = discount * 1.5;
    }
}
