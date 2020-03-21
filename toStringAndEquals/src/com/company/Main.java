package com.company;

public class Main {

    /*
        Wenn ich den Code so wie unten sichtbar ausführe und "myTire"
        ind den output gebe, erhalte ich eine Ausgabe ähnlich dieser:
        com.company.Tire@6033aec5 ...   der Teil vor dem @ ist der namespace (com.company)
                                        und der Klassenname (Tire)
                                        der Teil nach dem @ ist je Objekt anders und entspricht
                                        dem HexString des HashCodes

        In Java erbt jede Klasse von "Object" und dieses Object bringt einige Funktionen mit sich.
        Um die Ausgabe nun lesbarer zu machen Überschreiben wir im Tire die "toString()" - Methode
        dieses Objects ... näheres in der Klasse Tire
     */
    public static void main(String[] args) {
        Tire myTire = new Tire("Michelin", 17);
        Tire myTire1 = new Tire("Michelin", 17);

        /*
        Da wir die toString überschrieben haben, sieht unser output
        nun so aus: Michelin R17
         */
        System.out.println(myTire);

        /*
        Da wir die equals überschrieben haben, ist unser Ergebnis nun true
        Michelin == Michelin && 17 == 17
         */
        boolean areEqual = myTire.equals(myTire1);
    }
}
