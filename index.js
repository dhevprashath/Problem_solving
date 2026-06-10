const increasebtn = document.getElementById("incrementBtn");
const decreasebtn = document.getElementById("decrementBtn");
const resetbtn = document.getElementById("resetBtn");
const countlabel = document.getElementById("count");
let count = 0;

increasebtn.onclick = function(){
    count ++;
    countlabel.textContent =count;
}
decreasebtn.onclick = function(){
    count --;
    countlabel.textContent =count;

}
resetbtn.onclick = function(){
    count = 0;
    countlabel.textContent =count;
}