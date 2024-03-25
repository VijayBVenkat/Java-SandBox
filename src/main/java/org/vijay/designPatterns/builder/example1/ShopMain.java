package org.vijay.designPatterns.builder.example1;

public class ShopMain {

    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setRam(8).setProcessor("SnapDragon").getPhone();
        System.out.println(p);
    }
}
