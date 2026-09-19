// Event Liseners 

const mybox = document.getElementById('mybox');
const mybutton = document.getElementById('mybutton');

mybutton.addEventListener('click', event => {
     mybox.style.backgroundColor = "tomato";
  mybox.textContent = "OUCH! 😢";
});

mybutton.addEventListener('mouseover', event => {
    mybox.style.backgroundColor = "yellow";
   mybox.textContent = " dont do it! 😎";
});

mybutton.addEventListener("mouseout",event => {
    mybox.style.backgroundColor = "lightgreen";
   mybox.textContent = "click me it! 😎";
})