//function declaration = define a resuable block of code that performs a particular task

const numbers = [1,2,3,4,5];
const squaresNumbers = numbers.map(squares);

console.log(squaresNumbers);

function squares(elements){
 return Math.pow(elements,2);

}

//Fuction expression = a way to define a function as values or variables 

const numbers = [1,2,3,4,5];
const squareNumbers = numbers.map(function(element){
    return Math.pow(element,2);
});
console.log(squareNumbers);