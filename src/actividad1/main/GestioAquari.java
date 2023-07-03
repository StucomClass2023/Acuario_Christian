package actividad1.main;

import actividad1.aqua.*;

public class GestioAquari {
    public static void main(String[] args) {

        Organismo pez1 = new Peces("Payaso", "Perciforme",
                Luz.M, 27, 24, 8.4, 8,
                "Oceano Pacific", Dieta.O, 15);

        Organismo planta1 = new Plantas("Aponogeton Longiplumulosus",
                "Aponogeton", Luz.M, 24, 21, 7.2,
                6.5, TipoPlanta.B);

        System.out.println(pez1);
        System.out.println(planta1);
    }
}
