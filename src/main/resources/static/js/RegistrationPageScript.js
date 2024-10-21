
document.addEventListener("DOMContentLoaded", function () {
   const registerBtn = document.querySelector('.registerBtn');

   registerBtn.addEventListener('click', function(event){
       const username = document.getElementById('username').value.trim();
       const name = document.getElementById('name').value.trim();
       const email = document.getElementById('email').value.trim();
       const password = document.getElementById('password').value.trim();

       if(username === "" || name === "" || email === "" || password === ""){
           alert("You cannot proceed to the next page unless you fill in the fields.");
           event.preventDefault();
       } else {
           alert("Successfully registered!");
       }
    });
});
