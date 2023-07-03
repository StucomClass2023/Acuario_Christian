package actividad2.aqua;

public class Peces extends Organismo {
    private String procedencia;
    private Dieta dieta;
    private double longitud;
    private static int counterPez;
    private static int contadorOmnivoros;


    public Peces(String nombre, String especie, Luz luz, double tempMax,
                 double tempMin, double phMax, double phMin, String procedencia,
                 Dieta dieta, double longitud) throws IllegalArgumentException{
        super(nombre, especie, luz, tempMax, tempMin, phMax, phMin);
        if (procedencia == null || procedencia.trim().isEmpty()) {
            throw new IllegalArgumentException("Procedencia no puede ser null o " +
                    "quedar sin completar.");
        }
        this.procedencia = procedencia;
        this.dieta = dieta;
        if (longitud <= 0 || Double.isNaN(longitud)) {
            throw new IllegalArgumentException("Introduce un valor valido. No puede ser negativo o zero");
        }
            this.longitud = longitud;

        Organismo.minTempAcuario(tempMin);
        Organismo.maxTempAcuario(tempMax);
        Organismo.minPhAcuario(phMin);
        Organismo.maxPhAcuario(phMax);
    }
    public String getProcedencia() {
        return procedencia;
    }
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }
    public Dieta getDieta() {
        return dieta;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud){
            this.longitud = longitud;
    }
    public static int getContadorOmnivoros() {
        return contadorOmnivoros;
    }
    public static int getCounterPez() {
        return counterPez;
    }

    public String Dieta(String x){
        String valor = "";
        if( x.equals("A")){
            valor = "Algas";
        } else if(x.equals("O")){
            valor = "Omnivoro";
            contadorOmnivoros++;
        }else if(x.equals("H")){
            valor = "Hojas";        }
        return valor;
    }

    @Override
    public String toString() {
        return  "Organismo " + (++counterPez + Plantas.getCounterPlanta()) +" - Pez " + counterPez + ":" + underline +
                "Nombre: " + getNombre() + '\n' +
                "Especie: " + getEspecie() + '\n' +
                "Luz recomendada: " + Luces(String.valueOf(getLuz())) + '\n' +
                "PH Maximo: " + getPhMax() + '\n' +
                "PH Minimo: " + getPhMin() + '\n' +
                "Temperatura Maxima: " + getTempMax() + '\n' +
                "Temperatura Minima: " + getTempMin() + '\n' +
                "Procedencia: " + procedencia + '\n' +
                "Dieta: " + Dieta(String.valueOf(dieta)) + '\n' +
                "Longitud: " + longitud + " cm" +
                star
                ;
    }
}
