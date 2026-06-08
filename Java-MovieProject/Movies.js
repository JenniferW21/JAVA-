let movies, info;

async function init(){
  let link = "https://orange-happiness-wr5r9g9qpj472p-8500.app.github.dev"; //replace with your Dev URL
  let route= "/Movies";

  info = await fetch(link+route);
  movies = await info.json();

  generateCards(movies);
}

function generateCards(movies){
  let centerpanel = document.getElementById("centerpanel");
  let build =`<div class="flex-container">`;

  let movieImg="";

  for(let i=0; i<movies.length; i++){
    let movie = movies[i];
    build += `<div class="card">
                <img src="movies/${movie.movieName}.jpg">
                <h4> ${movie.movieId}. ${movie.movieName}</h4>
                <p> Genre: ${movie.Genre}</p>
                <p> Released : ${movie.yearReleased}</p>
                <p> Duration: ${movie.episodeDuration} min</p>
                </div>`;
  }
    build +=`</div>`;
  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
}

function filterbyMovies(){
  let newMovie = document.getElementById("movies").value;
  console.log(newMovie);

  let movieList = []; 
  
  for(let i=0; i<movies.length;i++){
    let movie = movies[i];
    
    if( movie.movieName == newMovie ) {
          movieList.push(movie);
    }
  }
  generateCards(movieList);  
}

function filterAction(){
  let movieList = [];
  for(let i=0; i<movies.length; i++){
    let movie = movies[i];
    if(movie.Genre == "Action") {
      movieList.push(movie);
    }
  }
  generateCards(movieList);
}

function filterScifi(){
  let movieList = [];
  for(let i=0; i<movies.length; i++){
    let movie = movies[i];
    if(movie.Genre == "Sci-Fi") {
      movieList.push(movie);
    }
  }
  generateCards(movieList);
}


function filterAnimation(){
  let movieList = [];
  for(let i=0; i<movies.length; i++){
    let movie = movies[i];
    if(movie.Genre == "Animation") {
      movieList.push(movie);
    }
  }
  generateCards(movieList);
}

function filterThriller(){
  let movieList = [];
  for(let i=0; i<movies.length; i++){
    let movie = movies[i];
    if(movie.Genre == "Thriller") {
      movieList.push(movie);
    }
  }
  generateCards(movieList);
}

function filterHorror(){
  let movieList = [];
  for(let i=0; i<movies.length; i++){
    let movie = movies[i];
    if(movie.Genre == "Horror") {
      movieList.push(movie);
    }
  }
  generateCards(movieList);
}
