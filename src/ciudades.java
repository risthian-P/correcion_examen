public class ciudades extends paises{
    private String nombciudad;
    private int nhabitantes;
    //constructor

    public ciudades(){
        super();
    }

    public ciudades(String nombpais, String nomcontinente, String nombciudad, int nhabitantes) {
        super(nombpais, nomcontinente);
        this.nombciudad = nombciudad;
        this.nhabitantes = nhabitantes;
    }

    //setter y getter

    public String getNombciudad() {
        return nombciudad;
    }

    public void setNombciudad(String nombciudad) {
        this.nombciudad = nombciudad;
    }

    public int getNhabitantes() {
        return nhabitantes;
    }

    public void setNhabitantes(int nhabitantes) {
        this.nhabitantes = nhabitantes;
    }
}
