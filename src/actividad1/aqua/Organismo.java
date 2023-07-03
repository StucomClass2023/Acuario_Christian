package actividad1.aqua;

public class Organismo {
    private String nombre, especie;
    private Luz luz;
    private double tempMax, tempMin, phMax,  phMin;

    public Organismo() {
    }
    public Organismo(String nombre, String especie, Luz luz, double tempMax,
                     double tempMin, double phMax, double phMin) {
        this.nombre = nombre;
        this.especie = especie;
        this.luz = luz;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.phMax = phMax;
        this.phMin = phMin;
    }

    public  String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public  String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public  Luz getLuz() {
        return luz;
    }
    public  double getTempMax() {
        return tempMax;
    }
    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }
    public  double getTempMin() {
        return tempMin;
    }
    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }
    public  double getPhMax() {
        return phMax;
    }
    public void setPhMax(double phMax) {
        this.phMax = phMax;
    }
    public  double getPhMin() {
        return phMin;
    }
    public void setPhMin(double phMin) {
        this.phMin = phMin;
    }

    public String Luces(String x){
        String valor = "";
        if( x.equals("A")){
            valor = "Necesidades altas de luz";
        } else if(x.equals("M")){
            valor = "Necesidades medias de luz";
        }else if(x.equals("B")){
            valor = "Necesidades bajas de luz";        }
        return valor;
    }

}
