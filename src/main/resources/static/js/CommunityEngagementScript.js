document.addEventListener('DOMContentLoaded', function(){
  const form = document.getElementById('commentForm');
  const submit = document.querySelector('.submit');

  submit.addEventListener('click', function(event){

    const name = document.getElementById('name').value.trim();
    const date = document.getElementById('date').value.trim();
    const avatar = document.getElementById('avatar').value.trim();
    const comment = document.getElementById('comment').value.trim();

    if(name === "" || date === "" || avatar === "" || comment === ""){
      alert("You cannot proceed to the next page unless you fill in the fields.");
      event.preventDefault();
    } else {
      alert("Comment successfully added");
    }
  });

  const cancelBtn = document.querySelector('.cancel');
  cancelBtn.addEventListener('click', function(){
    window.history.back();
  });
});