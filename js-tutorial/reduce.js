//Reduce() method executes a reducer function (that you provide)
//  on each element of the array, resulting in a single output value.

const price = [20, 30, 40, 50, 60];
const total = price.reduce(sum);

console.log(`Total $: ${total.toFixed(2)}`);
function sum(accumulator, element) {
  return accumulator + element;
}