// Fetch Function

//--------example 1: Fetching data from an API and logging the response-----

// fetch("https://pokeapi.co/api/v2/pokemon/pikachu")

//  .then((response) =>{
//     if (!response.ok) {
//         throw new Error("Network response was not ok");
//     } 
//     return response.json();  
//  })
//  .then(data => console.log(data.id))
// .catch((error) => console.error("Error fetching data:", error));





async function fetchData() {
    try{
        const pokemanName = document.getElementById("pokemanName").value.toLowerCase();
       const response = await fetch(`https://pokeapi.co/api/v2/pokemon/${pokemanName}`);
       if (!response.ok) {
        throw new Error("Network response was not ok");
       }
      const data = await response.json();
      const pokemanSprite = data.sprites.front_default;
      const imgElement = document.getElementById("pokemanSprite");

      imgElement.src = pokemanSprite;
        imgElement.style.display = "block";
        console.log(data);
    }
    catch(error){
        console.error("Error fetching data:", error);
    }
}


