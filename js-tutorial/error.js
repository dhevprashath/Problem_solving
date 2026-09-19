// Error Handling 

try{
const divident = Number(window.prompt("Enter a divident:"));
const divisor = Number(window.prompt("Enter a divisor:"));

if(divisor == 0){
    throw new Error("you can't divide by 0");

}
if(isNaN(divident)  ||  isNaN(divisor)){
    throw new Error("please enter only numbers");
}
const result = divident / divisor ;
console.log(result);
}
catch(error){
    console.error(error);
}

console.log("you have reach the end ");