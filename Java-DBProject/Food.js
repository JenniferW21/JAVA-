let foods, info;

async function init(){
  let link = "https://orange-happiness-wr5r9g9qpj472p-8500.app.github.dev"; //replace with your Dev URL
  let route= "/Movies";

  info = await fetch(link+route);
  foods = await info.json();

  generateCards(foods);
}

function generateCards(mofoodsvies){
  let centerpanel = document.getElementById("centerpanel");
  let build ="";

  for(let i=0; i<foods.length; i++){
    let food = foods[i];
    build += `<div class="card">
                <h3> ${movie.movieId}. Movie Name : ${movie.movieName}</h3>
                
                <div> First Name : ${movie.Genre}</div>
                <div> Last Name : ${movie.yearReleased}</div>
                <div> Country : ${movie.episodeDuration}</div>
                <p> Email : ${movie.Email}</p>
                <hr>
              </div>`;
  }

  //<img src='movies/${movie.Country}.jpg'>
  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
}

// function filterbyMovies(){
//   let movie = document.getElementById("foods").value;
//   console.log(movie);

//   let movieList = []; 
  
//   for(let i=0; i<movies.length;i++){
//     let movie = movies[i] 
    
//     if( movie.movieName == movie ) {
//           movieList.push(movie);
//     }
//   }
//   console.log(`number found ${movieList.length}`)
//   generateCards(movieList);  
// }