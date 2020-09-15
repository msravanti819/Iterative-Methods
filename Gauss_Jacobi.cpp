//Gauss Jacobi and Gauss Seidel in CPP
#include<iostream>
#include<cmath>

using namespace std;
int main(){
    int n,itr;

cout<<"Enter the any value of n :";
cin>>n;

int A[n][n],b[n];
double x[n],xn[n];

cout<<"\n Enter the Matrix Elements of A : \n";
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        cin>>A[i][j];
    }
}

cout<<"\n Enter the b vector : \n";
for(int i=0;i<n;i++){
    cin>>b[i];
}

cout<<"\n Enter the initial values of x vector";
for(int i=0;i<n;i++){
        cin>>x[i];
}


cout<<"\n Enter the no. of iterations : ";
cin>>itr;

cout<<"\n Gauss-Jacobi Results are : \n";
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
     for(int i=0;i<n;i++){
    xn[i]=x[i];
}
}
cout<<"x[0] = "<<x[0]<<","<<"x[1] = "<<x[1];
return 0;
}
