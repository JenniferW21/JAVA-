let reviews, info;

async function init(){
  let link = "https://orange-happiness-wr5r9g9qpj472p-8500.app.github.dev"; //replace with your Dev URL
  let route= "/Review";

  info = await fetch(link+route);
  reviews = await info.json();

  generateCards(reviews);
}

function generateCards(reviews){
  let centerpanel = document.getElementById("centerpanel");
  let build =`<div class="flex-container">`;

  for(let i=0; i<reviews.length; i++){
    let review = reviews[i];
    build += `<div class="flip-card">
                <div class="flip-card-inner">
                  <div class="flip-card-front">
                    <img id="img" src="profile.jpg">
                    <h4> user${review.userId}532682213</h4>
                    <p> Movie: ${review.movieName}</p>
                  </div>

                  <div class="flip-card-back">
                    <h3> Rating: ${review.ratings}/5.0</h3>
                    <p> Comment: ${review.movieName} was ${review.comment} </p>
                  </div>

                </div>
              </div>`;  
  }
    build +=`</div>`;
  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
}

function filter5() {
  let reviewList = [];
  for (let i = 0; i < reviews.length; i++) {
    let review=reviews[i];
    if (Math.floor(review.ratings) == 5) {
      reviewList.push(review);
    }
  }
  generateCards(reviewList);
}

function filter4() {
  let reviewList = [];
  for (let i = 0; i < reviews.length; i++) {
    let review=reviews[i];
    if (Math.floor(review.ratings) == 4) {
      reviewList.push(review);
    }
  }
  generateCards(reviewList);
}

function filter3() {
  let reviewList = [];
  for (let i = 0; i < reviews.length; i++) {
    let review=reviews[i];
    if (Math.floor(review.ratings) == 3) {
      reviewList.push(review);
    }
  }
  generateCards(reviewList);
}
function filter2() {
  let reviewList = [];
  for (let i = 0; i < reviews.length; i++) {
    let review=reviews[i];
    if (Math.floor(review.ratings) == 2) {
      reviewList.push(review);
    }
  }
  generateCards(reviewList);
}
function filter1() {
  let reviewList = [];
  for (let i = 0; i < reviews.length; i++) {
    let review=reviews[i];
    if (Math.floor(review.ratings) == 1) {
      reviewList.push(review);
    }
  }
  generateCards(reviewList);
}