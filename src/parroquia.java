public class parroquia extends cantones{
    private String nombparroquia;
    //constructor
    public parroquia(){
        super();
    }
    public parroquia(String nombpais, String nomcontinente, String nombciudad, int nhabitantes, String nombcanton, String nombparroquia) {
        super(nombpais, nomcontinente, nombciudad, nhabitantes, nombcanton);
        this.nombparroquia = nombparroquia;
    }

    //setter y getter

    public String getNombparroquia() {
        return nombparroquia;
    }

    public void setNombparroquia(String nombparroquia) {
        this.nombparroquia = nombparroquia;
    }
}
