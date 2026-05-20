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
  let build ="";

  for(let i=0; i<movies.length; i++){
    let movie = movies[i];
    build += `<div class="card">
                <h3> ${movie.movieId}. Movie Name : ${movie.movieName}</h3>
                <div> First Name : ${movie.Genre}</div>
                <div> Last Name : ${movie.yearReleased}</div>
                <div> Country : ${movie.episodeDuration}</div>
                <p> Email : ${movie.Email}</p>
                <hr>
              </div>`;
  }
  // <img src='countries/${customer.Country}.PNG'>
  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
}

function filterbyMovies(){
  let movie = document.getElementById("movies").value;
  console.log(movie);

  let movieList = []; //create a list of movies searched for
  
  for(let i=0; i<movies.length;i++){
    let movie = movies[i] //get each sog
    //make sure the list is no
    if( movie.Country == country ) {
          //add to the new list
          customerList.push(customer);
    }
  }
  console.log(`number found ${customerList.length}`)
  generateCards(customerList);  
}