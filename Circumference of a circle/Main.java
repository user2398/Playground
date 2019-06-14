#include<stdio.h>
int main() 
{   
  float pi = 3.14;
  float r, cir;
  scanf("%f", &r);
  cir = pi * r * r;
  printf("%0.2f", cir);
  return 0;
}