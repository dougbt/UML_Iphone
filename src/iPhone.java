package UML_Iphone.src;

public class iPhone implements Gadget, NavegadorInternet, Camera{
 
    public void video(){
        System.out.println("Video");
    }
    public void capturarFoto(){
        System.out.println("foto capturada");
    }
    public void fotoPanoramica(){
        System.out.println("foto panoramica");
    }

    public void ligar(){
        System.out.println("ligando");
    }
    
    public void atender(){
        System.out.println("atendendo");
    }
    
    public void iniciarCorreioVoz(){
        System.out.println("iniciando correio de voz");
    }
    
    public void acessarSite(){
        System.out.println("acessando site");
    }
    public void novaGuia(){
        System.out.println("nova guia");
    }
    
    public void refresh(){
        System.out.println("refresh");
    }
    





}