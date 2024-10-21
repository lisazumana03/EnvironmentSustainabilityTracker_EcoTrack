
const waterForm = document.getElementById("waterForm");
const waterProgress = document.getElementById("waterProgress");
const waterChart = document.getElementById("waterChart");
const waterTipsButton = document.getElementById("waterTipsButton");
const waterTips = document.getElementById("waterTips");

let waterData = {
  total: 0,
  goal: 100 // Set a daily water usage goal, e.g., 100 liters
};

const waterTipsList = [
  "Fix leaky faucets to save water.",
  "Take shorter showers.",
  "Use a broom to clean driveways instead of a hose.",
  "Install low-flow showerheads."
];

// Handle form submission and track water usage
waterForm.addEventListener("submit", (e) => {
  e.preventDefault();
  const amount = parseFloat(document.getElementById("amount").value);
  waterData.total += amount;

  updateWaterProgress();
  updateWaterChart();
});

// Update the progress bar to reflect water usage toward the goal
function updateWaterProgress() {
  const progressPercent = (waterData.total / waterData.goal) * 100;
  waterProgress.textContent = `Progress: ${progressPercent.toFixed(2)}% of ${waterData.goal} liters`;
}

// Chart.js for visualizing water consumption
function updateWaterChart() {
  const ctx = waterChart.getContext("2d");
  new Chart(ctx, {
    type: "line",
    data: {
      labels: ["Day 1", "Day 2", "Day 3"], // You can update this dynamically based on the days
      datasets: [
        {
          label: "Water Consumption (Liters)",
          data: [10, 20, waterData.total], // Replace with dynamic data
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

// Display random water conservation tips
waterTipsButton.addEventListener("click", () => {
  const randomTip = waterTipsList[Math.floor(Math.random() * waterTipsList.length)];
  waterTips.textContent = randomTip;
});
