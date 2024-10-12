package RoomsAndStuff;

public class EmptyRoom {
    //Sala completamente vacia
   private String Infosala = "Esta sala se encuentra completamente vacia " ;

    public String getInfosala() {
        return Infosala;
    }

    public void setInfosala(String infosala) {
        Infosala = infosala;
    }

    public EmptyRoom(String infosala) {
        Infosala = infosala;
    }
    public EmptyRoom() {}

}
