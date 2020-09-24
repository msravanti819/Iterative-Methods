/******************************************************************************

                            Online C# Compiler.
                Code, Compile, Run and Debug C# program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

using System;
class GaussJacobi {
  static void Main() {
    Console.WriteLine("Enter the size of the matrix : ");
    int n;
    n = Convert.ToInt32(Console.ReadLine());
    int[,] mat = new int[n,n];
    Console.WriteLine("Entert the values : ");
    
    for(int i=0;i<n;i++){
        
        for(int j=0;j<n;j++){
            mat[i,j] = Convert.ToInt32(Console.ReadLine());
        }
    }
    Console.WriteLine("Matrix is : ");
    for(int i=0;i<n;i++){
        
        for(int j=0;j<n;j++){
             Console.WriteLine(mat[i,j]);//mat[i,j] = Convert.ToInt32(Console.ReadLine());
        }
    }
   //int[] b;
   Console.WriteLine("Enter the b vector : ");
    int[] b = new int[n];
    for(int i=0;i<n;i++){
     b[i] =  Convert.ToInt32(Console.ReadLine());   
    }
    
    Console.WriteLine("Enter the initial values of x vector : ");
    float[] x = new float[n];
    for(int i=0;i<n;i++){
     x[i] =  float.Parse(Console.ReadLine());   
    }
    
    //Dummy vector 
    float[] xn = new float[n];
    for(int i=0;i<n;i++){
     xn[i] =  x[i];   
    }
    int itr;
    Console.WriteLine("Enter the no. of iterations : ");
    itr = int.Parse(Console.ReadLine());
    for(int k=0;k<itr;k++){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i<j){
               x[i] = (b[i]-mat[i,j]*x[j])/mat[i,i]; 
            }
            if(i>j){
                x[i] = (b[i]-mat[i,j]*xn[j])/mat[i,i];
            }
        }
      }
      for(int i=0;i<n;i++){
     xn[i] =  x[i];   
     }
    
    }
    Console.WriteLine("Results using Gauss-jacobi : ");
    Console.WriteLine("x[0] = "+x[0]+","+x[1] = "+x[1]);
    
    
  }
}
