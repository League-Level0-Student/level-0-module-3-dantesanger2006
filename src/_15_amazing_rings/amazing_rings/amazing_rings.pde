int num=50;
int mun=60;
void setup() {
  size(1000, 1000);

  noFill();
}

void draw() {
  for (int i = 0; i <30; i++) {
    ellipse(num, mun, i*10, i*10);
  }



  for (int i = 0; i <30; i++) {
    ellipse(num, mun, i*10, i*10);
  }
}
