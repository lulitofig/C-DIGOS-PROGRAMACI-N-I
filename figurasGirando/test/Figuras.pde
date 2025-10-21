class Figuras{
  float x;
  float y;
  float r;
  float vX;
  float vY;
  color colorRelleno;
  Figuras(float x_, float y_, float r_, float vX_, float vY_, color relleno){
    this.x = x_;
    this.y = y_;
    this.r = r_;
    this.vX = vX_;
    this.vY = vY_;
    this.colorRelleno = relleno;
  }

  void dibujar(){
    fill(this.colorRelleno);
    circle(x, y, 2 * r);
  }
  void mover(){
    x = x + vX;          
    if(((x+r) >= width) || ((x-r) <= 0)){
      vX = vX * -1;
    }
    y = y + vY;
    if(((y+r) >= height) || ((y-r) <= 0)){
      vY = vY * -1;   
    }
  }
}
