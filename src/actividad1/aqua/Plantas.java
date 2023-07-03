package actividad1.aqua;

public class Plantas extends Organismo {
    private TipoPlanta tipo;

    public Plantas(String nombre, String especie, Luz luz,
                   double tempMax, double tempMin, double phMax,
                   double phMin, TipoPlanta tipo) {
        super(nombre, especie, luz, tempMax, tempMin, phMax, phMin);
        this.tipo = tipo;
    }
    public String Tipo(String x){
        String valor = "";
        if( x.equals("T")){
            valor = "Tija";
        } else if(x.equals("B")){
            valor = "Bulbo";
        }else if(x.equals("R")){
            valor = "Raices";        }
        return valor;
    }

    @Override
    public String toString() {
        return "\n  Planta:\n" +
                "Nombre: " + getNombre() + '\n' +
                "Especie: " + getEspecie() + '\n' +
                "Luz recomendada: " + Luces(String.valueOf(getLuz())) + '\n' +
                "PH Maximo: " + getPhMax() + '\n' +
                "PH Minimo: " + getPhMin() + '\n' +
                "Temperatura Maxima: " + getTempMax() + '\n' +
                "Temperatura Minima: " + getTempMin() + '\n' +
                "Tipo de planta: " + Tipo(String.valueOf(tipo))
                + "\n***************************** "
               ;
    }

}
