//getters and setters 

class Rectangle {
    constructor(width,height){
        this.width=width;
        this.height=height;
    }
    set width(newwidth){
        if(newwidth>0){
          this._width=newwidth;
        }
        else{
            console.log("with must be +ve")
        }
    }

    set height(newheight){
        if(newheight>0){
          this._height=newheight;
        }
        else{
            console.log("with must be +ve")
        }
    }
    get width(){
        return this._width;
    }
    get height(){
        return this._height;
    }
}

const rectangle = new Rectangle(3,4);

console.log(rectangle.width);
console.log(rectangle.height);