// Cuadrados.pde
class Cuadrados extends Figuras{
  String texto = "";
  
  Cuadrados(float x_, float y_, float r_, float vX_, float vY_, color relleno){
    super(x_, y_, r_, vX_, vY_, relleno);
  }

  Cuadrados(float x_, float y_, float r_){
    this(x_, y_, r_, 0, 0, color(255)); 
  }

  void dibujar(){
    rectMode(CENTER);
    fill(this.colorRelleno);
    rect(x, y, 2 * r, 2 * r);
    
    fill(0); // Texto negro
    textAlign(CENTER, CENTER);
    text(this.texto,x, y);
  }
  
  void setTexto(String texto_){
    this.texto = texto_;
  }
}
