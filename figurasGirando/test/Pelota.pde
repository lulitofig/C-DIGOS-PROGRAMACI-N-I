class Pelota extends Figuras{
  Pelota(float x_, float y_, float r_, float vX_, float vY_, color relleno){
    super(x_, y_, r_, vX_, vY_, relleno);
  }
  Pelota(float x_, float y_, float r_){
    this(x_, y_, r_, 0, 0, color(255, 0, 0)); 
  }
}
