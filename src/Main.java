//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CuentaSocial creador = new CuentaCreador("tech_vlogs", "contacto@techvlogs.com", 25000, 1200.50, 450000);
    CuentaSocial corporativa = new CuentaCorporativa("InnovatechSA", "soporte@innovatech.com", 150000, 5, 3,"https://www.innovatech.com");

    System.out.println("=== SIMULACIÓN DE REDES SOCIALES ===\n");

    creador.publicarContenido("¡Nuevo video sobre programación orientada a objetos en el canal!");
    creador.seguir("java_expert");

    System.out.println();

    corporativa.publicarContenido("Lanzamiento oficial de nuestra nueva infraestructura en la nube.");
    corporativa.seguir("tech_vlogs");

    System.out.println("\n=== ESTADO FINAL DE MÉTRICAS ===");
    creador.mostrarMetricas();
    corporativa.mostrarMetricas();
}

