public class cantones extends ciudades{
    private String nombcanton;
    //constructor

    public cantones(){
        super();
    }

    public cantones(String nombpais, String nomcontinente, String nombciudad, int nhabitantes, String nombcanton) {
        super(nombpais, nomcontinente, nombciudad, nhabitantes);
        this.nombcanton = nombcanton;
    }

    //setter y getter

    public String getNombcanton() {
        return nombcanton;
    }

    public void setNombcanton(String nombcanton) {
        this.nombcanton = nombcanton;
    }
}
