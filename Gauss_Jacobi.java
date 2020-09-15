/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.util.*;
public class GJ{

public static void main(String args[]){
int n,itr;
Scanner p=new Scanner(System.in);
System.out.println("Enter the no. of iterations");
itr=p.nextInt();
System.out.println("Enter the size of the square matrix");
n=p.nextInt();

int [][] A=new int[n][n];
double []x=new double[n];
double []xn=new double[n];
int []b=new int[n];

System.out.println('\n'+"Enter the b vector elements");
for(int j=0;j<n;j++){
b[j]=p.nextInt();
}

System.out.println('\n'+"Enter the initial values of x vector");
for(int j=0;j<n;j++){
x[j]=p.nextInt();
}

System.out.println('\n'+"Enter the matrix elements");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
A[i][j]=p.nextInt();
}
}

System.out.println("Gauss Jacobi results are");
for(int k=0;k<itr;k++){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(i<j){
x[i]=(b[i]-A[i][j]*x[j])/A[i][i];
}
if(i>j){
x[i]=(b[i]-A[i][j]*xn[j])/A[i][i];
}
}
}
for(int e=0;e<n;e++){
xn[e]=x[e];
}
}
System.out.println("x[0] ="+x[0]+","+"x[1] ="+x[1]);
}


}