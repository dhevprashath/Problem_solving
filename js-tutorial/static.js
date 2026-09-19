// static keyword 

class mathutil {
    static PI = 3.14;

    static getdiameter(radius){
       return radius*2;
    }

    static getcircumference(radius){
       return 2*this.PI * radius;
    }
}

console.log(mathutil.PI);
console.log(mathutil.getdiameter(10));
console.log(mathutil.getcircumference(2));