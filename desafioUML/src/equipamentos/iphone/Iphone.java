package equipamentos.iphone;

import equipamentos.aparelhoTelefonico.AparelhoTelefonico;
import equipamentos.navegadorInternet.NavegadorInternet;
import equipamentos.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    public void fazerLigacao(){
        System.out.println("FAZENDO LIGAÇÃO VIA IPHONE...");
    }

    public void receberLigacao() {
        System.out.println("RECEBENDO LIGAÇÃO VIA IPHONE...");
    }
    
    public void navegarInternet(){
        System.out.println("NAVEGANDO NA INTERNET VIA IPHONE...");
    }

    public void enviarEmail() {
        System.out.println("ENVIANDO EMAIL VIA IPHONE...");
    }

    public void reproduzirMusica(){
        System.out.println("REPRODUZINDO MUSICA VIA IPHONE...");
    }

    public void navegarListaArtistas() {
        System.out.println("NAVEGANDO EM ARTISTAS MUSICAIS VIA IPHONE...");
    }
    
}
