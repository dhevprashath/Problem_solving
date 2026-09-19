//filter() method creates a new array with all elements that pass the test implemented by the provided function.

const age = [12, 17, 22, 30, 45, 60];
const adult = age.filter(isAdult);

console.log(adult); 

function isAdult(element) {
  return element >= 18;
}

function isMinor(element) {
  return element < 18;
}
const minor = age.filter(isMinor);
console.log(minor);
