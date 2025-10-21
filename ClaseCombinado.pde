class ClaseCombinado {
  Pelota centro;
  Cuadrados[] cuadrantes = new Cuadrados[4];
  float posicionX, posicionY;
  float angulo = 0; 
  float velocidadRotacion = 0.03; 
  
  ClaseCombinado(float x, float y, float radioPelota, float ladoCuadrado) {
    this.posicionX = x;
    this.posicionY = y;
    float r_cuadrado = ladoCuadrado / 2;//longitud total del lado del cuadrado
    centro = new Pelota(0, 0, radioPelota); 
    float distancia = radioPelota + r_cuadrado; 
    //array
    cuadrantes[0] = new Cuadrados(-distancia, 0, r_cuadrado); 
    cuadrantes[0].colorRelleno = color(134, 250, 233); 
    cuadrantes[0].setTexto("h"); 
    cuadrantes[1] = new Cuadrados(distancia, 0, r_cuadrado); 
    cuadrantes[1].colorRelleno = color(229, 135, 242);
    cuadrantes[1].setTexto("o");
    cuadrantes[2] = new Cuadrados(0, -distancia, r_cuadrado); 
    cuadrantes[2].colorRelleno = color(169, 250, 188); 
    cuadrantes[2].setTexto("l");
    cuadrantes[3] = new Cuadrados(0, distancia, r_cuadrado); 
    cuadrantes[3].colorRelleno = color(255, 245, 129); 
    cuadrantes[3].setTexto("i");
  }
  
  void rotar() {
    // Actualiza el angulo
    angulo += velocidadRotacion;
  }
  
  void dibujar() {
    //Guarda el sistema de coordenadas
    pushMatrix(); //en procesing sirve para guardar las acciones que hace, por ejemplo rotar trasladar etc..., es como un array que guarda movimientos
    
    // miueve el origen al centro de la figura
    translate(posicionX, posicionY);
    
    // con esto rota
    rotate(angulo); 
    
    // componentes
    centro.dibujar(); 
    
    for (int i = 0; i < cuadrantes.length; i++) {
      cuadrantes[i].dibujar(); 
    }

    popMatrix(); 
  }
}
