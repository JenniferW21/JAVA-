let books, info;

async function init(){
  let link = "https://orange-happiness-wr5r9g9qpj472p-8500.app.github.dev"; //replace with your Dev URL
  let route= "/Books";

  info = await fetch(link+route);
  books = await info.json();

  generateCards(books);
}

function generateCards(books){
  let centerpanel = document.getElementById("centerpanel");
  let build ="";

  for(let i=0; i<books.length; i++){
    let book = books[i];
    build += `<div class="card" >`
    build += `<div> Genre : ${book.Genre}</div>`;
    build += `<h3> Title : ${book.Title}</h3>`;
    build += `<h3> Author : ${book.Author}</h3>`;
    build += `<p> ISBN : ${book.ISBN}</p>`;
    build += `<hr>`;
    build += `</div>`;
  }
  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
}

// function filter(){
//   let country = document.getElementById("country").value;
//   console.log(country);

//   let customerList = []; //create a list of songs searched for
  
//   for(let i=0; i<customers.length;i++){
//     let customer = customers[i] //get each sog
//     //make sure the list is no
//     if( customer.Country == country ) {
//           //add to the new list
//           customerList.push(customer);
//     }
//   }
//   console.log(`number found ${customerList.length}`)
//   generateCards(customerList);  
// }