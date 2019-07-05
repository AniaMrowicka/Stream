package company;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        Product productFiat = new Product("Fiat Fullback", 82000);
        Product productSkoda = new Product("Skoda Octavia", 45000);
        Product productAudi = new Product("Audi A4", 90000);
        Product productFord = new Product("Ford mustang", 20000);
        Product productFiatTipo = new Product("Fiat Tipo", 52000);
        Product productCatering = new Product("Catering for event", 1300);
        Product productOfficeRent = new Product("Office rent", 25000);
        Product productFuelGasoline = new Product("Fuel, gasoline 95", 5.13);
        Product productFuelON = new Product("Fuel, oil", 5.02);
        Product productScrew = new Product("Screw", 3.2);
        Product productHammer = new Product("Hammer", 15.99);
        Product productPowerbank = new Product("Power bank", 15.99);
        Product productPhoneSamsung = new Product("Samsung Phone", 999.0);
        Product productPhoneApple = new Product("Apple Phone", 1299.99);
        Product productLaptopDell = new Product("Laptop, Dell Latitude", 1399.0);
        Product productLaptopApple = new Product("Laptop, Apple MacBook Pro", 1799.0);
        Product productServerDellPrecision = new Product("Server, Server Dell Precision", 2490.0);
        Product productPC = new Product("PC, Asus", 790.0);
        Product productCase = new Product("Case", 500.0);
        Product productSwitch = new Product("Network Switch", 130.0);
        Product productCoffeA = new Product("Coffee, Arabica", 29.99);
        Product productCoffeR = new Product("Coffee, Robusta", 39.99);
        Product productMug = new Product("Mug", 5.00);
        Product productPen = new Product("Pen", 0.99);
        Product productPencil = new Product("Pencil", 0.50);
        Product productClip = new Product("Clip", 2.49);
        Product productPuncher = new Product("Puncher", 0.79);
        Product productPaper = new Product("Paper", 9.99);
        Product productScisors = new Product("Scisors", 0.99);
        Product productFlour = new Product("Flour", 1.39);
        Product productSugar = new Product("Sugar", 1.87);
        Product productChocolate = new Product("Chocolate", 1.99);

        Company companyFallen = new Company("Fallen", "Detroit", 320, new ArrayList<>(Arrays.asList(
                new Purchase(productFiat, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 4), 18.1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 23.9, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 18), 41.8, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 37.2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 7.3, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 29), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 2), 21.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 43.3, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 10), 13.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 25.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 38.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 111.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 59.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 230.3, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 26), 18.3, UNIT.UNIT),

                new Purchase(productCoffeA, LocalDate.of(2018, 2, 15), 10.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 20), 10.0, UNIT.UNIT)
        )));

        Company companyPetersWifesCookies = new Company("Peters wifes cookies", "London", 12, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 25, UNIT.KILOGRAM),

                new Purchase(productFlour, LocalDate.of(2018, 1, 7), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 14), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 21), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 1, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 21), 25, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 7), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 14), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 21), 7, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 28), 7, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 15), 25, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productFlour, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 6), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 13), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 20), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 27), 10, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 28), 10, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 28), 25, UNIT.KILOGRAM)
        )));

        Company companyTheOffice = new Company("Dunder Mifflin", "Detroit", 17, new ArrayList<>(Arrays.asList(
                new Purchase(productPaper, LocalDate.of(2018, 1, 1), 20.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 4), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 5), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 6), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 7), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productScisors, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 10), 20, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 11), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 12), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 14), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 18), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 19), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 13.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 1, 20), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 20), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 1, 21), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 25), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 26), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 27), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 28), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 29), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 30), 20.0, UNIT.UNIT),

                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 2), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 4), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 5), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 6), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 7), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 8), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 9), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 10), 20.0, UNIT.UNIT),

                new Purchase(productScisors, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPuncher, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productClip, LocalDate.of(2018, 2, 10), 50, UNIT.UNIT),
                new Purchase(productMug, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 10), 20, UNIT.KILOGRAM),

                new Purchase(productPaper, LocalDate.of(2018, 2, 11), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 12), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 13), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 14), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 15), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 16), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 17), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 18), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 19), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 20), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 21), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 22), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 23), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 24), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 25), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 26), 13.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 27), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 20.0, UNIT.UNIT)
        )));

        Company transporting = new Company("Take me home", "London", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productSkoda, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFiatTipo, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productAudi, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 330.32, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 5), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 7), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 9), 325.13, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 29), 325.13, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 1), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 3), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 5), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 7), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 9), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 11), 325.17, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 13), 325.18, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 302.82, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 17), 321.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 19), 395.93, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 21), 330.32, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 23), 327.58, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 25), 317.44, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 27), 332.11, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 325.13, UNIT.UNIT)
        )));

        Company companyTonysHardware = new Company("Tony's hardware", "Detroit", 2, new ArrayList<>(Arrays.asList(
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productScrew, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productHammer, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productFord, LocalDate.of(2018, 2, 20), 2, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 20), 70.0, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 13), 20.0, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 35.0, UNIT.UNIT)
        )));

        Company companyTailor = new Company("Tailor Swift", "New York City", 3, new ArrayList<>(Arrays.asList(
                new Purchase(productScisors, LocalDate.of(2018, 1, 1), 3, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 3, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 2, UNIT.KILOGRAM),

                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productPen, LocalDate.of(2018, 1, 13), 3, UNIT.UNIT),
                new Purchase(productPencil, LocalDate.of(2018, 1, 18), 3, UNIT.UNIT)
        )));

        Company companyGoogleDublin = new Company("Google", "Dublin", 91, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 91, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 91, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 20), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 3), 20, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 91, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 91, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 5, UNIT.UNIT)
        )));


        Company companyGoogleLondon = new Company("Google", "London", 76, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 20, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 76, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 76, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 28), 50.0, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 76, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 4, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 4, UNIT.UNIT)
        )));


        Company companyGoogleKijev = new Company("Google", "Kijev", 23, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 30), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 5), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 15), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 28), 23, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 3), 30.0, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));


        Company companyFintech = new Company("Fintech", "London", 9, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 5), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT)
        )));

        Company companyFintechNewYork = new Company("Fintech", "New York City", 19, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 5), 10, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 5), 7, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 23, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 2, 1), 23, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productPowerbank, LocalDate.of(2018, 1, 1), 10, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 2, 1), 15.0, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 10), 3, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productPhoneSamsung, LocalDate.of(2018, 2, 10), 4, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 1, 15), 2, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT)
        )));

        Company bakeryDetroit = new Company("Detroit Bakery", "Detroit", 11, new ArrayList<>(Arrays.asList(
                new Purchase(productFlour, LocalDate.of(2018, 1, 1), 200, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 1), 50, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 1, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 1), 132.53, UNIT.UNIT),
                new Purchase(productFlour, LocalDate.of(2018, 2, 1), 190, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 62, UNIT.KILOGRAM),
                new Purchase(productSugar, LocalDate.of(2018, 2, 1), 79, UNIT.KILOGRAM)
        )));

        Company baltimoreFishing = new Company("Fisz", "Baltimore", 5, new ArrayList<>(Arrays.asList(
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 3), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 1, 30), 500, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 20), 500, UNIT.UNIT),
                new Purchase(productSwitch, LocalDate.of(2018, 1, 20), 500, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 15), 500, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 15), 100, UNIT.UNIT),
                new Purchase(productFuelGasoline, LocalDate.of(2018, 2, 28), 500, UNIT.UNIT)
        )));

        Company solwit = new Company("Solwit", "Kijev", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productAudi, LocalDate.of(2018, 1, 2), 2, UNIT.UNIT),
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 2), 89, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 12), 73.13, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 1, 29), 67.33, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 13), 91.44, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 1), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 2), 1, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 3), 1, UNIT.UNIT),
                new Purchase(productPaper, LocalDate.of(2018, 1, 23), 20.0, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 2, 4), 1, UNIT.UNIT),
                new Purchase(productFuelON, LocalDate.of(2018, 2, 25), 47.12, UNIT.UNIT)

        )));

        Company solwitGda = new Company("Solwit", "Gdansk", 68, new ArrayList<>(Arrays.asList(
                new Purchase(productPC, LocalDate.of(2018, 1, 2), 5, UNIT.UNIT),
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 10), 20.0, UNIT.UNIT),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 7), 1.0, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 1.0, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 2, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 2, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT)
        )));

        Company intelD = new Company("Intel", "Detroit", 755, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 1, 10), 10, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 1), 100, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 3), 23.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 100, UNIT.KILOGRAM),
                new Purchase(productLaptopDell, LocalDate.of(2018, 1, 15), 10, UNIT.UNIT),
                new Purchase(productCase, LocalDate.of(2018, 2, 20), 10, UNIT.UNIT)
        )));

        Company intelGda = new Company("Intel", "Gdansk", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        Company intelKij = new Company("Intel", "Kijev", 161, new ArrayList<>(Arrays.asList(
                new Purchase(productServerDellPrecision, LocalDate.of(2018, 1, 1), 50, UNIT.UNIT),
                new Purchase(productLaptopApple, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productPhoneApple, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productCatering, LocalDate.of(2018, 1, 1), 5, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 1, 1), 100, UNIT.UNIT),
                new Purchase(productOfficeRent, LocalDate.of(2018, 2, 1), 100, UNIT.UNIT),
                new Purchase(productCoffeA, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productCoffeA, LocalDate.of(2018, 2, 5), 50, UNIT.KILOGRAM),
                new Purchase(productChocolate, LocalDate.of(2018, 2, 1), 15, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 1, 5), 30, UNIT.KILOGRAM),
                new Purchase(productPaper, LocalDate.of(2018, 1, 9), 20.0, UNIT.UNIT),
                new Purchase(productCoffeR, LocalDate.of(2018, 2, 1), 10, UNIT.KILOGRAM)

        )));

        List<Company> companies = new ArrayList<>(Arrays.asList(
                companyFallen,
                companyPetersWifesCookies,
                companyTheOffice,
                transporting,
                companyTonysHardware,
                companyTailor,
                companyGoogleDublin,
                companyGoogleLondon,
                companyGoogleKijev,
                companyFintech,
                companyFintechNewYork,
                bakeryDetroit,
                baltimoreFishing,
                solwitGda,
                solwit,
                intelD,
                intelGda,
                intelKij
        ));
        System.out.println("Zadanie 1");
        listOfCompanies(companies);
        System.out.println("Zadanie 2");
        listOfCompaniesFromDetroit(companies);
        System.out.println("Zadanie 3");
        listOfCompaniesFromLondonAndSort(companies);
        System.out.println("Zadanie 4");
        listOfCompaniesFromWarsawAndSort(companies);
        System.out.println("Zadanie 5");
        System.out.println("Firma z Kijowa z najmniejsza liczbą pracowników to: " +companyWhereWorkersFromKijow(companies));
        System.out.println("Zadanie 6");
        System.out.println("Firma z najkrótszą nazwą to: "+ companyWithShortName(companies));
        System.out.println("Zadanie 7");
        System.out.println(listOfCompaniesNotFromLondon(companies));
        System.out.println("Zadanie 8");
        companyWith(companies);
        System.out.println("Zadanie 9");
        System.out.println("Zadanie 10");

    }


    // Polecenie 1:
// Dane to Firmy oraz ich zakupy z miesiąca styczeń/luty 2018.
// Wszystkie rozwiązania zapisz w oddzielnych metodach statycznych w klasie Main.
// 1. Wylistuj (system out println) wszystkie firmy
//        company_1_wylistuj(companies);
    private static void listOfCompanies(List<Company> companies) {
        companies
                .forEach(System.out::println);
    }

    // 2. Wylistuj wszystkie firmy które są z Detroit
    private static void listOfCompaniesFromDetroit(List<Company> companies) {
        companies.stream()
                .filter(det -> det.getCityHeadquarters().equalsIgnoreCase("Detroit"))
                .forEach(System.out::println);
    }

    // 3. Wylistuj wszystkie firmy z Londynu, posortuj je po ilości pracowników (rosnąco).
    private static void listOfCompaniesFromLondonAndSort(List<Company> companies) {
        Comparator<Company> compareWorkers = Comparator
                                                    .comparing(Company::getEmployees);
        companies.stream()
                .filter(lon -> lon.getCityHeadquarters().equalsIgnoreCase("London"))
                .sorted(compareWorkers)
                .forEach(System.out::println);
    }

    // 4. Wylistuj wszystkie firmy z Warszawy. Posortuj je po ilości zakupów (rosnąco) i ilości pracowników (malejąco).
    private static void listOfCompaniesFromWarsawAndSort(List<Company> companies) {
         companies.stream()
                .filter(w -> w.getCityHeadquarters().equalsIgnoreCase("Warsav"))
                .sorted(Comparator.comparingInt((data1) ->
                    data1.getPurchaseList().size()))
                 .sorted(Comparator.comparing(Company::getEmployees).reversed())
        .forEach(System.out::println);
// nie ma firm z Warszawy
}

    // 5. Zwróć firmę z największą ilością pracowników, która pochodzi z Kijowa.
    private static Company companyWhereWorkersFromKijow(List<Company> companies) {
        return companies.stream()
                .filter(c -> c.getCityHeadquarters().equalsIgnoreCase("Kijev"))
                .max(Comparator.comparing(Company::getEmployees))
                .get();
    }
// 6. Zwróć firmę z najkrótszą nazwą

    private static Company companyWithShortName(List<Company> companies) {
        return companies.stream()
                .min(Comparator.comparing(name -> name.getName().length()))
                .get();
    }
    // 7. Zwróć firmę która nie pochodzi z Kijowa, Londynu i Detroit, która ma najmniej kupionych produktów.

    private static Company listOfCompaniesNotFromLondon(List<Company> companies) {

        return companies.stream()
                .filter(w -> !w.getCityHeadquarters().equalsIgnoreCase("Kijev"))
                .filter(w -> !w.getCityHeadquarters().equalsIgnoreCase("London"))
                .filter(w -> !w.getCityHeadquarters().equalsIgnoreCase("Detroit"))
                .min(Comparator.comparing(data ->
                    data.getPurchaseList().size()))
                .get();
}
    // 8. Każdej firmie dodaj po 1 pracowniku, jeśli pochodzi z Kijowa lub Detroit
    private static void companyWith(List<Company> companies) {
    companies.stream()
                .filter(x -> x.getCityHeadquarters().equalsIgnoreCase("Detroit") ||
                        x.getCityHeadquarters().equalsIgnoreCase("Kijev"))
                .map(data -> {
                    Company newComp = new Company(data.getName(),data.getCityHeadquarters(), data.getEmployees(),
                            data.getPurchaseList());
                    newComp.setEmployees(data.getEmployees()+1);
                    return newComp;
                })
            .forEach(System.out::println);


        }
// 9. ** Zwróć MAPĘ w której kluczem jest nazwa firmy, a wartością ilość pracowników w tej firmie (https://howtodoinjava.com/java8/collect-stream-to-map/)
//private static Map<String, Integer> convertListToMapKeyIsCompanyName(List<Company> companies) {
//       Map<String, Integer> companyMap = companies.stream()
//                                      .collect(Collectors.groupingBy(Company::getName));
//
//       return companyMap;
//    }
// 10.** Zwróć Mapę w której kluczem jest miejscowość a wartością jest LISTA FIRM z tamtej miejscowości (Map<String, List<Company>) (https://stackoverflow.com/questions/24917053/collecting-hashmapstring-liststring-java-8)
// 11. Zwróć firmę która dokonała zakupów na największą kwotę
//        company_11_zakupy_najwieksze(companies);
// 12. Zwróć firmę która kupiła najwięcej produktów za kwotę wyższą niż 10 k
//        company_12_zakupy_10k(companies);
// 13. *Zwróć miejscowość która wydała najwięcej pieniędzy. Stwórz mapę Map<String, Double> gdzie kluczem jest miejscowość, a wartością jest kwota wydana przez firmy pochodzące z tamtej miejscowości
//        company_13_najwiecej_hajsu(companies);
// 14. Wypisz firmy które 15 stycznia 2018 kupiły "Network Switch"
//        company_14_network(companies);
// 15. Znajdź firmę która kupuje najwięcej kawy

// 16. Wypisz ile łącznie zostało kupionej kawy Arabica w miesiącu styczniu
//        company_16_arabica_january(companies);
// 17. Wypisz ile łącznie kawy (Arabica i Roubsta) zostało kupionej w dni parzyste.
//        company_17_arabica_robusta_even(companies);
// 18. Zwróć Mapę (Map<Product, Set<Company>>) w której kluczem jest typ kawy (powinny być dwie, Arabica i Robusta) i wartością są listy firm które kupiły podaną kawę chociaż raz.
//        company_18_mapa_kaw(companies);
// 19. Zwróć firmę która w styczniu kupiła najwięcej paliwa (ropy)
//        company_19_most_oil_january(companies);
// 20. Zwróć firmę której proporcja wydanych pieniędzy do ilości pracowników jest najwyższa
//        company_20_money_vs_employees(companies);
// 21. Zwróć firmę która najwięcej wydaje na artykuły biurowe
//        company_21_most_sheeets(companies);
// 22. Zwróć firmy posortowane po ilości wydanych pieniędzy na paliwo
//        company_22_sort_money(companies);
// 23. Zwróć wszystkie produkty które kupione były na kilogramy
//        company_23_wszystkie_produkty_na_kilogramy(companies);
// 24. Zwróć listę zakupów (obiektów purchase) kupionych przez firmy z Detroit w miesiącu lutym. posortuj je po kwocie.
//        company_24_detroit_shopping_in_february(companies);
// 25. Zwróć ilość biur które wynajęte były w miesiącu lutym.
//        company_25_rent_in_february(companies);
// 26. Zwróć Mapę (Map<Company, Integer>). w mapie umieść wpisy Firma - > ilość biur które wynajęły w dowolnym okresie.
//        company_26_company_and_offices(companies);
// 27. *Wypisz "Nazwa firmy: XYZ, ilość zakupionych telefonów apple: X" dla każdej firmy która kupiła telefon apple. Wypisy powinny być posortowane (na szczycie powinna być firma która kupiła ich najwięcej).
//        company_27_apple_lovers(companies);
// 28. Znajdź firme która posiada siedzibę w więcej niż jednym mieście. Posortuj firmy po ilości siedzib, wypisz tylko te które mają więcej niż 1 siedzibę.
//        company_28_rich_multi_city_companies(companies);
// 29. Wypisz ilość kilogramów cukru zużywaną przez "Detroit Bakery"
//        company_29_detroit_bakery(companies);
// 30. Wypisz wszystkie zakupy firmy "Solwit".
//        company_30_solwit_shopping(companies);
// 31. Wypisz wszystkie produkty które są tańsze (jednostkowo) niż 3$.
// 32. Wypisz ile sprzedano najtańszego produktu
// 33. Firma "Take me home" zajmuje się transportem. Na początku działalności kupiła wiele samochodów do użytku. Oblicz ile litrów paliwa (średnio) spalają ich samochody (zakładamy że wszystkie palą benzynę i że tankowane są wszystkie.
// 34. Wypisz firmę która zużywa najwięcej kawy
// 35. Wypisz firmę która zużywa najwięcej na papier.
// 36. Wypisz wszystkie produkty które były kupowane w większych ilościach niż 50 (jednostek/kilogramów)
// 37. Wypisz ile każda z firm zużywa na kawę (ile pieniędzy wydaje) (jako wynik zwróć mapę Map<String, Double> gdzie kluczem jest nazwa firmy, wartością jest ilość pieniędzy wydawanej na kawę
// 38. Wypisz średnie zużycie kawy na pracownika (wypisz w postaci proporcji. Jeśli firma kupiła 30 kilogramów i ma 20 pracowników to ma 1.5 kg / pracownika [w całości okresu])
// 39. Wypisz jaki produkt poza paliwem cieszy się największą popularnością (zwróć go) (find first)
// 40. Znajdź produkty które były kupowane zarówno w kilogramach jak i w sztukach
// 40. Wymyśl 5 ciekawych zapytań i spróbuj je zrealizować. Najciekawsze polecenie otrzyma nagrodę-niespodziankę z Baltimore :P


    private static void company_30_solwit_shopping(List<Company> companies) {
        companies
                .stream()
                .filter(c -> c.getName().equalsIgnoreCase("solwit"))
                .flatMap(c -> c.getPurchaseList().stream())
                .forEach(System.out::println);
    }

    private static void company_29_detroit_bakery(List<Company> companies) {
        double sum = companies
                .stream()
                .filter(c -> c.getName().equalsIgnoreCase("Detroit Bakery"))
                .mapToDouble(c -> c.getPurchaseList()
                        .stream()
                        .filter(p -> p.getProduct().getName().equalsIgnoreCase("sugar"))
                        .mapToDouble(Purchase::getQuantity)
                        .sum())
                .sum();

        System.out.println("Sum of sugar used by Detroit Bakery equals: " + sum);
    }

    private static void company_28_rich_multi_city_companies(List<Company> companies) {
//        Map<String, List<String>> companyIntegerMap = companies
//                .stream()
//                .collect(Collectors.groupingBy(
//                        c -> c.getName(),
//                        Collectors.mapping(c -> c.getCityHeadquarters(), Collectors.toList())))
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(value -> value.size())))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//        companyIntegerMap
//                .entrySet()
//                .stream()
//                .filter(stringListEntry -> stringListEntry.getValue().size() > 1)
//                .forEach(stringListEntry -> System.out.println("Firma: " + stringListEntry.getKey() + " " + stringListEntry.getValue().size()));


        Map<String, Long> companyIntegerMap = companies
                .stream()
                .collect(Collectors.toMap(
                        c -> c.getName(),
                        c -> companies
                                .stream()
                                .filter(company -> company.getName().equalsIgnoreCase(c.getName()))
                                .map(Company::getCityHeadquarters).count(),
                        (o, o2) -> (o)
                ));

        companyIntegerMap
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .forEach(stringLongEntry -> System.out.println(stringLongEntry.getKey() + " " + stringLongEntry.getValue()));
    }

    private static void company_27_apple_lovers(List<Company> companies) {

        // żeby móc zachować ILOŚĆ kupionych produktów przeniosę sobie wszystko ze streamu do mapy, w której wartością będzie
        // ilość zakupionych telefonów przez podaną firmę.
        Map<Company, Double> companiesSortedByAppleLovers = companies.stream()
                // filtr który przepuści tylko firmy które kupiły telefon appla
                .filter(company -> company.getPurchaseList().stream().anyMatch(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Apple Phone")))
                // zbieramy firmy do mapy, tutaj w wartości ustawiamy stream który z podanej firmy zlicza i wyciąga nam ilość zakupionych telefonów apple
                .collect(Collectors.toMap(
                        c -> c,
                        company -> company
                                .getPurchaseList()
                                .stream()
                                // filtr po nazwie produktu
                                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Apple Phone"))
                                // mapujemy ile danego produktu kupiono.
                                .mapToDouble(pur -> pur.getQuantity())
                                // sumujemy (w danej firmie)
                                .sum()))
                .entrySet()
                .stream()
                // żeby posortować (po wartości) używamy comparator'a i reverse, bo domyślnie sortuje rosnąco
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                // na koniec dodajemy rekordy do linkedhashmap - ważne, żeby zachować kolejność wstawiania (Linked*)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        // wypisanie wyniku.
        companiesSortedByAppleLovers.entrySet().forEach(c -> System.out.println(c.getKey().getName() + " " + c.getValue()));
    }

    private static void company_26_company_and_offices(List<Company> companies) {
        Map<Company, Integer> comps = companies.stream()
                .collect(Collectors.toMap(
                        company -> company,
                        company -> company.getPurchaseList()
                                .stream()
                                // filtr nazwy produktu
                                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                                // każdy purchase jest zamieniany na ilość wykupionych produktów (odfiltrowanych)
                                .mapToInt(purchase -> (int) purchase.getQuantity())
                                .sum()));

        // żeby wykorzystać binaryoperator (merger)
        // zmieniliśmy trochę stream.
        // kluczem jest nazwa firmy (która jest nieunikalna!) więc pod ten sam klucz trafi kilka wartości
        // to, czego dokonujemy w ostatniej linii:
//        (o, o2) -> o + o2));
        // to kryterium "co zrobić z wartościami jeśli pod tym samym kluczem będzie więcej niż tylko jedna wartość
        // nasze kryterium dokonuje sumowania - ponieważ chcę dowiedzieć się ile firma Intel wynajęła w sumie biur.
        Map<String, Integer> compsNames = companies.stream()
                .collect(Collectors.toMap(
                        company -> company.getName(),
                        company -> company.getPurchaseList()
                                .stream()
                                // filtr nazwy produktu
                                .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                                // każdy purchase jest zamieniany na ilość wykupionych produktów (odfiltrowanych)
                                .mapToInt(purchase -> (int) purchase.getQuantity())
                                .sum(),
                        (o, o2) -> o + o2));

//        comps.forEach((company, iloscBiurWDowolnymOkresie) -> System.out.println(company.getName() + " biur: " + iloscBiurWDowolnymOkresie));
        compsNames.forEach((companyName, iloscBiurWDowolnymOkresie) -> System.out.println(companyName + " biur: " + iloscBiurWDowolnymOkresie));
    }

    private static void company_25_rent_in_february(List<Company> companies) {
        double wynik = companies.stream()
                .mapToDouble(company -> company.getPurchaseList()
                        .stream()
                        // filtr miesiąca
                        .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 2)
                        // filtr nazwy produktu
                        .filter(purchase -> purchase.getProduct().getName().equalsIgnoreCase("Office rent"))
                        // każdy purchase jest zamieniany na ilość wykupionych produktów (odfiltrowanych)
                        .mapToDouble(purchase -> purchase.getQuantity())
                        // sumujemy te ilości
                        // wynik (suma) poniżej to ilość biur wynajętych przez każdą kolejną firmę
                        .sum())
                .sum();
        System.out.println("Wynik: " + wynik);
    }

    private static void company_24_detroit_shopping_in_february(List<Company> companies) {
        List<Purchase> products = companies
                .stream()
                // filtrujemy firmy po headquarters
                .filter(company -> company.getCityHeadquarters().equalsIgnoreCase("detroit"))
                .flatMap(company -> company.getPurchaseList()
                        .stream()
                        // filtrujemy zakupy po miesiącu lutym
                        .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 2))
                .sorted(Comparator
                        // sortujemy po wartości = price * quantity
                        .comparingDouble(pur -> pur.getProduct().getPrice() * pur.getQuantity()))
                // zbieramy wszystkie purchase
                .collect(Collectors.toList());

        products.forEach(purchase ->
                System.out.println(purchase.getProduct().getName() + " na kwote " + (purchase.getProduct().getPrice() * purchase.getQuantity())));
    }

    private static void company_21_most_sheeets(List<Company> companies) {
        Optional<Company> oc = companies
                .stream()
                .max(Comparator.comparingDouble(
                        c -> c.getPurchaseList()
                                .stream()
                                .filter(purchase ->
                                        purchase.getProduct().getName().equalsIgnoreCase("pen") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("pencil") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("paper") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("clip") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("scisors") ||
                                                purchase.getProduct().getName().equalsIgnoreCase("puncher"))
                                .mapToDouble(value -> value.getQuantity() * value.getProduct().getPrice())
                                .sum()));
        if (oc.isPresent()) {
            Company c = oc.get();
            System.out.println(c.getName());
        }
    }

    private static void company_19_most_oil_january(List<Company> companies) {
        Optional<Company> oc = companies
                .stream()
                .max(Comparator.comparingDouble(
                        c -> c.getPurchaseList()
                                .stream()
                                .filter(p -> p.getProduct().getName().equalsIgnoreCase("Fuel, oil"))
                                .filter(purchase -> purchase.getPurchaseDate().getMonthValue() == 1)
                                .mapToDouble(p -> p.getQuantity())
                                .sum()));
        if (oc.isPresent()) {
            Company c = oc.get();
            System.out.println(c.getName() + " ");
        }
    }

    private static void company_20_money_vs_employees(List<Company> companies) {
        // poprawne rozwiązanie, podejście1.
        // zgodne z treścią
//        Optional<Company> company = companies.stream()
//                .max(Comparator.comparingDouble(
//                        c -> c.getPurchaseList()
//                                .stream()
//                                .mapToDouble(purchase -> purchase.getQuantity() * purchase.getProduct().getPrice())
//                                .sum() / c.getEmployees()));

        // wynikiem będzie mapa firm, oraz wartości tego (ile wydali/ilosc pracownikow) - czyli szukana proporcja
        Map<Company, Double> companyX = companies.stream()
                .collect(Collectors.toMap(
                        c -> c,
                        c -> c.getPurchaseList()
                                .stream()
                                .mapToDouble(purchase -> purchase.getQuantity() * purchase.getProduct().getPrice())
                                .sum() / c.getEmployees()));

        companyX.forEach((company1, proporcja) -> System.out.println(company1.getName() + " = " + proporcja));
    }

    private static void company_23_wszystkie_produkty_na_kilogramy(List<Company> companies) {
//        Set<Product> products = companies.stream()
//                // firmy iterujemy i wyciągamy z nich listy purchase
//                .map(co -> co.getPurchaseList()
//                        .stream()
//                        // odfiltrowuje po unit
//                        .filter(purchase -> purchase.getUnit() == UNIT.KILOGRAM)
//                        // zaminieam purchase na liste produktów, wynikiem streamu wenątrz jest set produktów
//                        .map(purchase -> purchase.getProduct()).collect(Collectors.toSet()))
//                .flatMap(productsList -> productsList.stream())
//                .collect(Collectors.toSet());

        Set<Product> products = companies.stream()
                // firmy iterujemy i wyciągamy z nich listy purchase
                .flatMap(co -> co.getPurchaseList()
                        .stream()
                        // odfiltrowuje po unit
                        .filter(purchase -> purchase.getUnit() == UNIT.KILOGRAM)
                        // zaminieam purchase na liste produktów, wynikiem streamu wenątrz jest set produktów
                        .map(purchase -> purchase.getProduct()))
                .collect(Collectors.toSet());

        products.forEach(product -> System.out.println(product.getName() + " "));
    }

    private static void company_22_sort_money(List<Company> companies) {
        Map<Company, Double> moneyForNothing = companies.stream().collect(Collectors.toMap(
                co -> co,
                co -> co.getPurchaseList()
                        .stream()
                        .filter(p -> p.getProduct().getName().startsWith("Fuel"))
                        .mapToDouble(p -> p.getQuantity() * p.getProduct().getPrice()).sum()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1 + e2, LinkedHashMap::new));

        moneyForNothing.entrySet().forEach(companyDoubleEntry -> System.out.println(companyDoubleEntry.getKey().getName() + " " + companyDoubleEntry.getValue()));
    }

    private static void company_17_arabica_robusta_even(List<Company> companies) {
        double sum = companies.stream()
                .flatMap(c -> c.getPurchaseList()
                        .stream()
                        .filter(p -> (p.getProduct().getName().equalsIgnoreCase("Coffee, Arabica") || p.getProduct().getName().equalsIgnoreCase("Coffee, Robusta")) && p.getPurchaseDate().getDayOfMonth() % 2 == 0))
                .mapToDouble(Purchase::getQuantity).sum();

        System.out.println("Total amount of coffee bought on even days, by all companies equals: " + sum + " kg");
    }

    private static void company_16_arabica_january(List<Company> companies) {
        double sum = companies.stream()
                .flatMap(c -> c.getPurchaseList().stream().filter(p -> p.getProduct().getName().equalsIgnoreCase("Coffee, Arabica") && p.getPurchaseDate().getMonth().getValue() == 1))
                .mapToDouble(Purchase::getQuantity).sum();

        System.out.println("Total amount of Coffee Arabica bought in January equals: " + sum + " kg");
    }

    private static void company_14_network(List<Company> companies) {
        companies
                .stream()
                .filter(c -> c.getPurchaseList().stream().anyMatch(p -> p.getPurchaseDate().isEqual(LocalDate.of(2018, 1, 15)) && p.getProduct().getName().equalsIgnoreCase("network switch")))
                .forEach(c -> System.out.println(c.getName() + " " + c.getCityHeadquarters()));
    }

    private static void company_18_mapa_kaw(List<Company> companies) {
        List<Product> products = companies.stream()
                .map(comp -> comp.getPurchaseList())
                .flatMap(purchases -> purchases.stream())
                .map(purchase -> purchase.getProduct())
                .filter(product -> product.getName().startsWith("Coffee,"))
                .collect(Collectors.toList()); // typy kawy

        Map<Product, Set<Company>> companiesWhoDrinkCoffee = products.stream()
                .collect(Collectors.toMap(
                        product -> product,
                        product -> companies.stream() // dla produktu, sprawdz czy
                                .filter(company -> company.getPurchaseList().stream() // w liscie znajduje produkt o tej nazwie
                                        .anyMatch(purchase -> purchase.getProduct() == product)).collect(Collectors.toSet()),
                        (e1, e2) -> {
                            Set<Company> companiess = new HashSet<>(e1);
                            companiess.addAll(e2);
                            return companiess;
                        }));


        System.out.println(companiesWhoDrinkCoffee);
    }

    private static void company_13_najwiecej_hajsu(List<Company> companies) {
        /*Map<String, Double> wydanehajsy = */
        Set<String> miescowosci = companies.stream().map(company -> company.getCityHeadquarters()).collect(Collectors.toSet());

        Map<String, Double> wydanehajsy = miescowosci.stream().collect(Collectors.toMap(
                m -> m,
                m -> companies.stream()
                        .filter(company -> company.getCityHeadquarters().equals(m))
                        .mapToDouble(c ->
                                c.getPurchaseList().stream().mapToDouble(p -> p.getQuantity() * p.getProduct().getPrice()).sum()).sum()));

        System.out.println(wydanehajsy);
    }

    private static void company_12_zakupy_10k(List<Company> companies) {
        Optional<Company> firma = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList().stream()
                                .filter(purchase -> purchase.getProduct().getPrice() > 10000)
                                .mapToDouble(purchase -> purchase.getQuantity()).sum()));
        System.out.println(firma);
    }

    private static void company_11_zakupy_najwieksze(List<Company> companies) {
        Optional<Company> firma = companies.stream()
                .max(Comparator.comparingDouble(
                        company -> company.getPurchaseList().stream()
                                .mapToDouble(purchase -> purchase.getQuantity() * purchase.getProduct().getPrice()).sum()));
        System.out.println(firma);
    }

    private static void company_1_wylistuj(List<Company> companies) {
        companies.forEach(System.out::println);
    }
}
