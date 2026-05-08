let members, info;

async function init(){
  let link = "https://orange-happiness-wr5r9g9qpj472p-8500.app.github.dev"; //replace with your Dev URL
  let route= "/Members";

  info = await fetch(link+route);
  members = await info.json();

  generateCards(members);
}

function generateCards(members){
  let centerpanel = document.getElementById("centerpanel");
  let build ="";

  for(let i=0; i<members.length; i++){
    let member = members[i];
    build += `<div class="card" >`
    build += `<h3> Member ID : ${member.MemberId}</h3>`;
    build += `<div> First Name : ${member.FirstName}</div>`;
    build += `<div> Last Name : ${member.LastName}</div>`;
    build += `<p> Email : ${member.Email}</p>`;
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