package sellingVehicles;

public class Bill {

    public int generateBill(int advertAmount, int productsEnabled, boolean isDealer) {
        int price = 0;
        if (isDealer) {
            price += (advertAmount * 50);
        } else {
            price += (advertAmount * 20);
        }
        price += advertAmount * (productsEnabled * 10);
        return price;
    }

    public void billaguy(Customer customer) {
    }
}
