// Node List 

let buttons = document.querySelectorAll(".mybutton");

// buttons.forEach(button => {
// // //   button.addEventListener("click", event=>{
// //     //   event.target.style.backgroundColor = "tomato";
// //   } );
// // })

// buttons.forEach(button => {
//     button.addEventListener("mouseover", event=>{
//         event.target.style.backgroundColor = "red";

// })})

const newButton = document.createElement("button");
newButton.textContent = " Button5";
newButton.classList.add("mybutton");
document.body.appendChild(newButton);

buttons = document.querySelectorAll(".mybutton");
console.log(buttons);   