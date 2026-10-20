Este programa está diseñado para modelar un sistema de gestión de cuentas en una red social aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para calcular el alcance o impacto orgánico según el tipo de perfil.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base CuentaSocial: Concentra los atributos comunes a cualquier perfil (username, email y seguidores), junto con un constructor centralizado y métodos para publicar contenido y seguir a otros usuarios.

Desarrolla las clases hijas CuentaCreador y CuentaCorporativa: Extienden de CuentaSocial incorporando atributos particulares y especializados (ingresos publicitarios y visualizaciones totales para el creador de contenido; límite de administradores y enlace al sitio web oficial para la cuenta corporativa).

Sobrescribe el cálculo de alcance/impacto: Cada subclase implementa su propia fórmula matemática para estimar el impacto digital en función de sus métricas particulares (por ejemplo, ponderando visualizaciones y seguidores para el creador; o aplicando un factor corporativo según el sitio web y los administradores).

Ejecuta la prueba en el main: Instancia objetos de ambas clases hijas especializadas, simula interacciones de publicación de contenido y crecimiento de métricas, y despliega los reportes de estado consolidados por consola.
