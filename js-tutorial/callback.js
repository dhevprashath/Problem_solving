function hello(callback){
    console.log("Hello, World!");
    callback();
}
function goodbye(){
    console.log("Goodbye, World!");
    
}
hello(goodbye);
