public class CarEx {
    private String marca;
    private String modello;
    private int anno;

    public CarEx(String marca, String modello, int anno){
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public int getAnno() {
        return anno;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getWord (){
        return "La Macchina è di marca " + this.marca + " è il modello " + this.modello + " ed è stata prodotta nel " + this.anno;
    }
}
