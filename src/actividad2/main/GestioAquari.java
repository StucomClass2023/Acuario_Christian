package actividad2.main;

import actividad2.aqua.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GestioAquari {
    public static void main(String[] args) {

        try {
            Organismo pez1 = new Peces("Payaso", "Perciforme",
                    Luz.M, 27.5, 24, 8.4, 8,
                    "Oceano Pacific", Dieta.O, 15);

            Organismo pez2 = new Peces("Piraña", "Pygocentrus nattereri",
                    Luz.M, 27, 23.5, 7.5, 5.5,
                    "Cuenca del Amazonas", Dieta.O, 15.5);

            Organismo pez3 = new Peces("Golden Dwarf Moray", "Gymnothorax melatremus",
                    Luz.M, 30, 22, 8.5, 7.9,
                    "Region Indo-Pacifica", Dieta.O, 23);

            Organismo planta1 = new Plantas("Echinodorus bleheri",
                    "Alismataceae", Luz.M, 27, 22.2, 7.5,
                    6.5, TipoPlanta.T);

            Organismo planta2 = new Plantas("Anubias",
                    "Araceae", Luz.B, 28, 22, 7.5,
                    6, TipoPlanta.R);

            Organismo planta3 = new Plantas("Aponogeton Longiplumulosus",
                    "Aponogeton", Luz.M, 24, 21, 7.2,
                    6.5, TipoPlanta.B);

            ArrayList<Organismo> organismos = new ArrayList<>(Arrays.asList(pez1, pez2, pez3, planta1,
                    planta2, planta3));

            organismos.forEach(System.out::println);
            System.out.println(Organismo.underline +
                    "Especies de peces Omnivoros en el Acuario: "
                    + Peces.getContadorOmnivoros());
            System.out.println(Organismo.underline + "Minima temperatura de los organismos en el acuario: " +
                    Organismo.getMinTempAcua() + "\nMaxima temperatura de los organismos en el acuario: " +
                    Organismo.getMaxTempAcua());
            System.out.println(Organismo.underline + "El PH minimo de los organismos en el acuario: " +
                    Organismo.getMinPhAcua() + "\nEl PH maximo de los organismos en el acuario: " +
                    Organismo.getMaxPhAcua());
        } catch(Exception e){
            System.out.println("Unexpected fatal error: " + e);
        }

    }
}
