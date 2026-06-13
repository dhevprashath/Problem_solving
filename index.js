let minNum = 1;
let maxNum = 10;
let randomNum = Math.floor(Math.random() * (maxNum - minNum + 1)) + minNum;

let attempts = 0;
let guess;
let running = true;

while (running) {
    guess = window.prompt(`Guess a number between ${minNum} and ${maxNum}:`);
    guess = Number(guess);

   if (isNaN(guess)) {
        window.alert("Please enter a valid number.");
        
    }
    else if (guess > randomNum) {
        window.alert("Too high! Try again.");
        
    }
    else{
        attempts++;
        if (guess < randomNum) {
            window.alert("Too low! Try again.");
    }
        else if ( guess > randomNum ) {
            window.alert("Too high! Try again.");
        }
        else {
            window.alert(`Congratulations! You've guessed the number ${randomNum} in ${attempts} attempts.`);
            running = false;
        }
           
    

}
running = false;
}