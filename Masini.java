public class Masini {
    private String marca;
    private String model;
    private String sasiu;
    private int kilometraj;
    private static int numarMasini = 0;

    Masini(String marca, String model, String sasiu, int kilometraj) {
        this.marca = marca;
        this.model = model;
        this.sasiu = sasiu;
        this.kilometraj = kilometraj;
        numarMasini++;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getSasiu(){
        return sasiu;
    }
    public void setSasiu(String sasiu){
        this.sasiu = sasiu;
    }
    public int getKm(){
        return kilometraj;
    }
    public void setKm(int km){
        this.kilometraj = km;
    }
    public static int getNumarMasini() {
        return numarMasini;
    }
}
