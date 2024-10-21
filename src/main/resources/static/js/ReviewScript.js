document.addEventListener('DOMContentLoaded', function(){
    const form = document.getElementById('reviewForm');
    const submitBtn = document.querySelector('.submit');

    submitBtn.addEventListener('click', function(event){

    const name = document.getElementById('name').value.trim();
    const email = document.getElementById('email').value.trim();
    const review = document.getElementById('review').value.trim();
    const rating = document.getElementById('rating').value;

    if(name === "" || email === "" || review === "" || rating === ""){
        alert("You cannot proceed to the next page unless you fill in the fields.");
        event.preventDefault();
    } else {
        alert("Review successfully submitted");
    }
    });

    const resetBtn = document.querySelector('.reset');
    resetBtn.addEventListener('click', function(){
        const name = document.getElementById('name').value.trim();
        const email = document.getElementById('email').value.trim();
        const review = document.getElementById('review').value.trim();
        const rating = document.querySelector('select').value;

        if(name === "" || email === "" || review === "" || rating === "select"){
            alert("Fields are already empty!");
        }
    });

    const cancelBtn = document.querySelector('.cancel');
    cancelBtn.addEventListener('click', function(){
        window.history.back();
    });
});
