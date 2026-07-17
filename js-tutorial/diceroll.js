// DICE Roller program

function rollDice() {
    const numDice = document.getElementById('numDice').value;
    const resultsDiv = document.getElementById('diceResults');
    const results = [];
    const values = [];

    for (let i = 0; i < numDice; i++) {
        const roll = Math.floor(Math.random() * 6) + 1;
        results.push(roll);
        values.push(`Die ${i + 1}: ${roll}`);
    }
  diceResults.innerHTML = values.join('<br>') + `<br>Total: ${results.reduce((a, b) => a + b, 0)}`; 
}