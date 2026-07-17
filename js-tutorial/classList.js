// Class List 

const mybutton = document.getElementById("mybutton");

mybutton.addEventListener("mouseover", event=>{
    event.target.classList.toggle("hover");
})