let customers, info;

async function init(){
let link = "https://orange-happiness-wr5r9g9qpj472p-8500.app.github.dev"; //replace with your Dev URL
  let route= "/customers";

  info = await fetch(link+route);
  customers = await info.json();

  generateCards(customers);
}

function generateCards(customers){
  let centerpanel = document.getElementById("centerpanel");
  let build ="";

  for(let i=0; i<customers.length; i++){
    let customer = customers[i];
    build += `<div class="card" >`
    build +=   `<h3> Customer ID: ${customer.CustomerId}</h3>`;
    build +=   `<h4> First Name: ${customer.FirstName}</h4>`;
    build +=   `<h4> Last Name: ${customer.LastName}</h4>`;
    build +=   `<hr>`;
    build +=   `<h5> City: ${customer.City}</h5>`;
    build += `<img src='cities/${customer.City}.PNG'>`;
    build += `</div>`;    
  }
  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
}

//filter by Cities

function filterByCity(){
    
}
