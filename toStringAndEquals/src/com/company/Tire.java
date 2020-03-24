package com.company;

import java.util.Objects;

public class Tire {
    String name = "";
    int radius = 0;

    public Tire(String name, int radius){
        this.name = name;
        this.radius = radius;
    }

    /*
    Hier überschreiben wir die equals Methode von der Mutterklasse

    Die Mutterklasse vergleicht Standardmäßig nur if (this == o)
    Somit wäre ganz egal, wenn unsere beiden Reifenobjekte exakt dieselben
    Eigenschaften haben, für die equals sind das zwei Objektinstanzen und somit
    unterschiedlich. Die equals kann ja auch gar nicht wissen welche Eigenschaften
    zwei Objekte nun Semmantisch gleich sein lässt.
    Deshalb haben wir die Möglichkeit diese equals zu überschreiben und auf unsere Bedürfnisse
    anzupassen.

    In unserem Fall sagen wir, zwei Reifen sind gleich, wenn der Name und der Radius
    übereinstimmt.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tire tire = (Tire) o;
        return name.equals(tire.name) && radius == tire.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, radius);
    }

    /*
    Wir überschreiben von der Mutterklasse "Object" die toString() - Methode, welche
    uns Standardmäßig folgenden output liefert Klassenname@HexString(hashCode)

    Mit dem @Override sagen wir, das obige Standardausgabe überschrieben wird und wir
    unsere eigene Ausgabe definieren wollen.
    In unserem Fall wäre dann der output auf der Konsole z.B. Michelin R17
     */
    @Override
    public String toString() {
        return name + " R " + radius;
    }
}
