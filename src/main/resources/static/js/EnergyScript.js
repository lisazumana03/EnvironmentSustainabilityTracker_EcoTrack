const energyForm = document.getElementById("energyForm");
const energyProgress = document.getElementById("energyProgress");
const energyChart = document.getElementById("energyChart");
const energyTipsButton = document.getElementById("energyTipsButton");
const energyTips = document.getElementById("energyTips");

let energyData = {
  total: 0,
  goal: 100 // Set energy-saving goal, e.g., 100 kWh
};

const tips = [
  "Use energy-efficient appliances.",
  "Unplug devices when not in use.",
  "Switch to LED lighting.",
  "Use a programmable thermostat to save energy."
];

// Handle form submission and track energy usage
energyForm.addEventListener("submit", (e) => {
  e.preventDefault();
  const amount = parseFloat(document.getElementById("amount").value);
  energyData.total += amount;

  updateProgress();
  updateChart();
});

// Update the progress bar to reflect energy usage toward the goal
function updateProgress() {
  const progressPercent = (energyData.total / energyData.goal) * 100;
  energyProgress.textContent = `Progress: ${progressPercent.toFixed(2)}% of ${energyData.goal} kWh`;
}

// Chart.js for visualizing energy consumption
function updateChart() {
  const ctx = energyChart.getContext("2d");
  new Chart(ctx, {
    type: "line",
    data: {
      labels: ["Day 1", "Day 2", "Day 3"],
      datasets: [
        {
          label: "Energy Usage (kWh)",
          data: [30, 50, energyData.total], // Sample data
          borderColor: "blue",
          borderWidth: 2
        }
      ]
    },
    options: {
      scales: {
        y: { beginAtZero: true }
      }
    }
  });
}

// Display random energy-saving tips
energyTipsButton.addEventListener("click", () => {
  const randomTip = tips[Math.floor(Math.random() * tips.length)];
  energyTips.textContent = randomTip;
});

