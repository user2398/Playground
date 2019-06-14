#include<stdio.h>
int main()
{
  int i,j,n,sum=5,flag=1;
  scanf("%d",&n);
   if (n==1)
    sum = 0;   
  if (n==2)
    sum = 2;
  if (n==3)
    sum = 3;
  if(i!=2 && i!=3)
  {
  for(i=4;i<=n;i++)
  {
    for(j=2;j<i;j++)
    {
      if(i%j==0 && flag==1)
      {
       flag=0;
       break;
      }
    }
      if (flag==1)
      {
        sum+=i;
      }
    flag = 1;
    }
  }
    printf("%d",sum);
  return 0;
}