// closure 

function outer(){
    let message = "hello";
    function inner(){
      console.log(message)
    }
      inner();
}
outer();
