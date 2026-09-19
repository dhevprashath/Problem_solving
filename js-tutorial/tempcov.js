const textbox = document.getElementById("textbox");
const tofahrenheit = document.getElementById("tofahrenheit");
const tocelsius = document.getElementById("tocelsius");
const result = document.getElementById("result");

let temp;

function convert() {

    if (tofahrenheit.checked) {
        temp = (Number(textbox.value) * 9 / 5) + 32;
        result.textContent = `${textbox.value}°C = ${temp.toFixed(2)}°F`;
    }
    else if (tocelsius.checked) {
        temp = (Number(textbox.value) - 32) * 5 / 9;
        result.textContent = `${textbox.value}°F = ${temp.toFixed(2)}°C`;
    }
    else {
        result.textContent = "Please select a conversion type.";
    }
}