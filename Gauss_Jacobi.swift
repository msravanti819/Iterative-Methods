//Matrix Declearation 
var mat = [[Double]]()
var n: Int
print("Enter the size of the matrix :")
n = Int(readLine()!)!
print("Enter the values of matrix : \n")
for _ in 0..<n{
var row = [Double]()
for _ in 0..<n{
row.append(Double(readLine()!)!)
}
mat.append(row)
}

//b vector
print("Enter the b vector elements :")
var b=[Double]()
for _ in 0..<n{
b.append(Double(readLine()!)!)
}

//x vector
print("Enter the initial values of x vector :")
var x=[Double]()
for _ in 0..<n{
x.append(Double(readLine()!)!)
}

print("mat = \(mat) \n")
print("b = \(b) \n")
print("x = \(x) \n")

var itr: Int
print("Enter the no. of iterations : ")
itr = Int(readLine()!)!

print("Enter the dummy vector values same as x vector initial value :")
var xn=[Double]()
for _ in 0..<n{
//xn[p] = x[p]
xn.append(Double(readLine()!)!)
}

for _ in 0..<itr{
for e in 0..<n{
for f in 0..<n{

if e < f {
x[e]=(b[e]-mat[e][f]*x[f])/mat[e][e]
}

if e > f {
x[e]=(b[e]-mat[e][f]*xn[f])/mat[e][e]
}

}
}

for q in 0..<n{
xn[q] = x[q]//xn.append(x[q])
}

}

print("Results using Gauss Jacobi : ")
for v in 0..<n{
print("x[\(v)] = \(x[v])")
}