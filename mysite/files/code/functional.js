
const numbers =;


const isEven = x => x % 2 === 0;
const double = x => x * 2;

const result = numbers.filter(isEven).map(double);

console.log(result); // [4, 8]
console.log(numbers); // [1, 2, 3, 4, 5] 
