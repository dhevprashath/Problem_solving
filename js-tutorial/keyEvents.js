//event Listener "Key Events"  key down key up key press

const mybox = document.getElementById('mybox');
const moveAmount =100;
x = 0;
y = 0;
document.addEventListener('keydown', events => {
    mybox.textContent = "😊";
    mybox.style.backgroundColor = "tomato";
})


document.addEventListener('keyup', events => {
    mybox.textContent = "😢";
    mybox.style.backgroundColor = "lightblue";
})
document.addEventListener("keydown", event => {
       if(event.key.startsWith("Arrow")){
        event.preventDefault();
            switch(event.key){
                case "ArrowUp":
                    y -= moveAmount;
                    break;
                     case "ArrowUp":
                    y -= moveAmount;
                    break;
                     case "ArrowDown":
                    y += moveAmount;
                    break;
                     case "ArrowLeft":
                    x -= moveAmount;
                    break;
                     case "ArrowRight":
                    x += moveAmount;
                    break;

            }
            mybox.style.top = `${y}px`;
            mybox.style.left = `${x}px`;
       }
})

