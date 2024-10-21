//This code is responsible for handing functionality of the login page

//Code to catch a user submit empty fields, otherwise if fields are full they can proceed
document.addEventListener("DOMContentLoaded", function () {
   const loginBtn = document.querySelector('.loginBtn');

   loginBtn.addEventListener('click', function(event){
       const username = document.getElementById('username').value.trim();
       const password = document.getElementById('password').value.trim();

       //Catch the user if they attempt to submit empty fields
       if(username === "" || password === ""){
           alert("You cannot proceed to the next page unless you fill in the fields.");
           event.preventDefault(); //prevent the form from being submitted
       } else {
           alert("Successfully logged in!");
       }
    });
});




