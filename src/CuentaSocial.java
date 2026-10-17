public class CuentaSocial {
    private String userName;
    private String email;
    private int seguidores;

    public CuentaSocial(String userName, String email, int seguidores){
        this.userName = userName;
        this.email  = email;
        this.seguidores = seguidores;
    }


    public void publicarContenido(String contenido){
        System.out.println("@ " + userName + " ha publicado: " + contenido);
    }

    public void seguir(String otroUsuario){
        System.out.println(userName + " comenzó a seguir a @" + otroUsuario);
    }

    public void mostrarMetricas(){
        System.out.println("Usuario: " + userName + "| Email: " + email + "| Seguidores: " + seguidores);
    }
}
