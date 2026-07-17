//class object 

class product {
    constructor (name,price){
        this.name=name;
        this.price=price;
    }
    displayProduct(){
        console.log(`product : ${this.name}`);
        console.log(`price : $${this.price}`);
    }
}
const product1 = new product("tshirt",20.00);
product1.displayProduct();