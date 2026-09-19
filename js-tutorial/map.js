//map() function 

const students = ["John", "Jane", "Doe"];
const upperCaseStudents = students.map(upperCaseName);
const lowerCaseStudents = students.map(lowerCaseName);
console.log(upperCaseStudents); 
console.log(lowerCaseStudents); 

function upperCaseName(name) {
    return name.toUpperCase();
}

function lowerCaseName(name) {
    return name.toLowerCase();
}
