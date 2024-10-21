// Get the hamburger icon and nav links
const hamburger = document.getElementById("hamburger");
const navLinks = document.getElementById("nav-links");

// Toggle the 'active' class to show or hide the menu
hamburger.addEventListener("click", () => {
    navLinks.classList.toggle("active");
});