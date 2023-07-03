package actividad2.aqua;

public class Organismo {
    private String nombre, especie;
    private Luz luz;
    private double tempMax, tempMin, phMax, phMin;
    public static String star = "\n************************************";
    public static String underline = "\n====================================\n";

    public Organismo(String nombre, String especie, Luz luz, double tempMax,
                     double tempMin, double phMax, double phMin)
            throws IllegalArgumentException{
        if (nombre == null || especie == null|| nombre.trim().isEmpty()|| especie.trim().isEmpty()) {
            throw new IllegalArgumentException("El valor introducido no puede ser null o " +
                    "quedar sin completar.");
        }
        this.nombre = nombre;
        this.especie = especie;
        this.luz = luz;
        if (tempMin < 0  || tempMax >40 || tempMax < tempMin|| phMin < 0 || phMax > 14 || phMax < phMin) {
            throw new IllegalArgumentException("El valor introducido no es valido.");
        }
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




    private static double minTempAcua;
    public static double getMinTempAcua() {
        return minTempAcua;
    }
    public static double minTempAcuario(double x){
        if( minTempAcua == 0){
            minTempAcua = x;
        } else if(minTempAcua >= x){
            minTempAcua = x;
        }
        return minTempAcua;
    }
    private static double maxTempAcua;
    public static double getMaxTempAcua() {
        return maxTempAcua;
    }
    public static double maxTempAcuario(double x){
        if(maxTempAcua == 0){
            maxTempAcua = x;
        } else if(maxTempAcua <= x){
            maxTempAcua = x;
        }
        return maxTempAcua;
    }
    private static double minPhAcua;
    public static double getMinPhAcua() {
        return minPhAcua;
    }
    public static double minPhAcuario(double x){
        if(minPhAcua == 0){
            minPhAcua = x;
        } else if(minPhAcua >= x){
            minPhAcua = x;
        }
        return minPhAcua;
    }
    private static double maxPhAcua;
    public static double getMaxPhAcua() {
        return maxPhAcua;
    }
    public static double maxPhAcuario(double x){
        if(maxPhAcua == 0){
            maxPhAcua = x;
        } else if(maxPhAcua <= x){
            maxPhAcua = x;
        }
        return maxPhAcua;
    }

}
