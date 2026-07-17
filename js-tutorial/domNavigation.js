// //DOM Navigation 

// /* 
// .firstElementChild
// .lastElementChild
// .nextElementSiblings
// .previousElementSiblings
// .parentElement
// .children


// -------- .firstElementChild ---------

// const element = document.getElementById("fruits");
// const firstChild = element.firstElementChild;
// firstChild.style.backgroundColor = "yellow";

// -------- .lastElementChild ---------

// const element = document.getElementById("vegetables");
// const lastChild = element.lastElementChild;
// lastChild.style.backgroundColor = "yellow";

// const ulElement = document.querySelectorAll("ul");
// ulElement.forEach(ulElement=> {
    
//     const lastChild = ulElement.lastElementChild;
//     lastChild.style.backgroundColor = "yellow";
// });

// --------.nextElementSiblings----------

// const element = document.getElementById("banana");
// const nextsibling = element.nextElementSibling;
// nextsibling.style.backgroundColor = "yellow"

// ----------.previousElementSiblings-----------

// const element = document.getElementById("vegetables");
// const previous = element.previousElementSibling;
// previous.style.backgroundColor = "yellow"

// -------------.parentElement---------

// const element = document.getElementById("apple");
// const parent = element.parentElement;
// parent.style.backgroundColor = "yellow"

// -----------------.children-------------

const element = document.getElementById("fruits");
const children = element.children;

Array.from(children).forEach(child =>{
    child.style.backgroundColor = "yellow";
})
