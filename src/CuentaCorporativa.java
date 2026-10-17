public class CuentaCorporativa extends CuentaSocial{
    private int limiteAdministradores;
    private String sitioWeb;
    private int seguidores;

    public CuentaCorporativa(String userName, String email, int seguidores, double ingresosPublicidad, int limiteAdministradores, String sitioWeb){
        super(userName, email, seguidores);
        this.limiteAdministradores = limiteAdministradores;
        this.sitioWeb = sitioWeb;
    }

    @Override
    public void publicarContenido(String contenido) {
        System.out.println("--- PERFIL CORPORATIVO ---");
        super.publicarContenido(contenido);
        System.out.println("Sitio oficial vinculado: " + sitioWeb);
        System.out.println("Impacto calculado (Corporativo): " + calcularImpacto() + " puntos de alcance comercial.");
        System.out.println("----------------------------------------");
    }

    public double calcularImpacto() {
        return seguidores * 1.5 + (limiteAdministradores * 500);
    }
}
