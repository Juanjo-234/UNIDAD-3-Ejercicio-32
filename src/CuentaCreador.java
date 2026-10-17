public class CuentaCreador extends CuentaSocial{
    private double ingresosPublicidad;
    private double visualizacionesTotales;
    private int seguidores;

    public CuentaCreador(String userName, String email, int seguidores, double ingresosPublicidad, double visualizacionesTotales){
        super(userName, email, seguidores);
        this.ingresosPublicidad = ingresosPublicidad;
        this.visualizacionesTotales = visualizacionesTotales;
    }

    @Override
    public void publicarContenido(String contenido) {
        System.out.println("--- PERFIL DE CREADOR ---");
        super.publicarContenido(contenido);
        visualizacionesTotales += 1500;
        System.out.println("Impacto calculado (Creador): " + calcularImpacto() + " puntos de engagement.");
        System.out.println("----------------------------------------");
    }

    public double calcularImpacto() {
        return (visualizacionesTotales * 0.05) + (seguidores * 0.1);
    }
}
