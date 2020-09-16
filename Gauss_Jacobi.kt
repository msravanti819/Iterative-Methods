fun main() {
     println("Enter the size of matrix")
     val n: Int = readLine()!!.toInt() //Declaring size of the matrix
     println("Enter the input : ")
     var mat = arrayOf(Array(n) { 0 }, Array(n) { 0 }) //Creating matrix

     for (i in 0..1) {
         for (j in 0..1) {
             mat[i][j] = readLine()!!.toInt()
         }
     }

     println("Enter the b vector :")
     var b = Array(n) { 0 }
     for (i in 0..1) {
         b[i] = readLine()!!.toInt()
     }


     println("Enter the initial value of x vector :")
     var x = Array<Double>(n) { 0.0 }
     for (i in 0..1) {
         x[i] = readLine()!!.toDouble()
     }
     
     var xn = Array<Double>(n) { 0.0 }
     for (i in 0..1) {
         xn[i] = xx[i]
     }
     println("Enter the no. of iteration")
     var iter = readLine()!!.toInt()
     for (i in 0..iter - 1) {
         for (i in 0..1) {
             for (j in 0..1) {
                 if (i < j) {
                     xx[i] = (b[i] - xx[j] * mat[i][j]) / mat[i][i]
                 }
                 if (i > j) {
                     xx[i] = (b[i] - xn[j] * mat[i][j]) / mat[i][i]
                 }
             }

         }
         for (i in 0..1) {
             xn[i] = xx[i]
         }
     }
	 println("Gauss Jacobi : " + "x[0]=" + xx[0] + "," + "x[1]=" + xx[1])

 }