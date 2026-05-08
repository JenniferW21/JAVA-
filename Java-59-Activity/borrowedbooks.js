let borrowedbooks, info;

async function init(){
  let link = "https://orange-happiness-wr5r9g9qpj472p-8500.app.github.dev"; //replace with your Dev URL
  let route= "/BorrowedBooks";

  info = await fetch(link+route);
  borrowedbooks = await info.json();

  generateCards(borrowedbooks);
}

function generateCards(borrowedbooks){
  let centerpanel = document.getElementById("centerpanel");
  let build ="";

  for(let i=0; i<borrowedbooks.length; i++){
    let borrowedbook = borrowedbooks[i];
    build += `<div class="card" >`
    build += `<div> Mmeber ID : ${borrowedbook.MemberId}</div>`;
    build += `<div> ISBN : ${borrowedbook.ISBN}</div>`;
    build += `<h3> Due Date : ${borrowedbook.DueDate}</h3>`;
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