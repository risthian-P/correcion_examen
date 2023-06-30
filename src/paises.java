public class paises {
    private String nombpais;
    private String nomcontinente;

    //Constructores

    public paises(){

    }

    public paises(String nombpais, String nomcontinente) {
        this.nombpais = nombpais;
        this.nomcontinente = nomcontinente;
    }

    //Setter y Getter

    public String getNombpais() {
        return nombpais;
    }

    public void setNombpais(String nombpais) {
        this.nombpais = nombpais;
    }

    public String getNomcontinente() {
        return nomcontinente;
    }

    public void setNomcontinente(String nomcontinente) {
        this.nomcontinente = nomcontinente;
    }
}
