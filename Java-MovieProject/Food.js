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
                <p> Catergory: ${food.Catergory}</p>
              </div>`;  
  }
    build +=`</div>`;
  // Now inject the build content into the output container
  centerpanel.innerHTML = build;
}

//search food or drinks
function searchFood(){
  let newFood = document.getElementById("food").value;
  let build ="";
  console.log(newFood);


  let foodList = []; 
  
  for(let i=0; i<foods.length;i++){
    let food = foods[i];
    
    if( food.Food==newFood ) {
      foodList.push(food);
    }
  }
  generateCards(foodList);  
}

//filter food
function filterFood(){
  let foodList = []; 
  
  for(let i=0; i<foods.length;i++){
    let food = foods[i];
    
    if( food.Catergory == "Food" ) {
          foodList.push(food);
    }
  }
  generateCards(foodList);  
}

// filter drinks
function filterDrink(){
  let drinkList = []; 
  
  for(let i=0; i<foods.length;i++){
    let drink = foods[i];
    
    if( drink.Catergory == "Drink" ) {
          drinkList.push(drink);
    }
  }
  generateCards(drinkList);  
}

function filterSoda(){
  let drinkList = []; 
  
  for(let i=0; i<foods.length;i++){
    let drink = foods[i];
    
    if( drink.Type == "Soda" ) {
          drinkList.push(drink);
    }
  }
  generateCards(drinkList);  
}

function filterSnack(){
  let snackList = []; 
  
  for(let i=0; i<foods.length;i++){
    let snack = foods[i];
    
    if( snack.Type == "Snack" ) {
          snackList.push(snack);
    }
  }
  generateCards(snackList);  
}