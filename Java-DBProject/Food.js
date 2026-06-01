let foods, info;

async function init(){
  let link = "https://orange-happiness-wr5r9g9qpj472p-8500.app.github.dev"; //replace with your Dev URL
  let route= "/Food";

  info = await fetch(link+route);
  foods = await info.json();

  generateCards(foods);
}

function generateCards(foods){
  let centerpanel = document.getElementById("centerpanel");
  let build =`<div class="flex-container">`;

  for(let i=0; i<foods.length; i++){
    let food = foods[i];
    build += `<div class="foodcard">
              <img src="food/${food.Food}.jpg">
                <h4> ${food.itemID}. ${food.Food}</h4>
                <p> Price: $${food.Price}0</p>
              </div>`;  
  }
    build +=`</div>`;
  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
}

// function filterbyFood(){
//   let filtermovie = document.getElementById("movies").value;
//   console.log(filtermovie);

//   let movieList = []; 
  
//   for(let i=0; i<movies.length;i++){
//     let movie = movies[i];
    
//     if( movie.movieName == newmovie ) {
//           movieList.push(movie);
//     }
//   }
//   generateCards(movieList);  
// }