//package sellingVehicles;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class BillTest {
//
//    @Test
//    public void givenA20AdDealerWithOneProductShouldBeBilled1200(){
//        int advertAmount = 20;
//        int productsEnabled = 1;
//        Customer customer = new Customer();
//        Bill bill = new Bill();
//        bill.billaguy(customer);
//        Assert.assertEquals(1200,bill.generateBill(advertAmount,productsEnabled,isDealer));
//    }
//
//    @Test
//    public void givenA1000AdDealerWithTwoProductShouldBeBilled70000(){
//        int advertAmount = 1000;
//        int productsEnabled = 2;
//        boolean isDealer = true;
//        Bill bill = new Bill();
//        Assert.assertEquals(70000,bill.generateBill(advertAmount,productsEnabled,isDealer));
//    }
//
//    @Test
//    public void givenA3AdPrivateWithNoProductShouldBeBilled60(){
//        int advertAmount = 3;
//        int productsEnabled = 0;
//        boolean isDealer = false;
//        Bill bill = new Bill();
//        Assert.assertEquals(60,bill.generateBill(advertAmount,productsEnabled,isDealer));
//    }
//
//    @Test
//    public void givenA1AdPrivateWith1ProductShouldBeBilled30(){
//        int advertAmount = 1;
//        int productsEnabled = 1;
//        boolean isDealer = false;
//        Bill bill = new Bill();
//        Assert.assertEquals(30,bill.generateBill(advertAmount,productsEnabled,isDealer));
//    }
//}