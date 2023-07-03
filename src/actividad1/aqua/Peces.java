package actividad1.aqua;
public class Peces extends Organismo {
    private String procedencia;
    private Dieta dieta;
    //cm
    private double longitud;
    public Peces(String nombre, String especie, Luz luz, double tempMax,
                 double tempMin, double phMax, double phMin, String procedencia,
                 Dieta dieta, double longitud) {
        super(nombre, especie, luz, tempMax, tempMin, phMax, phMin);
        this.procedencia = procedencia;
        this.dieta = dieta;
        this.longitud = longitud;
       // Dieta(String.valueOf(dieta));
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
    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public String Dieta(String x){
        String valor = "";
        if( x.equals("A")){
            valor = "Algas";
        } else if(x.equals("O")){
            valor = "Omnivoro";
        }else if(x.equals("H")){
            valor = "Hojas";        }
        return valor;
    }


    @Override
    public String toString() {
        return "\n  Pez:\n" +
                "Nombre: " + getNombre() + '\n' +
                "Especie: " + getEspecie() + '\n' +
                "Luz recomendada: " + Luces(String.valueOf(getLuz())) + '\n' +
                "PH Maximo: " + getPhMax() + '\n' +
                "PH Minimo: " + getPhMin() + '\n' +
                "Temperatura Maxima: " + getTempMax() + '\n' +
                "Temperatura Minima: " + getTempMin() + '\n' +
                "Procedencia: " + procedencia + '\n' +
                "Dieta: " + Dieta(String.valueOf(dieta)) + '\n' +
                "Longitud; " + longitud + " cm\n" +
                "\n***************************** "
                ;
    }



}
